package com.ouyang.jmx;

import java.rmi.registry.LocateRegistry;

import javax.management.MBeanServer;
import javax.management.MBeanServerFactory;
import javax.management.ObjectName;
import javax.management.remote.JMXConnectorServer;
import javax.management.remote.JMXConnectorServerFactory;
import javax.management.remote.JMXServiceURL;

import com.sun.jdmk.comm.HtmlAdaptorServer;

public class HelloAgent {

	public static void main(String[] args) throws Exception {
		MBeanServer server = MBeanServerFactory.createMBeanServer();
//		MBeanServer server =  ManagementFactory.getPlatformMBeanServer();
		ObjectName helloName = new ObjectName("ouyang:name=HelloWorld");
        server.registerMBean(new Hello(), helloName);
        Thread.sleep(Long.MAX_VALUE);

//        ObjectName adapterName = new ObjectName("HelloAgent:name=htmladapter,port=8082");
//        HtmlAdaptorServer adapter = new HtmlAdaptorServer();
//        server.registerMBean(adapter, adapterName);
//        server.invoke(helloName, "sayHello", new Object[] { "Ouyang"}, new String[] {"java.lang.String"});
//        adapter.start();
        

//        LocateRegistry.createRegistry(8888);
//        JMXServiceURL url = new JMXServiceURL("service:jmx:rmi:///jndi/rmi://localhost:8888/server");  
//        JMXConnectorServer cs = JMXConnectorServerFactory.newJMXConnectorServer(url, null, server);  
//        System.out.println("....................begin rmi start.....");  
//        cs.start();  
//        System.out.println("....................rmi start....."); 
	}
}
