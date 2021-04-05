package com.xworkz.spring.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.spring.springcons.RocketComponent;

public class RocketTester {
	
	public static void main(String[] args) {
		String xmlFileName="spring-con.xml";
		ApplicationContext context=new ClassPathXmlApplicationContext(xmlFileName);
	 
		RocketComponent refOfRocketComponent=context.getBean(RocketComponent.class);
		System.out.println(refOfRocketComponent.getCountry());
		System.out.println(refOfRocketComponent.getFuelType());
	
	}

}
