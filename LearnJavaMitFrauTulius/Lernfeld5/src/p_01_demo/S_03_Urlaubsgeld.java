package p_01_demo;

import java.util.Scanner;
import java.time.LocalDate;

public class S_03_Urlaubsgeld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 *  Urlaubsgeld erhält, wer Urlaub nimmt
		 *  Urlaubsgeld wird gezahlt wenn länger als 3 Jahr im Unternehmen
		 *  Wer länger als 10 Jahre beschäftigt ist erhält einen zuschlag von 25% auf Urlaubsgeld
		 *  Pro Taggibt es 1/30 Monatsgehalts
		 */
		
		int urlaubsTag ;
		int arbeitsDauer;
		double monatsGehalt ;
		double urlaubsGeld ;
		double gehaltMitUrlaubsGeld ;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Wie viele Tag euralub haben Si in diesem Monat" + "\nUrlaubstag :");
		urlaubsTag = scan.nextInt();
		System.out.println("Wie viele Gehalt erhalten Sie in diesem Monat  " + " \nMonatsgehalt : ");
		monatsGehalt = scan.nextDouble();
		System.out.println("Seit Wann arbeiten Sie an dieser Firma" + "\nSchreiben sie nur das Jahr :");
		int jahr = scan.nextInt();
		
		LocalDate myObj = LocalDate.now();
		arbeitsDauer =  myObj.getYear()- jahr ;	
		
		if (urlaubsTag>0) {
			if (arbeitsDauer>3) {
				if (arbeitsDauer>10) {
					urlaubsGeld = 1.25*((monatsGehalt/30)*urlaubsTag);
					System.out.println("Da Sie diesen monat " + urlaubsTag + " Tage Urlaub haben. Und Sie arbeiten seit " + arbeitsDauer +" Jahren in unserer Firma. "
							+ "\nErhalten Sie diesen Monat zusätzlich " + urlaubsGeld+ " Euro" + " \nWir wünschen Ihnen viel Spaß in Ihrem Urlaub "  );
				} else {
					urlaubsGeld = (monatsGehalt/30)*urlaubsTag;
					System.out.println("Da Sie diesen monat " + urlaubsTag + "  Urlaub haben. Und arbeiten Sie seit " + arbeitsDauer +" Jahren in unserer Firma. "
							+ "\nErhalten Sie diesen Monat zusätzlich " + urlaubsGeld + " Euro" + " \nWir wünschen Ihnen viel Spaß in Ihrem Urlaub "  );
				}
			} else {
				urlaubsGeld = 0.00;
				System.out.println("Da Sie diesen monat " + urlaubsTag + " Tage Urlaub haben." +" \nWir wünschen Ihnen viel Spaß in Ihrem Urlaub " );
			}
		} else {
			urlaubsGeld = 0.00;
		}
		
		gehaltMitUrlaubsGeld = monatsGehalt + urlaubsGeld;
		
		System.out.println("Sie bekommen diesen Monat insgesamt " + gehaltMitUrlaubsGeld + " Euro");
		
	}

}
