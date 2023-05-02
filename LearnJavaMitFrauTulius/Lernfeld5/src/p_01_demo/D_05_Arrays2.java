package p_01_demo;

public class D_05_Arrays2 {
	public static void main (String [] args) {
		//TODO
		
		double [] noten;
		int anzahl = 5;
		noten = new double [anzahl];
		noten[0] = 1.5 ;
		noten[1] = 2.3 ;
		noten[2] = 3.8 ;
		noten[3] = 1.0 ;
		noten[4] = 5.3 ;
		
		double durchschnitt = (noten[0] + noten[1]+ noten[2] + noten[3] + noten[4]);
		System.out.println(durchschnitt);
		
	}

}
