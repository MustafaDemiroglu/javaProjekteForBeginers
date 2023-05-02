package p_01_demo;

public class D_05_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int anzahlelemente = 874 ;
		// Datentyp
		String[] benutzer;
		//  Anzahl der Elemente muss zu Beginn festgelegt werden und ist nicht veränderbar 
		benutzer = new String[4];
		
		benutzer [0] = "Hansi";
		benutzer [1] = "Gisela";
		benutzer [2] = "Horst" ;
		benutzer [3] = "Elsa";
		// wird zu Fehler führen
		// benutzer [4] = "Sabine";
		
		System.out.println(benutzer[0]);
		
		benutzer[0] = "Hans christian";
		System.out.println(benutzer[0]);
		
		// Fehler weil falscher Datentyp
		// benutzer [0] = 12 ; 
		
		// Länge des Arrys abfragen (Anzahl der Elemente)
		int anzahl = benutzer.length;
		System.out.println("Anzahl der elemente: " + anzahl);
		
		System.out.println(benutzer[0]);
		System.out.println(benutzer[1]);
		System.out.println(benutzer[2]);
		System.out.println(benutzer[3]);
		
		
		// Array über eine Schleife durchlaufen
		// i=i+1; --> i++
		// for leitet schleife ein
		// i ist die Zählvariable  startet bei 0
		// i<array.length    --> Abbruchbedingung
		// i++ erhöht die Zählvariable bei jeden durchlauf um 1
		System.out.println("Ausgabe über eine Schleife");
		for (int i=0; i<4 ; i++) {
			System.out.println(benutzer[i]);
		}

	}

}
