package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
		JavaCollection javaCollection = (JavaCollection) applicationContext.getBean("javaCollection");
		
		javaCollection.getAddressList();
		javaCollection.getAddressSet();
		javaCollection.getAddressMap();
		javaCollection.getAddressProp();
		
		((AbstractApplicationContext)applicationContext).close();
		
	}

}
