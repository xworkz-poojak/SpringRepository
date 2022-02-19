package com.xworkz.spring.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.itcproduct.ITCProduct;

public class ITCTester {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring-itc.xml");
	ITCProduct product=context.getBean(ITCProduct.class);
	product.displayDetails();
	}
}
