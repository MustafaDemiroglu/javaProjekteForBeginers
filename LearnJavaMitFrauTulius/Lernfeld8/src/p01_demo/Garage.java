package p01_demo;

public class Garage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto meinAuto = new Auto();
		meinAuto.fahren();
		meinAuto.sagHersteller() ;
		
		System.out.println("----------------------");
		
		Auto herbi = new Auto ("Corsa") ;
		herbi.sagHersteller();
		// herbi.hersteller = "MB" ;
		herbi.aendereHersteller("MB");
		meinAuto.sagHersteller();
		
		System.out.println("----------------------");
		Auto flitzer = new Auto();
		flitzer.sagHersteller();
		System.out.println(flitzer.getFarbe());
		flitzer.setFarbe("lila");
		flitzer.aendereHersteller("Fiat");
		flitzer.sagHersteller();
		System.out.println(flitzer.getFarbe());
		
		System.out.println("----------------------");
		Auto rennkiste = new Auto ("Chrysler", "pink");
		rennkiste.sagHersteller();
		System.out.println(rennkiste.getFarbe());
		
		System.out.println("----------------------");
		Cabrio sommerFlitzer = new Cabrio() ;
		sommerFlitzer.sagHersteller();
		sommerFlitzer.fahren();
		
	}

}
