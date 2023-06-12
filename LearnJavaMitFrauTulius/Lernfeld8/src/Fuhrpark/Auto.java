package Fuhrpark;

public class Auto {
	
	// Attribut(e)
	private String hersteller = "VW" ;
	private String farbe = "schwarz" ;
	private int kilometerstand = 0 ;
	
	
	// Methode(n)
	// automatisch generierte getter und setter 
	public String getFarbe() {
		return farbe;
	}
	
	public void setFarbe(String farbe) {
		System.out.println("Auto wird umlackiert");
		this.farbe = farbe;
	}
	
	// eigene Methoden
	public void fahren (int kilometer) {
		// welcher kilometer
		// Kilometerstabd aktualisieren
		kilometerstand = kilometerstand+kilometer;
		// kilometerstand+=kilometer;
	}
	
	public void sagHersteller() {
		System.out.println(hersteller);
	}
	
	
	
	// Konstruktor(en)
	public Auto() {
		System.out.println("Standardkonstruktor ");
	}
	
	public Auto (String hersteller) {
		this.hersteller= hersteller ;
		System.out.println("Konstruktor 1");
	}
	
	public Auto (String hersteller, String farbe) {
		this.hersteller = hersteller ;
		this.farbe = farbe ;
		System.out.println("Konstruktor 2");
	} 

}
