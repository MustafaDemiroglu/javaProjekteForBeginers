package p01_demo;

public class Auto {
	
	// Attribute
	private String hersteller = "BMW";
	
	// Methoden
	// getter
	void sagHersteller(){
		System.out.println("Hersteller : " + hersteller);
	}
	
	// setter
	void aendereHersteller(String hersteller) {
		this.hersteller = hersteller ;
	}
	
	void fahren() {
		System.out.println("Ich fahre! ");
	}
	
	// Konstruktor
	public Auto() {
		
	}
	
	public Auto(String hersteller) {
		this.hersteller = hersteller ;
	}

	

}
