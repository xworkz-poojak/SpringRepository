package com.xworkz.spring.tester;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.spring.springcons.ClubComponent;

public class ClubTester {

	public static void main(String[] args) {
		String xmlFileName="spring-con.xml";
		ApplicationContext spring=new ClassPathXmlApplicationContext(xmlFileName);
		
		System.out.println(spring.getBeanDefinitionCount());
		
		System.out.println(Arrays.toString(spring.getBeanDefinitionNames()));
		
		ClubComponent refOfClub=spring.getBean("clubComponent1",ClubComponent.class);
		
		String refOfString=spring.getBean(String.class);
	System.out.println(refOfString);
	}
}
