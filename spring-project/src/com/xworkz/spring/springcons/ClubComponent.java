package com.xworkz.spring.springcons;

public class ClubComponent {
	
	private String trustName;
	private int totalMembers;
	
	public ClubComponent(String trustName) {
		super();
		System.out.println("creating using parameter conts,args"+trustName);
		this.trustName = trustName;
	}

	public ClubComponent(String trustName, int totalMembers) {
		super();
		System.out.println("creating using parameter const,arg1"+trustName+"arg2"+totalMembers);
		this.trustName = trustName;
		this.totalMembers = totalMembers;
	}

	
	public String getTrustName() {
		return trustName;
	}
	
	
	

}
