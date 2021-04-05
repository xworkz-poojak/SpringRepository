package com.xworkz.spring.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.spring.component.InsurenceComponent;

public class InsurenceTester {
public static void main(String[] args) {
	 String xmlFileName="spring-first.xml";
	 ApplicationContext spring=new ClassPathXmlApplicationContext(xmlFileName);
	 
	InsurenceComponent refOfIns=spring.getBean(InsurenceComponent.class);
	refOfIns.policyName();
	
	System.out.println(spring.getBeanDefinitionCount());
}
}
