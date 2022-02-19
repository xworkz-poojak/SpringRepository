package com.xworkz.spring.component;

public class PgComponenet {

	private String ownerName;
	
	private WardenComponent warden;
	
	public PgComponenet() {

	System.out.println("created"+this.getClass().getSimpleName());}
	
	public void serveFood(){
		System.out.println("invoked serve food");
	this.warden.arrangeFood();
	}
	
	public void setOwnerName(String ownerName) {
		System.out.println("invoked setOwnerName");
		this.ownerName = ownerName;
	}
	
	public void setWarden(WardenComponent warden) {
	System.out.println("invoked setWarden"+warden);
		this.warden = warden;
	
	}
}
