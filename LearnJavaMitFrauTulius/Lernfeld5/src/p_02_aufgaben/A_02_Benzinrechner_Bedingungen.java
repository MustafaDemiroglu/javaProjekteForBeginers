package p_02_aufgaben;

import java.text.DecimalFormat;
import java.util.Scanner;

public class A_02_Benzinrechner_Bedingungen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
		
				// Variablen deklarieren
				double kilometer;
				double getankteLiter;
				double durchschnitt;
				
				// Hilfklassen 7 - variablen
				Scanner scan = new Scanner (System.in);
				DecimalFormat df = new DecimalFormat ("0.00");
				
				// Benurzereingaben abfragen
				System.out.println("Kilometer eingeben");
				kilometer = scan.nextDouble();
				System.out.println("Getankte Liter eingeben");
				getankteLiter = scan.nextDouble();
				
				// Scanner schließen
				scan.close();
				
				// Berechnung durcführen
				durchschnitt = getankteLiter / kilometer *100;
				
				// Ausgabe
				System.out.println("Getankte Liter: " + df.format(getankteLiter));
				System.out.println("Gefahrene Strecke: " + df.format(kilometer));
				System.out.println("Durchschnittsverbrauch : " + df.format(durchschnitt));
				
				// Bedingungen
				if (durchschnitt > 12) {
					System.out.println("Fahren Sie sparsamer bitte") ;
				} else {
					System.out.println("Sie sind wirklich sehr sparsam ");
				}

	}

}
