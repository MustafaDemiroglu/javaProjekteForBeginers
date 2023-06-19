package Fuhrpark;

public class Cabrio extends Auto {
	
	// Atrribute
	private String dachtyp = "Faltdach" ;
	
	// Methoden
	public void oeffneDach() {
		System.out.println("Dach geeöffnet " + dachtyp);
	}
	
	@Override
	public void getFarbe() {
		super.getFarbe();
		System.out.println("Ich will Rallystreifen");
		
	}
	
	public Cabrio() {
		System.out.println("Konstruktor von Cabrio");
	}
	
	public Cabrio (String dach) {
		System.out.println("Konstruktor Cabrio mit Dach");
		this.dachtyp = dach ;
	}

}
