package p_01_demo;

import java.util.Scanner;

public class S_03_UrlaubsGeld_Tulius {

	public static void main (String [] args) {
		
		double UrlaubsTage;
		double Gehalt;
		int BetriebsZugehoerigkeit;
		double UrlaubsGeld;
		
		Scanner scan = new Scanner (System.in) ;
		
		System.out.println("UrlaubstTage : ");
		UrlaubsTage = scan.nextDouble();
		
		System.out.println("Gehalt : ");
		Gehalt = scan.nextDouble();
		
		System.out.println("BetriebsZugehoerigkeit : ");
		BetriebsZugehoerigkeit = scan.nextInt();
		
		double UrlaubsGeldProTag = Gehalt/30;
		
		scan.close();
		
		if (BetriebsZugehoerigkeit>3) {
			if (BetriebsZugehoerigkeit>10) {
				UrlaubsGeld = UrlaubsGeldProTag * UrlaubsTage * 1.25; 
			} else {
				UrlaubsGeld = UrlaubsGeldProTag * UrlaubsTage;
			}
		} else {
			UrlaubsGeld = 0;
		} 
		
		System.out.println("UrlaubsGeld : " + UrlaubsGeld );
	}
}
