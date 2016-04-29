package com.cox.rest.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.cox.cobra.model.Customers;

@Path("/")
public interface RuleService {
	@POST
	@Path("/fireRules/{deploymentId}/{processInstanceId}/{workItemId}")
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.TEXT_XML)
	public String fireRules(Customers customer, @PathParam(value = "deploymentId") String deploymentId,
			@PathParam(value = "processInstanceId") long processInstanceId,
			@PathParam(value = "workItemId") long workItemId);
}
