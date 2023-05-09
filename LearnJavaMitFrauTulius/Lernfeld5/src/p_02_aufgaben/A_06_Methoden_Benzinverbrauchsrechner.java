/* Aufgabenstellung Benzinverbrauchsrechner
* Ein Benutzer soll aufgefordert werden die gefahrene Strecke in Kilometern und die getankten Liter Kraftstoff einzugeben.
* Aus den Angaben soll der Durchschnittsverbrauch pro 100 Kilometer berechnet und dem Benutzer angezeigt werden
* Wenn Durchschnittsverbrauch über 12 Liter liegt Hinweis: „Bitte sparsamer fahren“
* Nutzen Sie für die Interaktion mit dem Benutzer (Ein- und Ausgabe) die Klasse JOptionPane.
* Erweiterung: Schreiben Sie folgende Methoden: benutzerEingaben(String anweisung): double
* berechneDurchschnitt(double liter, double strecke): double feedbackAnzeigen(double liter, double strecke, double durchschnitt):
* void Rufen Sie die Methoden in der Main-Methode auf: double strecke = benutzerEingaben("Gefahrene Strecke"); double liter = benutzerEingaben("Getankte Liter");
* double durchschnitt = berechneDurchschnitt(liter, strecke); feedbackAnzeigen(liter, strecke, durchschnitt);
*/


package p_02_aufgaben;

import javax.swing.JOptionPane;

public class A_06_Methoden_Benzinverbrauchsrechner {

	
	   public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variable deklarieren
		double strecke;
		double liter;
		double durchschnitt ;
		
		JOptionPane.showMessageDialog(null, "wie rechne zusammen ob sie sparsam sind :-) ");
		
		String eingabe = JOptionPane.showInputDialog("die gefahrene Strecke in Kilometern :");
		eingabe = eingabe.replace(",", ".");
		
		try {
			// Integer.parseInt()
			strecke = Double.parseDouble(eingabe);

			System.out.println("die gefahrene strecke in kilometern : " + strecke);
		} catch (Exception e) {
			System.out.println("Fehler: " + e);
		}
		
		
		String eingabe2 = JOptionPane.showInputDialog("getankten Liter Kraftstoff:");
		eingabe2 = eingabe2.replace(",", ".");		
		
		try {
			// Integer.parseInt()
			liter = Double.parseDouble(eingabe2);

			System.out.println("getankten Liter : " + liter);
		} catch (Exception e) {
			System.out.println("Fehler: " + e);
		}
		
		strecke = Double.parseDouble(eingabe);
		liter = Double.parseDouble(eingabe2);
		durchschnitt = (liter / strecke) * 100 ;
		System.out.println("Durchschnittsverbrauch pro 100 Kilometer berechnet : " + durchschnitt);
		
		if (durchschnitt<12) {
			System.out.println(" sie sind sehr sparsam");
		} else {
			System.out.println("Bitte sparsamer fahren");
		}

	}

}