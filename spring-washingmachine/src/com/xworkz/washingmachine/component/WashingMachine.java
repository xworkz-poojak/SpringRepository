package com.xworkz.washingmachine.component;

public class WashingMachine {
	
	private String companyName;
	private float capacity;
	private MotorComponent motor;
	private PowerComponent power;
	
	
	public WashingMachine(String companyName, float capacity, MotorComponent motor, PowerComponent power) {
		super();
		this.companyName = companyName;
		this.capacity = capacity;
		this.motor = motor;
		this.power = power;
	}


	public void wash(){
		System.out.println("invoked");
		this.motor.rotate();
	}
	
	

}
