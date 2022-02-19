package com.xworkz.internet.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.internet.chromebrowser.ChromeBrowser;
import com.xworkz.internet.internet.AirtelInternet;

public class Tester {
	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
//		AirtelInternet airtelInternet=context.getBean(AirtelInternet.class);
//		airtelInternet.connect();
		
		ChromeBrowser chromeBrowser=context.getBean(ChromeBrowser.class);
		chromeBrowser.surf();
		
	}

}
