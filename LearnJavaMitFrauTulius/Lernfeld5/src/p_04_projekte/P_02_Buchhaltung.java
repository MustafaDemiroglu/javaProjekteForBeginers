/*  Beschreibung 	:Diese Anwendung fragt den Benutzer die Anzahl der Eingaben für Einahme und  für Kosten
 * 					 dann fragt für jede einzelne Eingabe und Ausgabe 
 * 					 danach rechnet die insgesamt Einahnme und Ausgabe sowie Saldo
 * 					 zulestzt fragt den Benutzer welchen Wahrungstyp er die Eingaben gegeben hat
 * 					 als Ergebnis bekommt man Saldo in anderen Währungen  	   
 *  Author			: Maik German, Mahmut Aslan, Mustafa Demiroglu
 *  Datum 			: 05.05.2023
 *  Version 		: Operation.Mahlzeit.Number.100 :-)
 * */

package p_04_projekte;

import java.util.Locale;
import java.util.Scanner;
import java.text.DecimalFormat;

public class P_02_Buchhaltung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Variablen deklarieren 
		int anzahlV ;
		int anzahlK;
		
		// Hilfe Methoden
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		Locale.setDefault(Locale.GERMAN);
		
		// Eingaben Einnahme
		System.out.println("Wie viele Eingaben möchtest du machen? : ");
		anzahlV = scan.nextInt();
		double[] vermoegen = new double[anzahlV];
		for (int i = 0; i<anzahlV ; i++) {
			System.out.println("Eingabe: " + (i+1) + ": " + " Bitte eingeben!");
			vermoegen[i] = scan.nextDouble();
		}
		
		// berechnen und ausgeben die einnahme 
		double einnahme =0;
		for(int i=0;i<anzahlV;i++) {
			einnahme =einnahme + vermoegen [i];
		}
		System.out.println("Insgesamte Einnahmen für diesen Monat sind : " + df.format(einnahme));
		
		
		// Eingaben Ausgabe
		System.out.println("Wie viele Ausgaben möchtest du für diesen Monat eingeben? : ");
		anzahlK = scan.nextInt();
		double[] kosten = new double [anzahlK];
		for (int i = 0; i<anzahlK ; i++) {
			System.out.println("Kosten: "+ (i+1) + " : " + " Bitte eingeben!" );
			kosten[i] = scan.nextDouble();
		}
		
		// berechnen und ausgeben die Ausgabe 
		double ausgabe = 0 ;    
		for(int i=0;i<anzahlK;i++) {
			ausgabe =ausgabe + kosten[i];
		}
		System.out.println("Insgesamt Ausgabe diesen Monat : " + df.format(ausgabe));
	
		
		// Saldo berechnen und Ausgeben
		double saldo ;
		saldo = einnahme - ausgabe ;
		System.out.println("Saldo : " + df.format(saldo));
		
		// Bedingungen
		
		if (saldo<0) {
			System.out.println("iss weniger ung geld sparen, verschonen die Umwelt");
		} else {
			System.out.println("du bist der hammer, bald hast du neue Porsche");
		}
		
		
		// Wahrungsrechner kombinieren
		double code,dollar,euro,lira;
		System.out.println("Geben Sie Ihren Wahrungstyp ein"); 
        System.out.println("1:Dollar\n2:Euro\n3:Lira"); 
        code=scan.nextInt();
        
        scan.close();
        System.out.println("Ihr Saldo ist in anderen Währungen das folgende Wert:");
        
        
        // Für Dollar umtauschen
        if(code == 1) {
            dollar = saldo;
            euro = dollar * 0.91;
            System.out.println("Euro : "+df.format(euro));
            lira = dollar * 19.50 ;
            System.out.println("Lira : " + df.format(lira));
        }
     
        // Für Euro umtaushen
        else if(code == 2){
            euro = saldo;
            dollar = euro * 1.10;
            System.out.println("Dollar : "+df.format(dollar));
            lira = euro * 21.51 ;
            System.out.println("Lira : " + df.format(lira));
        }
        
     // Für Lira umtauschen
        else if(code == 3){
            lira = saldo;
            dollar = lira * 0.051;
            System.out.println("Dollar : "+df.format(dollar));
            euro = lira * 0.047;
            System.out.println("Euro : "+df.format(euro));
        }
  
        else {
            System.out.println("Gegeben Code ist nicht rightig");
        }

	}

}
