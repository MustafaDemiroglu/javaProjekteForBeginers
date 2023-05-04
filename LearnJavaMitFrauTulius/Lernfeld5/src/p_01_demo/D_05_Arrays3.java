package p_01_demo;

import java.util.Scanner;

public class D_05_Arrays3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Erste Variante
		String einkauf1 = "Äpfel" ;
		String einkauf2 = "Milch" ;
		String einkauf3 = "Brot" ;
		String einkauf4 = "Wurst" ;
		
		System.out.println(einkauf1);
		System.out.println(einkauf2);
		System.out.println(einkauf3);
		System.out.println(einkauf4);
		*/
		
		
		/* 2. Variante
		String[] einkaufListe = new String[anzahl];
		einkaufListe[0] = "Äpfel" ;
		einkaufListe[1] = "Milch" ;
		einkaufListe[2] = "Brot" ;
		einkaufListe[3] = "Wurst" ;
		einkaufListe[4] = "Gemüse" ;
		
		System.out.println("Hier ist mir Array und Schleife");
		for (int i=0; i<anzahl; i++) {
			System.out.println(einkaufListe[i]);
		}
		*/
		
		
		/* Variante 3
		System.out.println("Hier ist eine andere variante Array");
		String[] einkaufZettel = {"Äpfelx", "Milchx", "Brotx", "Wurstx", "Gemüsex", "Kaffex"};
		// einkaufZettel[6] = "Duschgel" ;       
		// musste schon vorher die anzahl gegeben 
		for (int i=0; i<anzahl; i++) {
			System.out.println(einkaufZettel[i]);
		}
		
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Anzahl");
		int anzahl = scan.nextInt() ;
		String[] einkaufListe= new String[anzahl] ; 
		System.out.println("Test: " + einkaufListe.length);
		
		for (int i=0; i<anzahl; i++) {
			System.out.println("Eingabe: " + i);
			einkaufListe[i] = scan.nextLine();
		}
		
		for(int i=0; i<einkaufListe.length; i++) {
			System.out.println(einkaufListe[i]);
		}

	}

}
