package p01_demo;

class Cabrio extends Auto {
	
	String dach = "Faltdach" ;
	
	void oeffenDach() {
		System.out.println("Dach ist auf");
	}
	
	public Cabrio () {
		
	}
	
	public Cabrio (String hersteller) {
		// this.hersteller = hersteller ;
		super(hersteller) ;
	}


}
