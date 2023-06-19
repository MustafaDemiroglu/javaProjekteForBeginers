package Fuhrpark;

public class Garage {
	
	public static void  main (String [] args) {
		System.out.println("Willkommen in der Garage");
		
		// Objekte erzeugen
		// Standardkonstruktor
		
		Auto standardAuto = new Auto();
		standardAuto.sagHersteller();
		// System.out.println(standardAuto.getFarbe());
		standardAuto.getFarbe();
		
		standardAuto.setFarbe("lila");
		// System.out.println(standardAuto.getFarbe());
		standardAuto.getFarbe();
		
		Auto auto1 = new Auto ("Peugeot") ;
		auto1.sagHersteller();
		// System.out.println(auto1.getFarbe());
		auto1.getFarbe();
		
		Auto auto2 = new Auto("Mercedes", "silber");
		auto2.sagHersteller();
		// System.out.println(auto2.getFarbe());
		auto2.getFarbe();
		
		Auto auto3 = new Auto ("Opel"); 
		auto3.sagHersteller();
		
		Cabrio meinCabrio = new Cabrio();
		meinCabrio.getFarbe();
		meinCabrio.oeffneDach();
		
		SUV meinSUV = new SUV();
		meinSUV.starteKubel();
		meinSUV.getFarbe();
		
		Cabrio meinCabrio2 = new Cabrio("Hardtop");
		meinCabrio2.oeffneDach(); 
		
		Fahrer horst = new Fahrer ("Horst Müler");
		Fahrer gisela = new Fahrer ("Gisela Beispiel");
		
		System.out.println("+++++++++++ FAHRER ++++++++++++++");
		standardAuto.fahren(100,horst);
		standardAuto.fahren(50, gisela);
		System.out.println(standardAuto.kilometerstand);
		auto2.fahren(75, horst);
		
		System.out.println("+++++++++ MOTOR +++++++++++");
		// Motor und Auto unabhöngig von einander
		Motor motor1 = new Motor();
		Auto herbie = new Auto(motor1);
		System.out.println("Über motor : " + motor1.getMotorPS());
		System.out.println("Über auto : " + herbie.motor.getMotorPS());
		
		// Auto soll verschrottet werden
		herbie = null ;
		// herbie.sagHersteller() ;
		// System.out.println("Über auto : " + herbie.motor.getMotorPS());
		System.out.println("Über Motor : " + motor1.getMotorPS());
		// Motor verschrotten
		motor1 = null ;
		System.out.println("Über Motor : " + motor1.getMotorPS());
		
		// Motor wird mit Auto verschrotten
		// Komposition
		Auto flitzer = new Auto(new  Motor(250));
		System.out.println(flitzer.motor.getMotorPS());
		// Schrottpresse
		flitzer = null ;
		System.out.println(flitzer.motor.getMotorPS());
		
	}
}

