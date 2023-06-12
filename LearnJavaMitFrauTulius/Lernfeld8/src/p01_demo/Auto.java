package p01_demo;

public class Auto {
	
	// Attribute
	String hersteller;
	
	// Methoden
	void saghersteller(){
		System.out.println("Hersteller : " + hersteller);
	}
	
	void fahren() {
		System.out.println("Ich fahre! ");
	}
	
	// Konstruktor
	public Auto() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto meinAuto = new Auto();
		meinAuto.fahren();
		
	}

}
