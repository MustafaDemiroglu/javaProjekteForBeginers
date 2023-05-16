/* 
 * Aufgabenstellung Benzinverbrauchsrechner
 * Ein Benutzer soll aufgefordert werden die gefahrene Strecke in Kilometern und die getankten Liter Kraftstoff einzugeben.
 * Aus den Angaben soll der Durchschnittsverbrauch pro 100 Kilometer berechnet und dem Benutzer angezeigt werden
 * Wenn Durchschnittsverbrauch über 12 Liter liegt Hinweis: „Bitte sparsamer fahren“
 * Nutzen Sie für die Interaktion mit dem Benutzer (Ein- und Ausgabe) die Klasse JOptionPane.
 * 
 * Schreiben Sie folgende Methoden:
 * benutzerEingaben(String anweisung): double
 * berechneDurchschnitt(double liter, double strecke): double
 * feedbackAnzeigen(double liter, double strecke, double durchschnitt):void
 * 
 * Erweiterung:
 * Schreiben Sie die Methode feedbackAnzeigen um:
 * feedbackErzeugen(double liter, double strecke, double durchschnitt): String
 * Schreiben Sie eine weitere Methode, die die Daten in eine Datei schreibt:
 * dateiSchreiben(String feedback): void
 * 
 * Rufen Sie die Methoden in der Main-Methode auf:
 * double strecke = benutzerEingaben("Gefahrene Strecke");
 * double liter = benutzerEingaben("Getankte Liter");
 * double durchschnitt = berechneDurchschnitt(liter, strecke);
 * String feedback = feedbackErzeugen(liter, strecke, durchschnitt);
 * dateiSchreiben(feedback);
 * JOptionPane.showMessageDialog(null,feedback);
 * System.out.println(feedback);
*/




package p_02_aufgaben;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class A_07_SchreibenBenzinverbrauchsrechner {
	// benutzerEingaben(String anweisung): 
		public static double benutzerEingaben (String anweisung) {
			
			double eingabe = Double.parseDouble(JOptionPane.showInputDialog(anweisung).replace ("," , "."));
			return eingabe;
		}
		
		
		// double berechneDurchschnitt(double liter, double strecke):
		public static double berechneDurchschnitt (double liter, double strecke) {
			double durchschnitt = (liter / strecke) * 100 ;
			return durchschnitt ;
		}
		
		/*
		// feedbackAnzeigen(liter, strecke, durchschnitt)
		public static void feedbackAnzeigen(double liter, double strecke, double durchschnitt) {
			
			DecimalFormat df = new DecimalFormat("0.00") ;
			
			String feedback = "";

			
			if (berechneDurchschnitt(liter, strecke)<12) {
				feedback = "Sie sind sehr sparsam. Das ist auch gut für die Umwelt" ;
			} else {
				feedback = "Bitte sparsamer fahren. Ihr verlieren Geld und es ist nicht gut für unsere Welt ";
			}
			
			System.out.println("Sie haben mit " + liter + " getankte Benzin " + strecke + " gefahren." );
			System.out.println("Ihr durchschnittlich Benzinverbrauch ist : " +  df.format(durchschnitt));
			System.out.println(feedback);
			
		}
		*/
		
		//Schreiben Sie die Methode feedbackAnzeigen um: feedbackErzeugen(double liter, double strecke, double durchschnitt): String
		
		public static String feedbackErzeugen (double liter, double strecke, double durchschnitt) {
			
			DecimalFormat df = new DecimalFormat("0.00") ;
			
			String feedback = "";

			if (berechneDurchschnitt(liter, strecke)<12) {
				feedback = "Sie sind sehr sparsam. Das ist auch gut für die Umwelt" ;
			} else {
				feedback = "Bitte sparsamer fahren. Ihr verlieren Geld und es ist nicht gut für unsere Welt ";
			}
			
			return feedback;	
		}
		
		// Schreiben Sie eine weitere Methode, die die Daten in eine Datei schreibt dateiSchreiben(String feedback): void
		
		public static void dateiSchreiben (String feedback) {
			
			try {
				
				FileReader fr = new FileReader ("")
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		} 
		
		
		   public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			//Variable deklarieren
			double strecke;
			double liter;
			double durchschnitt ;
			
			JOptionPane.showMessageDialog(null, "Hallo! wir rechnen zusammen ob Sie sparsam sind :-) ");
			
			strecke = benutzerEingaben("Gefahrene Strecke");
			liter = benutzerEingaben("Getankte Liter");
			
			
			durchschnitt= berechneDurchschnitt(liter, strecke);
			feedbackAnzeigen(liter, strecke, durchschnitt);
			
			
			

		}

}
