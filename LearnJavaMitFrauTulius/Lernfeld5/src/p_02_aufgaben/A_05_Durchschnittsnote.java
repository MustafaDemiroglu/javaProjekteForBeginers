package p_02_aufgaben;

import java.util.Scanner;
import java.text.DecimalFormat;

public class A_05_Durchschnittsnote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Aufgabenstellung: Durchschnittsnote
		* Der Benutzer soll nach Eingabe seines Wohnorts aufgefordert werden
		drei Temperaturen einzugeben.
		* Die Durchschnittsnote soll berechnet und dem Benutzer angezeigt
		werden.
		*/
		
		// Variable deklarieren
		int anzahl =3;
		String fach;
		double klausur1;
		double klausur2;
		double klausur3;
		
		// hilfsklassen
		Scanner scan = new Scanner (System.in); 
		DecimalFormat df = new DecimalFormat("0.00");
		
		
		//benutzer eingaben und ausgaben
		System.out.println("welche Fach: ");
		fach = scan.nextLine();
		System.out.println("erste Klausur : ");
		klausur1 = scan.nextDouble();
		System.out.println("zweite Klausur : ");
		klausur2 = scan.nextDouble();
		System.out.println("dritte Klausur : ");
		klausur3 = scan.nextDouble();
		
		scan.close();
		
		//Berechnung der Duchschnittenote
		double durNote = (klausur1+klausur2+klausur3)/anzahl;
		
		// Ausgabe
		System.out.println("Durchschnittliche " + fach + " note : " + df.format(durNote));
				
		// Bedingungen
		if (durNote<2.0) {
			System.out.println("Sehr gute Lesitungen erbracht");
		} else {
			System.out.println("Noch etwas lernen");
		}
		
	}

}
