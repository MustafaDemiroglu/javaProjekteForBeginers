package p_01_demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class D_05_EinkaufsListe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in) ;
		List<String> einkaufsListe = new ArrayList<String>();
		String einkauf ="";
		boolean weiter = true ;
		System.out.println("Erfasse deinen einkauf, beenden mit x");
		
		/* Erste Variante
		while (weiter) {
			einkauf = scan.nextLine();
			if(einkauf.equals("x")) {
				System.out.println("Liste Fertig!");
				weiter = false;
			} else {
				einkaufsListe.add(einkauf);
			}
		}
		*/
		
		while (!einkauf.equals("x")) {
			einkauf = scan.nextLine();
			einkaufsListe.add(einkauf);
		}
		
		einkaufsListe.remove(einkaufsListe.lastIndexOf("x"));
		
		for (int i=0;i<einkaufsListe.size();i++) {
			System.out.println(einkaufsListe.get(i));
		}
		
		Collections.sort(einkaufsListe);
		System.out.println("--------------------------");
		for (int i=0;i<einkaufsListe.size();i++) {
			System.out.println(einkaufsListe.get(i));
		}
		

	}

}
