package com.cox.cobra.model;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Customers")
@XmlAccessorType(XmlAccessType.FIELD)
public class Customers implements Serializable {
	
	private static final long serialVersionUID = -8542620283144892811L;
	
	@XmlElement(name="Customer")
	private List<Customer> customers = null;

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
	
}
