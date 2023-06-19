 package Fuhrpark;

public class Auto {
	
	// Attribut(e)
	private String hersteller = "VW" ;
	private String farbe = "schwarz" ;
	
	// wenn keine modifierangeben -- package --- alle Klassen im gleihen Paket
	int kilometerstand = 0 ;
	
	// Verbunfung Assoziation
	Fahrer fahrer;
	
	// Verbindung Aggegration "locher"
	// motor kann unabhängig von Auto existieren
	Motor motor;
	
	
	public void fahren ( int kilometer, Fahrer fahrer) {
		// Kilometer dem Fahrer anrechnen
		fahrer.setGefahreneKilometer(kilometer);
		// Kiloketer die Auto nagerechnet werden
		kilometerstand = kilometerstand + kilometer ;
	
		// prüfen ob Fahrer aktuell ein Fahrzeug fahren kann
		// fahrer.isFahrStatus()----> liefert true oder false
		// Hinweis : fahrer kann gerade nicht
		// parken() ---> fahrStatus = true
	}
	
	// Methode(n)
	// automatisch generierte getter und setter 
	public void getFarbe() {
		System.out.println("Ich bin " + farbe );
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
	
	public Auto (Motor motor) {
		this.motor = motor ;
		System.out.println("Konstruktor Auto mit Motor");
	}

}
