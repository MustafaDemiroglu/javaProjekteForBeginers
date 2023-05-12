package p_01_demo;

public class D_08_Methoden {
	
	// ohne Übergabeparameter und ohne Rückgabewert (void)
	public static void renn() {
		System.out.println("Ich renne");
		System.out.println("und ich renne weiter");
		System.out.println("Ziel in Sicht");
	}
	
	// mit Übergabeparameter, ohne Rückgabewert
	public static void renn (String ziel) {
		System.out.println("ich renne nach " + ziel); 
	}
	
	// ohne Übergabeparameter, mit Rückgabewert
	public static int addiere() {
		int zahl = 3+5 ;
		return zahl ;
	}
	
	// mit Übergabeparameter und mit Rückgabewert
	public static int berechne (int zahl1, int zahl2) {
		int ergebnis = zahl1+zahl2 ;
		return ergebnis;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		renn();
		// renn();
		// renn();
		
		System.out.println("---------------------------");
		// auf Datentyp achten
		renn("Hause") ;
		renn("Bushaltestelle") ; 
		
		System.out.println("---------------------------");
		addiere();
		int ergebnis = 3* addiere() ;
		System.out.println(ergebnis);
		
		System.out.println("---------------------------");
		System.out.println(berechne(42,20));

	}

}
