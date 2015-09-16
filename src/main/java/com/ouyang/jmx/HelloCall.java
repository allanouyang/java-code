package com.ouyang.jmx;

import javax.management.MBeanServerConnection;
import javax.management.ObjectName;
import javax.management.remote.JMXConnector;
import javax.management.remote.JMXConnectorFactory;
import javax.management.remote.JMXServiceURL;

public class HelloCall {

	public static void main(String[] args) throws Exception {
		  
		JMXServiceURL url = new JMXServiceURL("service:jmx:rmi:///jndi/rmi://localhost:8888/server");
		JMXConnector jmxc = JMXConnectorFactory.connect(url, null);
		MBeanServerConnection msc = jmxc.getMBeanServerConnection();
		ObjectName mbeanName = new ObjectName("ouyang:name=HelloWorld");
        // 订阅Notification
		//msc.addNotificationListener(mbeanName, this, null, null);
		Object returnValue = msc.invoke(mbeanName, "sayHello", new Object[]{"my name is ouyang"}, new String[]{"java.lang.String"});
		System.out.println("调用成功!");
	}
}
