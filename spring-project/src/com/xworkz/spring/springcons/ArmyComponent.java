package com.xworkz.spring.springcons;

public class ArmyComponent {
	
	private String countryName;
	private String type;
	private String strength;
	
	public ArmyComponent(String countryName) {
		super();
		this.countryName = countryName;
	}
	
	public String getCountryName() {
		return countryName;
	}
	
public String setCountryName(String countryName) {
	return this.countryName = countryName;
}

public String setType(String type) {
	return this.type = type;
}
}
