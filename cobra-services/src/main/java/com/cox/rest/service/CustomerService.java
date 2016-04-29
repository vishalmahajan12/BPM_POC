package com.cox.rest.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.cox.cobra.model.Customers;

@Path("/")
public interface CustomerService {
	@GET
	@Path("/getCust")
	@Produces(MediaType.TEXT_XML)
	public Customers getCustomerList();
}
