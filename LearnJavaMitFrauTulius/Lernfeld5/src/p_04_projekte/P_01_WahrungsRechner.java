/*  Beschreibung 	:Diese Anwendung umtauscht die Wahrungen
 * 					 Ihr Wahrung ist in anderen Währungen Wert 	   
 *  Author			: Maik German, Mahmut Aslan, Mustafa Demiroglu
 *  Datum 			: 05.05.2023
 *  Version 		: Operation.Mahlzeit.Number.100 :-)
 * */

package p_04_projekte;

import java.util.*;
import java.text.DecimalFormat ;

public class P_01_WahrungsRechner {

	public static void main(String[] args) 
    {
        // Variablen eklarieren
		double rupee,dollar,pound,code,euro,yen,lira;
        DecimalFormat df = new DecimalFormat("##.###");
        Scanner scan = new Scanner(System.in);
        System.out.println("Geben Sie Wahrungstyp ein, dass sie umtauschen möchten"); 
        System.out.println("1:Rupees\n2:Dollar\n3:Pound\n4:Euro\n5:Yen\n6:Lira"); 
        code=scan.nextInt();
        
        
        
        // Für Rupees umtauschen
        if(code == 1)
        {
            System.out.println("Geben sie den Betrag als rupees");
            rupee = scan.nextFloat();
            dollar = rupee / 66;
            System.out.println("Dollar : "+df.format(dollar));
            pound = rupee / 98;
            System.out.println("Pound : "+df.format(pound));
            euro = rupee / 72;
            System.out.println("Euro : "+df.format(euro));
            yen = rupee / 0.55;
            System.out.println("Yen : "+df.format(yen));
            lira = rupee / 100 ;
            System.out.println("Lira : " + df.format(lira));
        }
        // Für Dollar umtauschen
        else if (code == 2)
        {
            System.out.println("Geben sie den Betrag als dollar");
            dollar = scan.nextFloat();
            rupee = dollar * 66;
            System.out.println("Rupees : "+df.format(rupee));
            pound = dollar * 0.67;
            System.out.println("Pound : "+df.format(pound));
            euro = dollar * 0.92;
            System.out.println("Euro : "+df.format(euro));
            yen = dollar * 120.90;
            System.out.println("Yen : "+df.format(yen));
            lira = dollar / 100 ;
            System.out.println("Lira : " + df.format(lira));
        }
        // Für Pound umtauschen
        else if(code == 3)
        {
            System.out.println("Geben sie den Betrag als Pound");
            pound = scan.nextFloat();
            rupee = pound * 98;
            System.out.println("Rupees : "+df.format(rupee));
            dollar = pound * 1.49;
            System.out.println("Dollar : "+df.format(dollar));
            euro = pound * 1.36;
            System.out.println("Euro : "+df.format(euro));
            yen = pound * 179.89;
            System.out.println("Yen : "+df.format(yen));
            lira = pound / 100 ;
            System.out.println("Lira : " + df.format(lira));
        }
        // Für Euro umtaushen
        else if(code == 4)
        {
            System.out.println("Geben sie den Betrag als Euro");
            euro = scan.nextFloat();
            rupee = euro * 72;
            System.out.println("Rupees : "+df.format(rupee));
            dollar = euro * 1.09;
            System.out.println("Dollar : "+df.format(dollar));
            pound = euro * 0.73;
            System.out.println("Pound : "+df.format(pound));
            yen = euro * 131.84;
            System.out.println("Yen : "+df.format(yen));
            lira = euro / 100 ;
            System.out.println("Lira : " + df.format(lira));
        }
        // Für Yen umtauschen
        else if(code == 5)
        {
            System.out.println("Geben sie den Betrag als Yen");
            yen = scan.nextFloat();
            rupee = yen * 0.55;
            System.out.println("Rupees : "+df.format(rupee));
            dollar = yen * 0.01;
            System.out.println("Dollar : "+df.format(dollar));
            pound = yen * 0.01;
            System.out.println("Pound : "+df.format(pound));
            euro = yen * 0.01;
            System.out.println("Euro : "+df.format(euro));
            lira = yen / 100 ;
            System.out.println("Lira : " + df.format(lira));
        }
        
     // Für Lira umtauschen
        else if(code == 5)
        {
            System.out.println("Geben sie den Betrag als Lira");
            lira = scan.nextFloat();
            rupee = lira * 0.55;
            System.out.println("Rupees : "+df.format(rupee));
            dollar = lira * 0.01;
            System.out.println("Dollar : "+df.format(dollar));
            pound = lira * 0.01;
            System.out.println("Pound : "+df.format(pound));
            euro = lira * 0.01;
            System.out.println("Euro : "+df.format(euro));
            lira = lira / 1.00 ;
            System.out.println("Lira : " + df.format(lira));
        }
        
        
        else {
            System.out.println("Gegeben Code ist nicht rightig");
        }
    scan.close();
}

}
