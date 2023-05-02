package p_02_aufgaben;

import java.text.DecimalFormat;
import java.util.Scanner;

/* Aufgabenstellung: BMI-Rechner 
 * Der Benutzer soll aufgefordert werden folgende Eingaben zu tätigen:
 * Benutzername
 * Gewicht in kg
 * Grösse in cm
 * Aus den Werten soll der BMI berechnet werden bmi = gewicht in kg / (grösse in meter)²
 * Der Benutzer soll eine Ausgabe mit persönlicher Ansprache und seinem BMI bekommen.
 * */
public class A_03b_BMI_Bedingung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Variablen
		String benutzerName;
		double gewicht;
		int groesse;
		double bmi;

		// Hilfsklassen
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");

		// Benutzereingaben abfragen
		System.out.println("Name: ");
		benutzerName = scan.nextLine();

		System.out.println("Gewicht:");
		gewicht = scan.nextDouble();
		System.out.println("Grösse:");
		groesse = scan.nextInt();

		// Scanner schliessen
		scan.close();

		// Berechnung durchführen
		// bmi = gewicht / ((groesse / 100.0) * (groesse / 100.0));
		bmi = gewicht / Math.pow(groesse / 100.0, 2.0);
		System.out.println(groesse);
		System.out.println(gewicht);
		System.out.println(bmi);

		// Ausgabe

		System.out.println("Hallo " + benutzerName);
		System.out.println("Dein BMI beträgt: " + df.format(bmi));

		// Erweiterung
		if (bmi < 18.5) {
			System.out.println("Untergewicht");
		} else if (bmi < 25) {
			System.out.println("Normalgewicht");
		} else {
			System.out.println("Übergewicht");
		}

	}

}
