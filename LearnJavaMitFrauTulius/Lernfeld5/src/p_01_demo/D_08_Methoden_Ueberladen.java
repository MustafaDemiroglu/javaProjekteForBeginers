package p_01_demo;

public class D_08_Methoden_Ueberladen {
	
	public static void begruessen() {
		System.out.println("Hallo Besucher!");
	} 
	
	public static void begruessen(String name) {
		System.out.println("Hallo " + name);	
	} 
	
	public static void begruessen(String name, String nachname) {
		System.out.println("Hallo " + name + " " + nachname);
	} 
	
	public static void begruessen(char anrede, String nachname) {
		// w, W = Frau
		// m, M = Herr
		
		if (anrede == 'w' || anrede =='W') {
			System.out.println("Hallo Frau " + nachname);
		} else {
			System.out.println("Hallo Herr " + nachname);
		}
		
	} 
	
	public static void begruessen(char geschlecht, int gruss, String nachname) {
		
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		begruessen () ;
		begruessen ("Hansi") ;
		begruessen ("Max", "Mustermann") ;
		begruessen ('w', "Beispiel") ;
		begruessen ('m',1,"Schul") ;

	}

}
