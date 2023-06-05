package p_01_demo;

import java.util.Scanner;

public class S_02_Rabatt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double Umsatz ;
		double Rabatt ;
		double Rechnungsbetrag ;
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Umsatz :");
		Umsatz = scan.nextDouble();
		scan.close();
		
		if (Umsatz >100) {
			// weiter prüfen
			if (Umsatz>500) {
				// Rabatt = 10%  
				Rabatt = Umsatz * 10 / 100 ;
			} else {
				// Rabatt = 5%
				Rabatt = Umsatz * 5 / 100 ;
			}
		} else {
			Rabatt = 0 ;	
		}
		
		Rechnungsbetrag = Umsatz - Rabatt ;
		
		System.out.println(Rechnungsbetrag);

	}

}
