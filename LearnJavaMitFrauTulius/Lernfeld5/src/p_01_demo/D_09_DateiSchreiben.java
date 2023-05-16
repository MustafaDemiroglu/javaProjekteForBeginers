package p_01_demo;

import java.io.FileWriter;

public class D_09_DateiSchreiben {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileWriter fw;
		
		try {
			// Erzeugen einer TXT-Datei
			fw = new FileWriter("Demo.txt");
			fw.write("Dies ist unsere 1. _Datei");
			fw.close();
		} catch(Exception e) {
			System.out.println("Fehler beim erstellen der Datei");
		}

	}

}
