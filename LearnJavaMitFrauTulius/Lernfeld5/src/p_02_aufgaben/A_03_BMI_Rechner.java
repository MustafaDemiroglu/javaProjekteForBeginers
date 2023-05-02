package p_02_aufgaben;


import java.util.Scanner;
import java.text.DecimalFormat;

/* Aufgabenstellung: BMI-Rechner
* Der Benutzer soll aufgefordert werden folgende Eingaben zu
tätigen:
 Benutzername
 Gewicht in kg
 Grösse in cm
* Aus den Werten soll der BMI berechnet werden bmi = gewicht in kg /
(grösse in meter)²
* Der Benutzer soll eine Ausgabe mit persönlicher Ansprache und
seinem BMI bekommen.
*/


public class A_03_BMI_Rechner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Variable deklarieren
		String benutzerName;
		double gewicht;
		int groesse;
		
		// Hilfemethoden einfügen
		Scanner scan = new Scanner(System.in);  
		DecimalFormat df = new DecimalFormat ("0.00");
		
		// Benutzer eingaben abfragen
		System.out.println("Willkommen! Wie heißen Sie?");
		benutzerName = scan.nextLine();
		System.out.println("Hallo " + benutzerName +" ich möchte Ihr BMI Rechnen. deswegen brauche ich einige Infos.Könnten Sie bitte Ihre Gewicht in kg eingeben.");
		gewicht= scan.nextDouble();
		System.out.println("Danke für die Eingabe " + benutzerName + " Nun brauche ich Ihre Grösse. Geben sie bitte ihre Grösse in zentimeter ein ");
		groesse = scan.nextInt();
		
		// Scanner Schließen
		scan.close();
		
		// Berechnung durchführen
		double bmi = gewicht/Math.pow((groesse/100.0), 2.0);
		
		// Ausgabe
		System.out.println("Vielen Dank für die Eingaben " + benutzerName);
		System.out.println("Deine gewicht ist: " + gewicht);
		System.out.println("Deine groesse ist: " + groesse);
		System.out.println("Hier ist dein BMI : " + df.format(bmi));
		
		// Bedingungen
		if (bmi < 18.5) {
			System.out.println("Untergewicht");
		} else if (bmi < 25) {
			System.out.println("Normalgewicht");
		} else {
			System.out.println("Übergewicht");
		}
	}

}
