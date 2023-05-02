package p_02_aufgaben;

import java.text.DecimalFormat;
import java.util.Scanner;

/* Aufgabenstellung: Durchschnittstemperatur
 * Der Benutzer soll nach Eingabe seines Wohnorts aufgefordert werden drei Temperaturen einzugeben.
 * Die Durchschnittstemperatur soll berechnet und dem Benutzer angezeigt werden.
 */

public class A_04c_Temperatur_Array {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Variablen
		String ort;
		double[] temperaturen = new double[3];
		double durchschnitt;
		
		int anzahl = 3;

		// Hilfsklassen
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");

		// Benutzereingaben abfragen
		System.out.println("Wohnort: ");
		ort = scan.nextLine();

		System.out.println("Temperatur 1:");
		temperaturen[0] = scan.nextDouble();
		System.out.println("Temperatur 2:");
		temperaturen[1] = scan.nextDouble();
		System.out.println("Temperatur 3:");
		temperaturen[2] = scan.nextDouble();


		// Scanner schliessen
		scan.close();

		// Berechnung durchführen
		durchschnitt = (temperaturen[0] + temperaturen[1] + temperaturen[2])/anzahl;


		// Ausgabe
		System.out.println("In " + ort + " war die Durschnittstemperatur der letzten " + anzahl + " Tage " +df.format(durchschnitt) + " Grad C°.");
	
		// Erweiterung um Bedingung
		if (durchschnitt < 20.0) {
			System.out.println("Noch kein Sommer");
		} else {
			System.out.println("Zeit für T-Shirt");
		}
	}

}
