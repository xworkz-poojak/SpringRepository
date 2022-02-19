package com.xworkz.internet.internet;

import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AirtelInternet implements Internet{
@Autowired
	private EntityManagerFactory entityManagerFactory;
	public AirtelInternet(EntityManagerFactory entityManagerFactory) {
		this.entityManagerFactory=entityManagerFactory;
	}
	
	@Value("xworkz")
	private String vendor;
	@Value("1000")
	private int costPerMonth;
	
	
	
	@Override
	public void connect() {
System.out.println("connecting using airtel");		
	}



	



	public String getVendor() {
		return vendor;
	}



	public void setVendor(String vendor) {
		this.vendor = vendor;
	}



	public int getCostPerMonth() {
		return costPerMonth;
	}



	public void setCostPerMonth(int costPerMonth) {
		this.costPerMonth = costPerMonth;
	}

	
	
}
