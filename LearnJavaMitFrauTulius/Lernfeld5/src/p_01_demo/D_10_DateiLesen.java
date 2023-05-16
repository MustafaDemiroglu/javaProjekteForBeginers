package p_01_demo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class D_10_DateiLesen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileReader fr;
		int c;
		
		try {
			
			fr = new FileReader("Demo.txt");
			
			// read() liefert keinen Text zurück  sondern einen int
			// sofern noch ein Buchstabe in Datei vorhanden ist
			// String inhalt = fr.read();
			
			// wenn keine Buchstabe mehr vorhanden ist Rückgabewert von read() -1
			while((c=fr.read()) !=-1) {
				System.out.print((char)c);
				// wenn wir println ausgeben bekommen wir alle einzelne Buchstaben untereinander
				// System.out.print((char)c);
			}
			
			fr.close();
					
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println("Fehler : Datei nicht vorhanden!");
		} catch(IOException e) {
			System.out.println("Fehler : Datein kann nicht gelsen werden!");
		} catch (Exception e) {
			System.out.println("Fehler!");
		}
		

	}

}
