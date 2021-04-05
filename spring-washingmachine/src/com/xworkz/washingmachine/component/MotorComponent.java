package com.xworkz.washingmachine.component;

public class MotorComponent {
	
	private int warrantPeriod;
	
	public void rotate(){
		System.out.println("motor rotataing");
		
	}

	public MotorComponent(int warrantPeriod) {
		super();
		System.out.println("motor constructor created");

		this.warrantPeriod = warrantPeriod;
	}
	
	

}
