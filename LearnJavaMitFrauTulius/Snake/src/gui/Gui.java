package gui;

import javax.swing.JFrame;

public class Gui {
	
	JFrame jf;
	
	// Breite und Höhe des Fensters
	int width = 580 ;
	int height = 620;
	
	// offset für spielfeld
	// Abstand von links
	int xoff = 20;
	
	//Abstand von oben
	int yoff = 20;
	
	public void spielFeldAnlagen( ) {
		// Erzeugt neues Object der Klasse Jframe --> neus Fenster
		jf = new JFrame ("Friss die Frucht");
		// Größe des Frames festlegen
		jf.setSize(width, height);
		// Öffnet sich standartdmäsig links obn
		// soll mittig auf Bildschrim sein
		jf.setLocationRelativeTo(null);
		
		
		
		
		// Frame sichtbar machen
		jf.setVisible(true);
	}
	
	

}
