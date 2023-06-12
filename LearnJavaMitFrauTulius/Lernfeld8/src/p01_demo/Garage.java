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
	}

}
