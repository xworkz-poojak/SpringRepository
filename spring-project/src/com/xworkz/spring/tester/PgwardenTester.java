package com.xworkz.spring.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.spring.component.PgComponenet;

public class PgwardenTester {
	public static void main(String[] args) {
		
		ApplicationContext container=new ClassPathXmlApplicationContext("injection.xml");
		PgComponenet component=container.getBean(PgComponenet.class);
		component.serveFood();
	}

}
