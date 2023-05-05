package p_01_demo;

import java.util.List;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class D_00_Wiederholung {
	
	public static void main(String[] args) {
		
		// Variablen deklarieren
		String text ;
		int ganzZahl ;
		double kommaZahl ;
		char a ;
		boolean status ;
		String tag;
		int [] lotto = new int[6];
		// <Integer>
		List<String> einkauf = new ArrayList<String>();
		
		// Variablen initialisieren
		// Erste Wertzuweisung
		
		text = "Hallo Welt" ;
		ganzZahl = 5;
		kommaZahl = 3.5 ;
		a= 'a' ;
		status = true ;
		tag = "Freitag" ;
		
		// Hilfsklassen 
		Scanner scan = new Scanner(System.in) ;
		DecimalFormat df = new DecimalFormat("0.00") ;
		
		
		// Konsolenein - und ausgabe
		System.out.println("Ausgabe: " + text);
		text = scan.nextLine();
		System.out.println("Ausgabe: " + text);
		
		// scan.nextInt() ;
		// scan.nextDouble() ;
		
		// Kontrollstrukturen
		// Bedingungen (if else, switch)
		// Wiederholungseinweisungen / Schleifen (for, while)
		
		if (ganzZahl>4) {
			System.out.println("Zahl größer als 4");
		} else {
			System.out.println("Zahl kleiner ode gleich als 4"); 
		}
		
		switch (tag) {
		case "Montag":
			System.out.println("Begin der Woche");
			break ;
		case "Freitag":
			System.out.println("Bald Wochenende");
			break;
		default:
			System.out.println("Anderer Tag");
		}
		
		for (int i=0 ; i< lotto.length; i++) {
			lotto[i] = scan.nextInt();
		}
		
		// Wenn Wechsel von nexInt()auf beispielweise nextLine erflgen soll
		scan.next();
		
		int x=1;
		while (x<3) {
			System.out.println("Ich bin eine while-schleife");
			x++ ;
		}
		
		einkauf.add("Käse");
		einkauf.add("Wurst");
		einkauf.add("Gemüse");
		
		for (int i=0;i<einkauf.size();i++) {
			System.out.println(einkauf.get(i));
		}
				
		einkauf.remove(0);
		einkauf.contains("Wurst");
		
	}
	
	
	

}
