package p_01_demo;

public class D_02_Variablen {
	
	public static void main (String [] args) {
		/*
		// TODO 
		// int Integer Gazzahl
		// double Fließkommazahl Achtung .kein,
		
		// Deklarieren
		double preis;
		
		// Initalisieren erste Wrtzuweisung
		preis = 5.95;
		
		int menge = 3;
		
		*/
		
		// Wiederholung 
		// Variable: Speicher für einen bestimmten Wert
		// Variable benennen -> Deklaration
		int anzahl ;
		// 1. Wertzuweisung -> initialiesierung
		anzahl = 5 ;
		
		// Stringverkettung bei der Ausgabe
		System.out.println ( "Die Anzahl ist: " + anzahl);
		
		String text = "Die Anzahl ist: ";
		System.out.println(text+anzahl);
		
		
		double preis = 5.95 ;
		double summe = anzahl * preis ;
		System.out.println("Rechnungsbetrag: " + summe);
		
		// wird immer den letzten Daten genommen
		anzahl = 7;											// hier ist die letzte Wert 
		summe = anzahl * preis ;
		System.out.println("Rechnungsbetrag: " + summe);
		
		anzahl = anzahl + 2; 								// oder gleich anzahl+ = 2;
		anzahl = anzahl -3 ;								// oder gleich anzahl- =3;
		
		short miniZahl = 5;
		System.out.println("Short: " + miniZahl);
		miniZahl = 32767 ;
		System.out.println("Maximale short Wert ist : " + miniZahl);
		System.out.println ("Maximale Lon Wert ist : " + Long.MAX_VALUE);
		
		char buchstabe = 'a';
		System.out.println(buchstabe);
		char b2 = 102;
		System.out.println(b2);
		
	}
}
