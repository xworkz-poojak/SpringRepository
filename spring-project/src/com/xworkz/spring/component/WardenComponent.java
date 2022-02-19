package com.xworkz.spring.component;

public class WardenComponent {

	private String name;

	public WardenComponent() {
		System.out.println("created" + this.getClass().getSimpleName());
	}

	public void arrangeFood() {
		System.out.println("invokrd");
	}

	public void setName(String name) {
		System.out.println("invoked setName" + name);
		this.name = name;
	}
}
