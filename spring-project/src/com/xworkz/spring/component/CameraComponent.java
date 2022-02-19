package com.xworkz.spring.component;

public class CameraComponent {
	
	public CameraComponent() {
		System.out.println("camera component invoked");
	}
	
	public void Capture(String what){
		System.out.println("capture invoked");
		System.out.println("Arg :" + what );
	}

}
