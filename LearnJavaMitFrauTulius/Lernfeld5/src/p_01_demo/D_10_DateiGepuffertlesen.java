package p_01_demo;

import java.io.*;

public class D_10_DateiGepuffertlesen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text ;
		
		try {
			
			FileReader fr = new FileReader("Demo2.txt");
			BufferedReader br = new BufferedReader(fr);
			
			// BufferedReader br = new BufferedREader(new FileReader("Demo.txt"))
			
			
			// liest Datei zeilenweise ein
			// wenn keine weitere Zeile vorhanden ist return = null
			
			while ((text =br.readLine()) !=null) {
				System.out.println(text);
			}
			
			br.close();
			fr.close();
		} catch (Exception e) {
			// TODO: handle exception
			
			System.out.println("Fehler!");
		}

	}

}
