package com.xworkz.internet.chromebrowser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.internet.internet.Internet;

@Component
public class ChromeBrowser implements Browser {
	@Autowired
	private Internet internet1;
	public ChromeBrowser(Internet internet1) {
		this.internet1=internet1;
	}

	
//	
//	@Value("broadband")
//	private Internet internet;
//	
//	
//	
//	@Value("firefox")
//	private String name;
//    @Value("2.0")
//	private float Version;
//    
	
	@Override
	public void surf() {
		this.internet1.connect();
		System.out.println("invoked surf");
	}

	
	
}
