package p_01_demo;

import java.io.*;
import java.util.*;

public class D_11_CSV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String zeile;
		int anzahl = 10 ;
		String [] nachnamen = new String [10] ; 
		String [] vornamen = new String [10];
		String [] benutzer = new String [10];
		String [] kurzname = new String [10];
		int [] mitNr = new int[anzahl];
		int i=0; 
		
		try {
			
			FileReader fr = new FileReader ("adressen.csv");
			BufferedReader br = new BufferedReader(fr);
			
			
			// Erste Zeile einlesen, damit Header nicht mit in array gespeichert wird
			String header = br.readLine();
			StringTokenizer stHeader = new StringTokenizer(header, ";");
			System.out.println("Anzahl : " + stHeader.countTokens());
			int tokens = stHeader.countTokens();
			
			for (int j = 1; j <=stHeader.countTokens(); j++) {
				if(stHeader.nextToken().equals("Nummer")) {
					System.out.println(stHeader.nextToken().equals("Nummer"));
					System.out.println("position. " + j);
					
				
				
				
				}
			}
			
			
			
			while ((zeile = br.readLine())!=null) {
				StringTokenizer st = new StringTokenizer(zeile, ";");
				nachnamen[i] = st.nextToken();
				vornamen[i] = st.nextToken();
				st.nextToken();
				st.nextToken();
				st.nextToken();
				mitNr[i] = Integer.parseInt(st.nextToken());
				
				System.out.println(nachnamen[i]);
				System.out.println(vornamen[i]);
				benutzer[i]= nachnamen[i]+ " " + vornamen[i];
				System.out.println(benutzer[i]);
				kurzname [i] = nachnamen[i].substring(0,5)+vornamen[i].substring(0,3);
				System.out.println(kurzname[i]);
	
				System.out.println(mitNr[i]);
				
				i++;
			}
			
			br.close();
			fr.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Fehler!");
		}

	}

}
