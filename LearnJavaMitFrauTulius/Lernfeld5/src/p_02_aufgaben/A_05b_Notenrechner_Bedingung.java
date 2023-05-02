package p_02_aufgaben;

import java.text.DecimalFormat;
import java.util.Scanner;

/* Aufgabenstellung: Durchschnittsnote
 * Der Benutzer soll nach Eingabe seines Wohnorts aufgefordert werden drei Temperaturen einzugeben.
 * Die Durchschnittstemperatur soll berechnet und dem Benutzer angezeigt werden.
 */
public class A_05b_Notenrechner_Bedingung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		// Variablen
		String fach;
		double klausur1;
		double klausur2;
		double klausur3;
		double durchschnitt;

		int anzahl = 3;

		// Hilfsklassen
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");

		// Benutzereingaben abfragen
		System.out.println("Fach: ");
		fach = scan.nextLine();

		System.out.println("Klausur 1:");
		klausur1 = scan.nextDouble();
		System.out.println("Klausur 2:");
		klausur2 = scan.nextDouble();
		System.out.println("Klausur 3:");
		klausur3 = scan.nextDouble();

		// Scanner schliessen
		scan.close();

		// Berechnung durchführen
		durchschnitt = (klausur1 + klausur2 + klausur3) / anzahl;

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
