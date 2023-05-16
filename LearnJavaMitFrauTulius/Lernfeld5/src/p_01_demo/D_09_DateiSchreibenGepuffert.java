package p_01_demo;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class D_09_DateiSchreibenGepuffert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			// true als Parameter sorgt dafür, dass Dateiinhalt bestehen bleibt
			//und neuer inhalt angehängt wird
			FileWriter fw = new FileWriter("benutzer.txt",true);
			// Zwischenspeichern "Bufffern"
			BufferedWriter bw = new BufferedWriter(fw);
			
			/*
			bw.newLine();
			bw.write("7. Zeile");
			//Erzeugt write.newline() Zeilumbruch
			bw.newLine();
			bw.write("8. Zeile");
			*/
			
			String[]benutzer;
			benutzer = new String[3];
			benutzer[0] = "Hansi";
			benutzer[1] = "Sabine";
			benutzer[2] = "Daniel";
			
			for (int i=0;i<benutzer.length;i++) {
				bw.write(benutzer[i]);
				bw.newLine();
			}
			
			
			// Jetzt wird Zwischenspeicher in Datei geschrieben
			bw.close();
			// Schliesen der Datei
			fw.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Fehler");
		}
		
	}

}
