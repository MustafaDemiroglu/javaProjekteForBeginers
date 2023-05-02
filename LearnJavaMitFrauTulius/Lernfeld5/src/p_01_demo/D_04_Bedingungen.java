package p_01_demo;

public class D_04_Bedingungen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 5 ;
		
		// einfache Bedingungsprüfung
		
		if (x>5) {
			System.out.println("x ist größer als 5") ;
		} 
		
		if (x>5) {
			System.out.println("x ist größer als 5") ;
		} else {
			System.out.println("x ist kleiner oder gleich 5") ;
		}
		
		// logisches UND && alle Bedingungen müssen zutreffend
		
		x = 8 ;
		if (x>5 && x<10) {
			System.out.println("x liegt zwischen 5 und 10") ;
		}
		
		// logisches ODER || ine der Bedingungen muss zutreffend sein
		int zahl1 = 6;
		int zahl2 = 6;
		if (zahl1>5 || zahl2>5) {
			System.out.println("Eine oder beide zahlen sind größer als 5");
		}
		
		int y= 1;
		if (y==1) {
			System.out.println("Wert 1") ;
		} else if (y==2) {
			System.out.println("Werr 2") ;
		} else if (y==3) {
			System.out.println("Wert 3") ;
		} else {
			System.out.println("anderer Wert");
		}
		
		System.out.println("Hier Anzege von Switch") ;
		switch (y) {
		case 1:
			System.out.println("Wert 1");
			break;
		case 2:
			System.out.println("Wert 2");
			break;
		case 3:
			System.out.println("Wert 3");
			break;
		default:
			System.out.println("anderer Tag");
		}
		
		String tag = "Dienstag" ;
		switch (tag) {
		case "Montag":
			System.out.println("es ist Montag") ;
			break;
		case "Dienstag":
			System.out.println("es ist Dienstag") ;
			break;
		default:
			System.out.println("anderer Tag");	
		}
		
		// Boolean Bedingungen
		boolean esRegnet = true ;
		boolean schirmDabei = true ;
		if (esRegnet && schirmDabei) {
			System.out.println("Es regnet aber zum glück hast du einen Schirm dabei");
		}
		
		// ! Negation --> kehrt den Wert um -->aus true wird false bzw. aus false wird true
		esRegnet = true ;
		schirmDabei = false ;
		if (esRegnet && !schirmDabei) {
			System.out.println("Gratisdusche") ;
		}
		
		esRegnet = false ;
		schirmDabei = true ;
		if ((esRegnet && schirmDabei) || !esRegnet) {
			System.out.println("du hast Glüch es regnet oder nicht weil du Schirm hast") ;
		}
		
		if (!esRegnet && schirmDabei){
			System.out.println("Schirm unsonst dabei") ;
		}
		
	}

}
