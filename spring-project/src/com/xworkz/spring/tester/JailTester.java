package com.xworkz.spring.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.spring.component.JailComponent;

public class JailTester {
public static void main(String[] args) {
	 String xmlFileName="spring-first.xml";
	 ApplicationContext spring=new ClassPathXmlApplicationContext(xmlFileName);
	 
	 JailComponent component=spring.getBean(JailComponent.class);
	 component.punishment();
}
}
