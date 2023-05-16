package p_01_demo;

import java.io.*;

public class D_11_CSV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String zeile;
		
		try {
			
			FileReader fr = new FileReader ("adressen.csv");
			BufferedReader br = new BufferedReader(fr);
			
			while ((zeile = br.readLine())!=null) {
				System.out.println(zeile);
			}
			
			br.close();
			fr.close();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
