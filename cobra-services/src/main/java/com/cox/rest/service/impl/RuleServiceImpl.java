package com.cox.rest.service.impl;

import java.io.IOException;
import java.util.Collection;

import javax.management.InstanceNotFoundException;
import javax.management.IntrospectionException;
import javax.management.MBeanException;
import javax.management.MalformedObjectNameException;
import javax.management.ReflectionException;

import org.kie.api.KieBase;
import org.kie.api.definition.KiePackage;
import org.kie.api.definition.rule.Rule;
import org.kie.api.runtime.KieSession;

import com.cox.cobra.model.Customer;
import com.cox.cobra.model.Customers;
import com.cox.cobra.model.Network;
import com.cox.cobra.model.Product;
import com.cox.rest.client.RestClientSimple;
import com.cox.util.BundleDetails;
import com.cox.util.KieModel;

public class RuleServiceImpl {

	private static final String BPMS_PWD = "admin@123";
	private static final String BPMS_USER = "bpmsAdmin";
	private KieModel kieModel = null;
	private BundleDetails bundleDetails = null;

	public BundleDetails getBundleDetails() {
		return bundleDetails;
	}

	public void setBundleDetails(BundleDetails bundleDetails) {
		this.bundleDetails = bundleDetails;
	}

	public KieModel getKieModel() {
		return kieModel;
	}

	public void setKieModel(KieModel kieModel) {
		this.kieModel = kieModel;
	}

	public String fireRules(final org.apache.cxf.message.MessageContentsList list)
			throws MalformedObjectNameException, InstanceNotFoundException, IntrospectionException, ReflectionException,
			MBeanException, IOException, InterruptedException {
		new Thread(new Runnable() {
			@Override
			public void run() {
				Customers customers = (Customers) list.get(0);
				String deploymentId = (String) list.get(1);
				String processInstanceId = String.valueOf(list.get(2));
				String workItemId = String.valueOf(list.get(3));
				System.out.println("deploymentId : " + deploymentId + ", processInstanceId : " + processInstanceId
						+ ", workItemId : " + workItemId + " customers : " + customers);
				getCustomerAsync(customers);
				try {
					String result = new RestClientSimple(BPMS_USER, BPMS_PWD).postRequest(customers, deploymentId,
							workItemId, bundleDetails.bundleVersion());
					System.out.println("Completed workitem result = " + result);
				} catch (Exception e) {
					e.printStackTrace(System.out);
				}
			}
		}).start();

		return "OK. Request Received /" + bundleDetails.bundleVersion();
	}

	public void getCustomerAsync(Customers customers) {
		KieBase kbase = kieModel.getKieBase();
		Collection<KiePackage> kiePackages = kbase.getKiePackages();
		for (KiePackage kiePackage : kiePackages) {
			System.out.println("Package: " + kiePackage.getName());
			Collection<Rule> rules = kiePackage.getRules();
			for (Rule rule : rules) {
				System.out.println("Rule: " + rule.getName());
			}
		}
		KieSession ksession = kbase.newKieSession();
		// ksession.addEventListener(new DebugAgendaEventListener());
		for (Customer customer : customers.getCustomers()) {
			ksession.insert(customer);
			ksession.getAgenda().getAgendaGroup("customer_derived_product").setFocus();
			int fireCount = ksession.fireAllRules();
			System.out.println(fireCount + " customer rule(s) fired for customer " + customer);
			if (customer.getProducts() != null) {
				for (Product product : customer.getProducts()) {
					ksession.insert(product);
					ksession.getAgenda().getAgendaGroup("product_customer_categorization").setFocus();
					fireCount = ksession.fireAllRules();
					System.out.println(fireCount + " product rule(s) fired for customer " + customer);
					if (product.getNetworks() != null) {
						for (Network network : product.getNetworks()) {
							ksession.insert(network);
							ksession.getAgenda().getAgendaGroup("network_network_categorization").setFocus();
							fireCount = ksession.fireAllRules();
							System.out.println(fireCount + " network rule(s) fired for customer " + customer);
						}
					}
				}
			}
		}
		for (Customer customer : customers.getCustomers()) {
			System.out.println(customer.getKey() + " - " + customer.getProducts());
		}
		ksession.dispose();
		ksession.destroy();
	}
}
