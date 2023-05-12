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
		} else if (anrede == 'm' || anrede =='M') {
			System.out.println("Hallo Herr " + nachname);
		}
		else {
			System.out.println("Hallo " + nachname);
		}
		
	} 
	
	public static void begruessen(char anrede, int gruss, String nachname) {
		String begruessung = "";
		
		switch (gruss) {
		case 1:
			begruessung = "Hi" ;
			break;
		case 2:
			begruessung = "Guten Tag" ;
			break;
		case 3:
			begruessung = "Servus" ;
			break;
		default:
			begruessung = "Hallo";
		}
		
		if (anrede == 'w' || anrede =='W') {
			System.out.println(begruessung+" Frau " + nachname);
		} else if (anrede == 'm' || anrede =='M') {
			System.out.println(begruessung+" Herr " + nachname);
		}
		else {
			System.out.println(begruessung+ " " + nachname);
		}
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		begruessen () ;
		begruessen ("Hansi") ;
		begruessen ("Max", "Mustermann") ;
		begruessen ('x', "Beispiel") ;
		begruessen ('d',3,"Schul") ;

	}

}
