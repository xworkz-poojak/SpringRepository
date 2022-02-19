package com.xworkz.spring.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.spring.springcons.ArmyComponent;

public class ArmyTester {

	public static void main(String[] args) {
		String xmlFileName="spring-con.xml";
		ApplicationContext context=new ClassPathXmlApplicationContext(xmlFileName);
		
		ArmyComponent refOfArmComponent=context.getBean(ArmyComponent.class);
		
	System.out.println(refOfArmComponent.getCountryName());
		
		String name=refOfArmComponent.setCountryName("IndianArmy");
		System.out.println(name);
		String type=refOfArmComponent.setType("Bold");
		System.out.println(type);
		
	}
}
