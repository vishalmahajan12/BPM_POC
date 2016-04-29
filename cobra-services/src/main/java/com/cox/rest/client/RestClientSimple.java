package com.cox.rest.client;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.UsernamePasswordCredentials;
import org.apache.commons.httpclient.auth.AuthScope;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;

import com.cox.cobra.model.Customers;

public class RestClientSimple {

	protected static final String BASE_URL = "http://localhost:8080/business-central/rest/runtime/";
	protected static final String AUTH_URL = BASE_URL + "org.kie.workbench.KIEWebapp/j_security_check";

	public static String username;
	public static String password;

	public RestClientSimple(String u, String p) {
		username = u;
		password = p;
	}

	public String getDataFromService(String urlpath, String method, Map<String, String> params) throws Exception {

		HttpClient httpclient = new HttpClient();
		httpclient.getState().setCredentials(new AuthScope("localhost", 8080),
				new UsernamePasswordCredentials(username, password));

		HttpMethod theMethod = null;
		StringBuffer sb = new StringBuffer();

		if ("GET".equalsIgnoreCase(method)) {
			theMethod = new GetMethod(urlpath);
		} else if ("POST".equalsIgnoreCase(method)) {
			theMethod = new PostMethod(urlpath);
			theMethod.addRequestHeader("Content-Type", "text/xml");
			if (params != null) {
				List<NameValuePair> NameValuePairList = new ArrayList<NameValuePair>();
				for (String key : params.keySet()) {
					NameValuePairList.add(new NameValuePair(key, params.get(key)));
				}
				((PostMethod) theMethod).setQueryString(NameValuePairList.toArray(new NameValuePair[0]));
				System.out.println("param added");
			}
		}

		try {
			int result = httpclient.executeMethod(theMethod);
			System.out.println("HTTP Response Code = " + result);
			sb.append(theMethod.getResponseBodyAsString());
			String rawResult = sb.toString();
			return rawResult;

		} catch (Exception e) {
			throw e;
		} finally {
			theMethod.releaseConnection();
		}

	}

	public String postRequest(Customers customers, String deploymentId, String workItemId, String bundleVersion)
			throws Exception {
		Map<String, String> params = new HashMap<String, String>();
		File tempFile = File.createTempFile("temp", ".xml");
		JAXBContext jaxbContext = JAXBContext.newInstance(Customers.class);
		Marshaller m = jaxbContext.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, false);
		m.marshal(customers, tempFile);
		BufferedReader br = new BufferedReader(new FileReader(tempFile));

		String customersXML = "";
		String line = null;
		while ((line = br.readLine()) != null) {
			customersXML += line;
		}
		System.out.println("cust xml = " + customersXML);
		br.close();
		tempFile.delete();
		params.put("map_Result", customersXML);
		params.put("map_Version", bundleVersion);
		String url = BASE_URL + deploymentId + "/workitem/" + workItemId + "/complete";
		System.out.println("url " + url);
		String response = getDataFromService(url, "POST", params);
		return response;
	}

}