package p01_demo;

public class Auto {
	
	// Attribute
	private String hersteller = "BMW";
	
	// Methoden
	void sagHersteller(){
		System.out.println("Hersteller : " + hersteller);
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto meinAuto = new Auto();
		meinAuto.fahren();
		meinAuto.sagHersteller() ;
		
		System.out.println("----------------------");
		
		Auto herbi = new Auto ("Corsa") ;
		herbi.sagHersteller();
		herbi.hersteller = "MB";
		meinAuto.sagHersteller();
	}

}
