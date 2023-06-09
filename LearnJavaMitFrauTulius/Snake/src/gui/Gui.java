package gui;

import javax.swing.JFrame;

import actions.KeyHandler;

public class Gui {
	
	JFrame jf;
	Elemente e;
	
	// Breite und Höhe des Fensters
	public static int width = 570 ;
	public static int height = 620;
	
	// offset für spielfeld
	// Abstand von links
	public static int xoff = 20;
	
	//Abstand von oben
	public static int yoff = 20;
	
	public void spielFeldAnlagen( ) {
		// Erzeugt neues Object der Klasse Jframe --> neus Fenster
		jf = new JFrame ("Friss die Frucht");
		// Größe des Frames festlegen
		jf.setSize(width, height);
		// Öffnet sich standartdmäsig links obn
		// soll mittig auf Bildschrim sein
		jf.setLocationRelativeTo(null);
		// Größe soll nicht veränderba sein
		jf.setResizable(false);
		// Layoutmanager ausschalten
		jf.setLayout(null);
		// Program beenden bei x (Fenster ausschalten)
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.addKeyListener(new KeyHandler());
		
		// Tastatureingaben werden nur gelesen , wenn Frame den focus hat
		jf.requestFocus();
		
		// weitere Elemente dem Frame hinzufügen
		e = new Elemente();
		// wo soll Element positioniert werden
		// Abstand von links Abstand von oben Breite und Höhe
		e.setBounds(0, 0, 570, 620);
		
		// Element dem Frame hinzufügen
		jf.add(e);
		// Element sichtbar stellen
		e.setVisible(true);
		
		// Frame sichtbar machen
		jf.setVisible(true);
	}
	
	

}
