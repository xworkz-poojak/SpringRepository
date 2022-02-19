package com.xworkz.spring.component;

public class InsurenceComponent {
	
	public InsurenceComponent() {
System.out.println("created"+this.getClass().getSimpleName());

	}
public String policyName(){
	System.out.println("invoked policyname");
	return "HDFC";
	
}
}
