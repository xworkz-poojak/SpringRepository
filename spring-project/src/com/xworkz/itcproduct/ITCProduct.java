package com.xworkz.itcproduct;

public class ITCProduct {
	
	private String name;
	private String type;
	private String expiredate;
	
	public ITCProduct(String name) {
		super();
		this.name = name;
	}
	
	
	
	public void setType(String type) {
		this.type = type;
	}
	
	public void setExpiredate(String expiredate) {
		this.expiredate = expiredate;
	}
	
	public void displayDetails(){
		System.out.println("method invoked");
		System.out.println(this.name);
		System.out.println(this.type);
		System.out.println(this.expiredate);

		
	}

}
