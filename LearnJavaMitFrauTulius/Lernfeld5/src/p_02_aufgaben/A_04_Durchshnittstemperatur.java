package p_02_aufgaben;

import java.util.Scanner;
import java.text.DecimalFormat;

public class A_04_Durchshnittstemperatur {
	/* Aufgabenstellung: Durchschnittstemperatur
	* Der Benutzer soll nach Eingabe seines Wohnorts aufgefordert werden
	drei Temperaturen einzugeben.
	* Die Durchschnittstemperatur soll berechnet und dem Benutzer
	angezeigt werden.
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Variable deklarieren
		String ort;
		String name;
		int anzahl = 3;
		double temp1;
		double temp2;
		double temp3;
		
		// Hilfsklassen variablen
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat ("0.00");
		
		// Benutzer ein und ausgaben
		System.out.println("Hallo, Willkommen, wie heißen Sie?");
		name =scan.nextLine();
		System.out.println("aus welcher Stadt sind Sie? " + name);
		ort =scan.nextLine();
		System.out.println("für die durchshnittliche Temperatur von " + ort + " berechnen zu können brauche ich 3 verschiedene Temperatur. Geben sie mir temperatur von erste Tag bitte");
		temp1 =scan.nextDouble();
		System.out.println("jeztt zweite termperatur eingeben " + name);
		temp2 = scan.nextDouble();
		System.out.println("nun die letzte Temperatur eingeben bitte");
		temp3 = scan.nextDouble();
		System.out.println("vielen Dank für die alle Eingaben " + name);
		
		scan.close();
		
		// Berechnung durchschnittliche temperatur
		double durtemp = (temp1 + temp2 + temp3)/anzahl;
		
		// Ausgabe
		System.out.println("Hier ist die durchschnitteliche Temperatur von " + ort + " für von Ihnen gegebenen " + anzahl + " Tagen : " + df.format(durtemp));
		
		// Bedingungen
		
		if (durtemp <20) {
			System.out.println("noch kein Sommer");
		} else {
			System.out.println("Zeit für T-Shirt");
		}
	}

}
