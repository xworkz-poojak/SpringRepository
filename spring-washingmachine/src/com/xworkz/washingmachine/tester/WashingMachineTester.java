package com.xworkz.washingmachine.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.washingmachine.component.WashingMachine;

public class WashingMachineTester {
	public static void main(String[] args) {
		ApplicationContext container=new ClassPathXmlApplicationContext("spring.xml");
		WashingMachine washingMachine=container.getBean(WashingMachine.class);
		washingMachine.wash();
	}

}
