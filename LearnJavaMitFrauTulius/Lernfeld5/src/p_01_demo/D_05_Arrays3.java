package p_01_demo;

public class D_05_Arrays3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String einkauf1 = "Äpfel" ;
		String einkauf2 = "Milch" ;
		String einkauf3 = "Brot" ;
		String einkauf4 = "Wurst" ;
		
		System.out.println(einkauf1);
		System.out.println(einkauf2);
		System.out.println(einkauf3);
		System.out.println(einkauf4);
		
		int anzahl = 5 ;
		String[] einkaufListe = new String[anzahl];
		einkaufListe[0] = "Äpfel" ;
		einkaufListe[1] = "Milch" ;
		einkaufListe[2] = "Brot" ;
		einkaufListe[3] = "Wurst" ;
		einkaufListe[4] = "Gemüse" ;
		
		System.out.println("hier ist mir Array und Schleife");
		for (int i=0; i<anzahl; i++) {
			System.out.println(einkaufListe[i]);
		}

	}

}
