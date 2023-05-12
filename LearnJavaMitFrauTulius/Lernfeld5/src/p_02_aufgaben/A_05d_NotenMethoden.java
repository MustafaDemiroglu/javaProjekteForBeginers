package p_02_aufgaben;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class A_05d_NotenMethoden {

	public static double[] eingabeKlausuren (int anzahl) {
		double[] klausuren= new double [anzahl];
		for (int i = 0 ; i < anzahl ; i++) {
			// inputDialog
			// , durch . ersetzen
			// parsen zu double
			
			klausuren [i] = Double.parseDouble(JOptionPane.showInputDialog("Klausurnote : ").replace ("," , "."));
			/*
			String eingabe = JOptionPane.showInputDialog("Klausurnote : ");
			eingabe = eingabe.replace(",",".");
			klausuren[i] = note;
			*/
		}
		return klausuren;
	}
	
	public static double berechneDurchschnitt (double[] klausuren) {
		double sumKlausuren = 0 ;
		for(int i=0;i<klausuren.length;i++) {
			sumKlausuren+=klausuren[i];
		}
		double durchschnitt = sumKlausuren / klausuren.length ;
		return durchschnitt;
	}
	
	public static void feedbackAnzeigen(String fach, int anzahl, double durchschnitt) {
		
		DecimalFormat df = new DecimalFormat("0.00") ;
		
		String feedback = "";
		if(durchschnitt<2.0) {
			feedback = "Sie haben super Leistungen erbracht.";
		} else {
			feedback = "Sie sollten noch etwas lernen";
		}
		
		JOptionPane.showMessageDialog(null, "Im Fach " + fach + " war die Durchschnittnote " + df.format(durchschnitt) + " für " + anzahl + " Klausuren. " + feedback);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String fach = JOptionPane.showInputDialog("Fach :");
		int anzahl = Integer.parseInt(JOptionPane.showInputDialog("Anzahl Klausuren: "));
		
		double[]klausuren = eingabeKlausuren(anzahl);
		double durchschnitt = berechneDurchschnitt(klausuren) ;
		feedbackAnzeigen(fach, anzahl, durchschnitt) ;

	}

}
