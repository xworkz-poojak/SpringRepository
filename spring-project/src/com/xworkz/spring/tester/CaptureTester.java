package com.xworkz.spring.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.spring.component.CameraComponent;

public class CaptureTester {
	
	public static void main(String[] args) {
		 String xmlFileName="spring-first.xml";
		 ApplicationContext spring=new ClassPathXmlApplicationContext(xmlFileName);
		 
		 CameraComponent refOfCameraComponent = spring.getBean(CameraComponent.class);
		 refOfCameraComponent.Capture("image");
	}

}
