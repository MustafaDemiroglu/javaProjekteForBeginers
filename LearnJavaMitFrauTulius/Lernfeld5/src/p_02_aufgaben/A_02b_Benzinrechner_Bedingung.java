package p_02_aufgaben;

import java.text.DecimalFormat;
import java.util.Scanner;

/* Aufgabenstellung:
 * Ein Benutzer soll aufgefordert werden die gefahrene Strecke in Kilometern und die getankten Liter Kraftstoff einzugeben.
 * Aus den Angaben soll der Durchschnittsverbrauch pro 100 Kilometer berechnet werden und dem Benutzer angezeigt werden
 */
public class A_02b_Benzinrechner_Bedingung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double liter;
		double strecke;
		double durchschnitt;
		Scanner scan = new Scanner(System.in);
		
		//Werte mit zwei Nachkommastellen ausgeben --> Format definieren und spaeter auf Ausgabe anwenden mit df.format(variable)
		DecimalFormat df = new DecimalFormat("0.00");
		
		// Benutzereingaben abfragen
		System.out.println("Kilometer eingeben:");
		strecke = scan.nextDouble();
		System.out.println("getankte Liter eingeben:");
		liter = scan.nextDouble();
		
		// Scanner schliessen
		scan.close();
		
		// Berechnung Durchschnitzt
		durchschnitt = liter / strecke * 100;
				
		// Werte auf Konsole ausgeben
		System.out.println("verbrauchter Kraftstoff: " + df.format(liter));
		System.out.println("gefahrene Strecke: " + df.format(strecke));
		System.out.println("Der Durchschnittsverbrauch ist "
				+ df.format(durchschnitt) + " l/100 km");
		
		// Erweiterung um Bedingung
		if(durchschnitt > 12) {
			System.out.println("Bitte sparsamer fahren");
		}
		
	}

}
