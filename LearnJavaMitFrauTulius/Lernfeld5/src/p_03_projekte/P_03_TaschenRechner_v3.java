/*
 * Beschreibung : Das ist ein Quantum Taschenrechner
 * Author Projektgruppe Hari, Ehsan, Mustafa
 * Datum 24.05.2023 v3
 * Version Quantum Elon Musk 2023 				 
 */


package p_03_projekte;

import javax.swing.*;
import java.text.DecimalFormat;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.io.*;




public abstract class P_03_TaschenRechner_v3 extends JFrame implements ActionListener {
	
	 private JTextField textField;
	    private double firstNumber;
	    private String operator;

	    public P_03_TaschenRechner_v3() {
	        setTitle("Quantum Taschenrechner Elon Musk");
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setSize(800, 800);
	        setResizable(false);
	        setLocationRelativeTo(null);

	        JPanel panel = new JPanel(new BorderLayout());

	        textField = new JTextField(20);
	        textField.setPreferredSize(new Dimension (280,40));
	        textField.setFont(new Font("Arial", Font.PLAIN,20));
	        textField.setEditable(false);
	        panel.add(textField, BorderLayout.NORTH);

	        JPanel buttonPanel = new JPanel(new GridLayout(6, 4,20,20));

	        String[] buttonLabels = {
	                "7", "8", "9", "/",
	                "4", "5", "6", "*",
	                "1", "2", "3", "-",
	                "0", ".", "=", "+",
	                "sin", "cos", "tan", "√",
	                "^"
	        };

	        for (String label : buttonLabels) {
	            JButton button = new JButton(label);
	            button.addActionListener(this);
	            buttonPanel.add(button);
	        }

	        panel.add(buttonPanel, BorderLayout.CENTER);
	        add(panel);
	        pack();
	        setLocationRelativeTo(null);
	        setVisible(true);
	    }

	
	
	

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
	
	public static double prozentRechner (double zahl1, double zahl2) {
	    return zahl1*(zahl2/100);
	}
	
	public static double modulus (double zahl1, double zahl2) {
		return zahl1 % zahl2 ;
	}
	
	public static double kosinusFunktion (double zahl1) {
		return Math.cos(Math.toRadians(zahl1));
	}
	
	public static double sinusFunktion (double zahl1) {
		return Math.sin(Math.toRadians(zahl1));
	}
	
	public static double tangensFunktion (double zahl1) {
		return Math.tan(Math.toRadians(zahl1));
	}
	
	public static double kotangensFunktion (double zahl1) {
		return (Math.cos(Math.toRadians(zahl1)))/(Math.sin(Math.toRadians(zahl1))) ;
	}
	
	
	public static void main (String[] args) {
		
		
		double zahl1;
		double zahl2;
		double ergebnis = 0;
		
		String[] operationen = {"+", "-", "*", "/", "modulus", "wurzel","prozentRechner", "kosinusFunktion", "sinusFunktion", "tangensFunktion", "kotangensFunktion"};
		String operation = (String) JOptionPane.showInputDialog(null, "Wählen Sie eine Operation aus:", "Willkommen Quantum Taschen Rechner, Version Elon Musk",
                JOptionPane.PLAIN_MESSAGE, null, operationen, operationen[0]);
		
		
		if (operation=="wurzel") {
			zahl1 = Double.parseDouble(JOptionPane.showInputDialog("Geben Sie eine Zahl ein:"));
			ergebnis = wurzeln (zahl1);
		} else if(operation == "prozentRechner") {
			zahl1 = Double.parseDouble(JOptionPane.showInputDialog("Geben Sie bitte die Zahl ein,  dass Sie prozent rechnen möchten:"));
	        zahl2 = Double.parseDouble(JOptionPane.showInputDialog("Wie viel Prozent möchten Sie :"));
	        ergebnis = prozentRechner(zahl1,zahl2);
		} else if(operation == "kosinusFunktion") {
			zahl1 = Double.parseDouble(JOptionPane.showInputDialog("Geben Sie eine Zahl ein (im Gradmaß):"));
	        ergebnis = kosinusFunktion(zahl1);
		} else if(operation == "sinusFunktion") {
			zahl1 = Double.parseDouble(JOptionPane.showInputDialog("Geben Sie eine Zahl ein (im Gradmaß):"));
	        ergebnis = sinusFunktion(zahl1);
		} else if(operation == "tangensFunktion") {
			zahl1 = Double.parseDouble(JOptionPane.showInputDialog("Geben Sie eine Zahl ein (im Gradmaß):"));
	        ergebnis = tangensFunktion(zahl1);
		} else if(operation == "kotangensFunktion") {
			zahl1 = Double.parseDouble(JOptionPane.showInputDialog("Geben Sie eine Zahl ein (im Gradmaß):"));
	        ergebnis = kotangensFunktion(zahl1);
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
	        case "modulus":
	            ergebnis = modulus (zahl1, zahl2);
	            break;
	           
		}
	           
		}
        		
        JOptionPane.showMessageDialog(null, "Das Ergebnis ist: " + ergebnis, "Ergebnis", JOptionPane.PLAIN_MESSAGE);
		
        
        

       
	}
	
}
