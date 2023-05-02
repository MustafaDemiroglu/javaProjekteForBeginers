package p_02_aufgaben;

import java.text.DecimalFormat;
import java.util.Scanner;

/* Aufgabenstellung: Durchschnittsnote
 * Der Benutzer soll nach Eingabe seines Wohnorts aufgefordert werden drei Temperaturen einzugeben.
 * Die Durchschnittstemperatur soll berechnet und dem Benutzer angezeigt werden.
 */
public class A_05c_Noten_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		// Variablen
		String fach;
		double[] klausuren = new double[3];
		double durchschnitt;

		int anzahl = 3;

		// Hilfsklassen
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");

		// Benutzereingaben abfragen
		System.out.println("Fach: ");
		fach = scan.nextLine();

		System.out.println("Klausur 1:");
		klausuren[0] = scan.nextDouble();
		System.out.println("Klausur 2:");
		klausuren[1] = scan.nextDouble();
		System.out.println("Klausur 3:");
		klausuren[2] = scan.nextDouble();

		// Scanner schliessen
		scan.close();

		// Berechnung durchführen
		durchschnitt = (klausuren[0] + klausuren[1] + klausuren[2])/anzahl;

		// Ausgabe

		System.out.println("In " + fach + " war die Durschnittsnote der letzten " + anzahl + " Klausuren "
				+ df.format(durchschnitt) + ".");

		// Erweiterung um Bedingung
		if (durchschnitt < 2.0) {
			System.out.println("Sie haben sehr gute Leistungen erbracht");
		} else {
			System.out.println("Sie sollten noch etwas lernen");
		}

	}
}
