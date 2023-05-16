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
			fw.write("\n2.Versuch");
			fw.write("\r3.Versuch");
			fw.write("\nAdana Kebap");
			fw.write("\n\rhier möchte ich zeigen wie man neue Reihe anfängt \nhilft uns");
			fw.close();
		} catch(Exception e) {
			System.out.println("Fehler beim erstellen der Datei");
		}

	}

}
