package p_02_aufgaben;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class A_01_Rechnung_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Frau Tulius hat geschrieben
		// Deklaration der benötigten Variablen
		int anzahl;
		double preis;
		double rgBetrag;
		String rgBetragDeutsch;
		
		Scanner scan = new Scanner (System.in);
		
		// Eingabe für die Anzahl
		System.out.println( "Anzahl?");
		anzahl = scan.nextInt();
		
		// Eingabe für Preis
		System.out.println("Preis?");
		preis = scan.nextDouble();
		
		// Ausgabe Rechnungsbetrag
		rgBetrag = anzahl * preis ;
		System.out.println("Rechnungsbetrag : " + rgBetrag);
		
		// Punkt durch komma ersetzen Variante A : replace
		// 19.9 --> 19,9 replace ('.' , ',')
		rgBetragDeutsch = ""+rgBetrag;
		rgBetragDeutsch = rgBetragDeutsch.replace('.',',');
		System.out.println("deutsch: Rechnungsbetrag : " + rgBetragDeutsch );
		
		// Punkt durch Komma erstzen Variante B : Numberformat
		rgBetragDeutsch = NumberFormat.getInstance(Locale.GERMAN).format(rgBetrag);
		System.out.println ("deutsch variante 2 : Rechnungsbetrag: " + rgBetragDeutsch);
		
		scan.close();
		

	}

}
