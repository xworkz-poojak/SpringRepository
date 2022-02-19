package com.xworkz.internet.internet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class JioInternet implements Internet{
	
 private Internet internet;
 //@Autowired
 public JioInternet(Internet internet) {
	 this.internet=internet;
}
	@Override
	public void connect() {
System.out.println("connecting using jio");		
	}
	public Internet getInternet() {
		return internet;
	}
	public void setInternet(Internet internet) {
		this.internet = internet;
	}

	
}
