package p_03_projekte;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import java.io.*;

public class P_03_TaschenRechner {

	public static double addieren (double zahl1, double zahl2) {
		return zahl1+zahl2;
	}
	
	public static double subtrahieren (double zahl1, double zahl2) {
		return zahl1-zahl2;
	}
	
	public static double dividieren (double zahl1, double zahl2) {
		return zahl1/zahl2;
	} 
	
	public static double multiplizieren (double zahl1, double zahl2) {
		return zahl1*zahl2;
	}
	
	public static double wurzeln (double zahl1) {
		return Math.sqrt(zahl1);
	}   

	public static void main (String[] args) {
	
		double zahl1;
		double zahl2;
		double ergebnis = 0;
		
		String[] operationen = {"+", "-", "*", "/", "wurzel"};
		String operation = (String) JOptionPane.showInputDialog(null, "Wählen Sie eine Operation aus:", "Willkommen Quantum Taschen Rechner, Version Elon Musk",
                JOptionPane.PLAIN_MESSAGE, null, operationen, operationen[0]);
		
		
		if (operation=="wurzel") {
			zahl1 = Double.parseDouble(JOptionPane.showInputDialog("Geben Sie eine Zahl ein:"));
			ergebnis = wurzeln (zahl1);
		} else {
			zahl1 = Double.parseDouble(JOptionPane.showInputDialog("Geben Sie die erste Zahl ein:"));
	        zahl2 = Double.parseDouble(JOptionPane.showInputDialog("Geben Sie die zweite Zahl ein:"));
	        
	        switch (operation) {
	        case "+":
	            ergebnis = addieren (zahl1,zahl2);
	            break;
	        case "-":
	            ergebnis = subtrahieren (zahl1, zahl2);
	            break;
	        case "*":
	            ergebnis = multiplizieren (zahl1, zahl2);
	            break;
	        case "/":
	            ergebnis = dividieren (zahl1, zahl2);
	            break;
		}
		}
        
	    
        JOptionPane.showMessageDialog(null, "Das Ergebnis ist: " + ergebnis, "Ergebnis", JOptionPane.PLAIN_MESSAGE);
		
	}
	
}
