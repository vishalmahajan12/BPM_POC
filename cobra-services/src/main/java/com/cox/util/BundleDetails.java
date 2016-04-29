package com.cox.util;

import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import javax.management.InstanceNotFoundException;
import javax.management.IntrospectionException;
import javax.management.MBeanException;
import javax.management.MBeanServerConnection;
import javax.management.MalformedObjectNameException;
import javax.management.ObjectName;
import javax.management.ReflectionException;
import javax.management.openmbean.CompositeDataSupport;
import javax.management.openmbean.TabularDataSupport;
import javax.management.remote.JMXConnector;
import javax.management.remote.JMXConnectorFactory;
import javax.management.remote.JMXServiceURL;

public class BundleDetails {

	public String bundleVersion() throws IOException, MalformedObjectNameException, InstanceNotFoundException,
			IntrospectionException, ReflectionException, MBeanException, InterruptedException {
		String bundleVr = null;
		JMXServiceURL url = new JMXServiceURL("service:jmx:rmi://localhost:44444/jndi/rmi://localhost:1099/karaf-root");
		Map<String, String[]> enviornmentMap = new HashMap<String, String[]>();
		enviornmentMap.put(JMXConnector.CREDENTIALS, new String[] { "admin", "admin" });
		JMXConnector jmxc = JMXConnectorFactory.connect(url, enviornmentMap);
		MBeanServerConnection mbsc = jmxc.getMBeanServerConnection();

		ObjectName listenerRouteQuery = new ObjectName("osgi.core:type=bundleState,*");
		Set<ObjectName> names = new TreeSet<ObjectName>(mbsc.queryNames(listenerRouteQuery, null));

		//System.out.println("SET VALUESs" + names.toString());
		ObjectName objectName = names.iterator().next();
		TabularDataSupport invoke = (TabularDataSupport) mbsc.invoke(objectName, "listBundles", null, null);
		Collection<Object> values2 = invoke.values();
		for (Object value : values2) {
			if (value.toString().indexOf("cobra-rules") != -1) {
				CompositeDataSupport cds = (CompositeDataSupport) value;
				String loc = (String) cds.get("Location");
				String arr[] = loc.split("/");
				bundleVr = arr[arr.length - 1];
				break;
			}
		}
		return bundleVr;
	}
}