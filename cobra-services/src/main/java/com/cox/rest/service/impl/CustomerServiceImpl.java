package com.cox.rest.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.cox.cobra.model.Customer;
import com.cox.cobra.model.Customers;
import com.cox.cobra.model.Network;
import com.cox.cobra.model.Product;
import com.cox.rest.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {

	List<Customer> customers = new ArrayList<Customer>();
	Customers custs = null;

	@Override
	public Customers getCustomerList() {
		System.out.println("getCustomerList...");
		customers.clear();
		Customer cust1 = new Customer();
		cust1.setKey(1l);
		Product prod1 = new Product();
		prod1.setCode("614");
		prod1.setBillTypeCode("S");
		prod1.setTypeCode("R");
		List<Network> networks = new ArrayList<>();
		Network net1 = new Network();
		net1.setProgramCostCode("MCD");
		networks.add(net1);
		prod1.setNetworks(networks);
		List<Product> products = new ArrayList<>(1);
		products.add(prod1);
		cust1.setProducts(products);

		Customer cust2 = new Customer();
		cust2.setKey(2l);
		Product prod2 = new Product();
		prod2.setCode("650");
		List<Product> products2 = new ArrayList<>(1);
		products2.add(prod2);
		cust2.setProducts(products2);

		Customer cust3 = new Customer();
		cust3.setKey(3l);
		cust3.setProducts(products);

		Customer cust4 = new Customer();
		cust4.setKey(4l);

		Customer cust5 = new Customer();
		cust5.setKey(5l);

		Customer cust6 = new Customer();
		cust6.setKey(6l);

		customers.add(cust1);
		customers.add(cust2);
		customers.add(cust3);
		customers.add(cust4);
		customers.add(cust5);
		customers.add(cust6);
		custs = new Customers();
		custs.setCustomers(customers);

		return custs;
	}
}
