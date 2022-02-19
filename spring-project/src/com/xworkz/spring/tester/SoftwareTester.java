package com.xworkz.spring.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.spring.springcons.SoftwareComponent;

public class SoftwareTester {
	
	public static void main(String[] args) {
		String xmlFileName="spring-con.xml";
		ApplicationContext context=new ClassPathXmlApplicationContext(xmlFileName);
		
		SoftwareComponent refOfSoftComponent=context.getBean(SoftwareComponent.class);
		System.out.println(refOfSoftComponent.getName());
		System.out.println(refOfSoftComponent.getVendor());
		
		System.out.println(refOfSoftComponent.setVersion("J 1.5"));
		System.out.println(refOfSoftComponent.setType("Mac"));
	}

}
