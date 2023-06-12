package p01_demo;

public class Auto {
	
	// Attribute
	private String hersteller = "BMW";
	private String farbe = "rot";
	
	// Methoden
	// getter
	void sagHersteller(){
		System.out.println("Hersteller : " + hersteller);
	}
	
	// setter
	void aendereHersteller(String hersteller) {
		this.hersteller = hersteller ;
	}
	
	public String getFarbe() {
		return farbe;
	}
	
	public void setFarbe (String farbe) {
		this.farbe = farbe ;
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
	
	
	public Auto(String hersteller, String farbe) {
		this.hersteller = hersteller ;
		this.farbe = farbe;
	}

	

}
