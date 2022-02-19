package com.xworkz.spring.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.spring.springcons.ModemComponent;

public class ModemTester {

	public static void main(String[] args) {
		String xmlFileName="spring-con.xml";
		ApplicationContext container= new ClassPathXmlApplicationContext(xmlFileName);
		
		ModemComponent refOfModem=container.getBean(ModemComponent.class);
		System.out.println(refOfModem.getCompanyName());
		
	}
}
