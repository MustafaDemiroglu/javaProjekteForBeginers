package p_01_demo;

import java.util.Scanner;
import java.time.LocalDateTime;

public class D_03_Scanner {
	
	public static void main (String [] args) {
		
		// Eine Klasse umzu erfahren die eineige aten vom Klient, die sie selbst eintippen können 
		// Deklarieren die Variablen
		String name;
		int alter;
		int geburtsJahr;
		int aktuellesJahr; 
		
		// Scanner ermöglicht uns DAten zu tippen
		Scanner scan = new Scanner (System.in);
		
		// wir fragen Kunden Ihre Namen und Alter
		System.out.println("Wie ist Ihr Name?");
		name = scan.nextLine();			// kunde schreibt seinen Namen mit dem   
		System.out.println ("Hallo " + name + " Willkommen!");
		System.out.println ("Wie alt bist du " + name + " ?");
		alter = scan.nextInt(); 		// kunde tipped seine Alter
		
		
		LocalDateTime datum = LocalDateTime.now(); 
		aktuellesJahr = datum.getYear();   	// rechnen das Jahr
		geburtsJahr = aktuellesJahr - alter ;
		System.out.println ("Du wurdest höchstwahrscheinlich im Jahr " + geburtsJahr + " geboren");
		
		scan.close();
		
		
	}

}
