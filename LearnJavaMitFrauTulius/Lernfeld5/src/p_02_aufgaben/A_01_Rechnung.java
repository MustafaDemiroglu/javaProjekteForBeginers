package p_02_aufgaben;

import java.util.Scanner;

public class A_01_Rechnung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// eine Klasse, die zeigt uns die Rechnung
		// deklarieren die Variables
		// Deklaration der benötigen Variablen
		String name;
		int anzahlE;
		double preisE;
		int anzahlG;
		double preisG;
		double summe;
		
		Scanner scan = new Scanner(System.in); 
	
		// Eingabe für Anzahl
		System.out.println("Hallo, Willkommen unsere Rechnung Klasse. Wir helfen euch gerne um Ihre Rechnung !");
		System.out.println("Wie ist Ihr name?");
		name = scan.nextLine();
		System.out.println("Nochmal Willkommen " + name + " Wie viel Essen möchten Sie bestellen? ");
		anzahlE = scan.nextInt();
		System.out.println("Danke für die Anzahl des Essens und " + name + " wie viel Getränke möchten Sie bestellen? ");
		anzahlG = scan.nextInt();
		
		// Eingabe für preis
		System.out.println("Das ist nur ein Beispiel. Deswegen bitten wir euch auch die Preise  :-))");
		System.out.println("Ok dann, " + name + ", wie viel kostet durchschnittlich ein Essen, dass Sie bestellen? ");
		preisE = scan.nextDouble();
		System.out.println("Danke für deine eingabe und noch braucehn wir eine letzt Eingabe " + name + "kannst du uns sagen, wie viel durchschnitt ein Getaränk kostet, die Sie bestellen möchten? ");
		preisG = scan.nextDouble();
		
		// Ausgabe Rechnungsbetrag
		
		summe = anzahlE * preisE + anzahlG * preisG;
		System.out.println("Vielen Danke für alle Eingaben, die sie uns geholfen haben " + name);
		System.out.println("Hier ist die Summe deiner Rechnung : " + summe);
		
		scan.close();
	}

}
