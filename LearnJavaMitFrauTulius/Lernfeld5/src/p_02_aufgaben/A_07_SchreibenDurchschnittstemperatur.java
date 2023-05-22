/* Aufgabenstellung: Durchschnittstemperatur
 * Der Benutzer soll nach Eingabe seines Wohnorts aufgefordert werden Temperaturen einzugeben
 * Die Durchschnittstemperatur soll berechnet und dem Benutzer angezeigt werden. 
 * Wenn Durchschnittstemperatur unter 20 Grad liegt Hinweis: „Noch kein
 * Sommer“, ansonsten Hinweis: „Zeit für T-Shirt“
 * Die Temperaturen sollen in einem Array gespeichert werden.Nutzen Sie eine Schleife zum Erfassen der Daten. 
 * Der Benutzer soll nun auch die Möglichkeiten haben eine beliebige Anzahl an Temperaturen zu erfassen. Erfragen Sie vorher wie viele Werte er erfassen möchte.
 * Nutzen Sie für die Interaktion mit dem Benutzer (Ein- und Ausgabe) die Klasse JOptionPane.
 *
 *Schreiben Sie folgende Methoden:
 * eingabeTemperaturen(int anzahl): double[]
 * berechneDurchschnitt(double[] temperaturen): double
 *
 * Erweiterung:
 * Schreiben Sie die Methode feedbackAnzeigen um:
 * feedbackAnzeigen(String ort, int anzahl, double durchschnitt): void
 * feedbackErzeugen(String ort, int anzahl, double durchschnitt): String
 * Schreiben Sie eine weitere Methode, die die Daten in eine Datei schreibt:
 * dateiSchreiben(String feedback, String ort): void
 * Der Ort soll als Dateiname dienen z.B. Heidelberg.txt
*/


package p_02_aufgaben;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.text.DecimalFormat;
import java.time.LocalDate;

import javax.swing.JOptionPane;


public class A_07_SchreibenDurchschnittstemperatur {

	public static double[] eingabeTemperaturen (int anzahl) {
		
		double[] temperaturen = new double[anzahl];
		
		for (int i=0;i<anzahl; i++) {
			temperaturen[i] = Double.parseDouble(JOptionPane.showInputDialog("Geben Sie bitte die Temperatur für den " + (i+1) + ". Tag ein ").replace ("," , ".")); 
		}
		return temperaturen;
	}
	
	public static double berechneDurchschnitt (int anzahl, double[] temperaturen) {
		double insgesamt = 0 ;
		for (int i=0; i<anzahl;i++) {
			insgesamt = insgesamt + temperaturen[i];
		}
		double durchschnitt = insgesamt/anzahl;
		return durchschnitt ;
	}
	
	public static void feedbackAnzeigen(String ort, int anzahl, double durchschnitt) {
		// Wenn Durchschnittstemperatur unter 20 Grad liegt Hinweis: „Noch kein
		// Sommer“, ansonsten Hinweis: „Zeit für T-Shirt“
		
		if (durchschnitt<20) { 
			JOptionPane.showMessageDialog(null, "Noch kein sommer");
			} else {
				JOptionPane.showMessageDialog(null, "Zeit für T-Shirt");
			}
		
		LocalDate datum = LocalDate.now(); // Create a date object
		DecimalFormat df = new DecimalFormat("0.00") ;
		JOptionPane.showMessageDialog(null, "Der durchschnittliche Temperatur in " + ort + " für " + anzahl + " Tage beträgt: " + df.format(durchschnitt) +"° C" 
											+"\nSie haben diese Eingaben am " + datum + " eingegeben" + "\n" );
	
	}
	
	public static String feedbackErzeugen(String ort, int anzahl, double durchschnitt) {
		String feedback = null;
		
		LocalDate datum = LocalDate.now(); // Create a date object
		DecimalFormat df = new DecimalFormat("0.00") ;
		feedback = "Der durchschnittliche Temperatur in " + ort + " für " + anzahl + " Tage beträgt: " + df.format(durchschnitt) +"° C" 
											+"\nSie haben diese Eingaben am " + datum + " eingegeben" + "\n";
		
		
		return feedback;
	}
	
	public static void dateiSchreiben(String feedback) {
		
		try {
			
			FileWriter fw = new FileWriter ("DurchschnittTemperatur.txt", true);
			BufferedWriter bw = new BufferedWriter (fw);
			bw.write(feedback);
			
			bw.close();
			fw.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Fehler!");
		}
	} 
	
	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, " Hallo allerzeit, wie rechnen jetzt zusammen die durchschnittliche Temperatur eurer Stadt.");
		
		String ort = JOptionPane.showInputDialog("Geben sie der Ort ein :" );
		
		int anzahl = Integer.parseInt(JOptionPane.showInputDialog("für wie viel Tage möchten Sie die Temperaturdurchschnitt rechnen"));
		JOptionPane.showMessageDialog(null, "Nun brauche ich die Temperaturen");
		
		
		double[] temperaturen = eingabeTemperaturen(anzahl);
		double durchschnitt = berechneDurchschnitt (anzahl, temperaturen);
		
		feedbackAnzeigen(ort, anzahl, durchschnitt);
		
		dateiSchreiben(feedbackErzeugen(ort, anzahl, durchschnitt));
		
		
		
	}
	
}
