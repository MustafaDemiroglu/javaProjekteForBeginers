package p_01_demo;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class D_09_DateiGepuffert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			FileWriter fw = new FileWriter("Demo2.txt");
			// Zwischenspeichern "Bufffern"
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write("1. Zeile");
			bw.newLine();
			bw.write("2. Zeile");
			
			bw.close();
			fw.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Fehler");
		}
		
	}

}
