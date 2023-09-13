package gui;

import javax.swing.JFrame;

import actions.KeyHandler;
import game.Spiel;

public class Gui {
	
	JFrame jf;
	Elemente e;
	
	// Breite und Höhe des Fensters
	static int width = 570;
	static int height = 670;
	
	// Offset für Spielfeld
	// Abstand von links
	public static int xoff = 20;
	// Abstand von oben
	public static int yoff = 20;
	
	public void spielfeldAnlegen() {
		
		// Erzeugt neues Objekt der Klasse JFrame --> neues Fenster
		jf = new JFrame("Friss die Frucht");
		// Größe des Frames festlegen
		jf.setSize(width, height);
		//Öffnet sich standm. links oben
		//soll mittig auf Bildschirm sein
		jf.setLocationRelativeTo(null);
		//Größe soll nicht veränderbar sein
		jf.setResizable(false);
		//Layoutmanager ausschalten
		jf.setLayout(null);
		// Programm beenden bei x
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jf.addKeyListener(new KeyHandler());
		
		// Tastatureingaben werden nur gelesen, wenn Frame den Focus hat
		jf.requestFocus();
		
		// weitere Elemente dem Frame hinzufügen
		e = new Elemente();
		// wo soll Element positioniert werden
		// Abstand von links, Abstand von oben, Breite und Höhe
		e.setBounds(0, 0, width, height);
		
		// Element dem Frame hinzufügen
		jf.add(e);
		// Element sichtbar stellen
		e.setVisible(true);
		
		
		// Frame sichtbar machen
		jf.setVisible(true);
		
	}

	
}
