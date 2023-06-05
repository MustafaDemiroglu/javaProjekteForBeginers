package p_01_demo;

import java.util.Scanner;

public class S_02_Umsatz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double umsatz ;
		double rabatt ;
		double rechnungsbetrag ;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Umsatz : ");
		umsatz = scan.nextDouble();
		scan.close();
		
		if (umsatz>100) {
			if (umsatz>500) {
				rabatt = 10 ;
			} else {
				rabatt = 5 ;
			}
		} else {
			rabatt = 0 ;
		}
		
		rechnungsbetrag = umsatz - rabatt ;
		
		System.out.println(rechnungsbetrag);

	}

}
