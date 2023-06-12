package Fuhrpark;

public class Garage {
	
	public static void  main (String [] args) {
		System.out.println("Willkommen in der Garage");
		
		// Objekte erzeugen
		// Standardkonstruktor
		
		Auto standardAuto = new Auto();
		standardAuto.sagHersteller();
		System.out.println(standardAuto.getFarbe());
		
		standardAuto.setFarbe("lila");
		System.out.println(standardAuto.getFarbe());
		
		Auto auto1 = new Auto ("Peugeot") ;
		auto1.sagHersteller();
		System.out.println(auto1.getFarbe());
		
		Auto auto2 = new Auto("Mercedes", "silber");
		auto2.sagHersteller();
		System.out.println(auto2.getFarbe());
		
		Auto auto3 = new Auto ("Opel"); 
		auto3.sagHersteller();
		
	}
}

