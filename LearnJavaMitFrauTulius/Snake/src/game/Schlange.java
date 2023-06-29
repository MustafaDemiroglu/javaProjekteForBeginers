package game;

import java.awt.Point;
import java.util.ArrayList;

import gui.Gui;

public class Schlange {
	
	// 1 * kopf
	public static Kopf kopf = new Kopf(7,7);
	
	// 0 - x Schwanzteilen 
	public static ArrayList<Schwanz> schwanz = new ArrayList<>();
	
	
	public void addSchwanz() {
		// Spielbeginn --> erstes Element an Kopf ansetzen
		if (schwanz.size()<1) {
		schwanz.add(new Schwanz(kopf.getX(), kopf.getY()));
		} else {
			// schon Früchte gefressen
			// --> wie viele Schwanzteile vorhanden
			// neues element ans Ende setzen
			schwanz.add(new Schwanz(schwanz.get(schwanz.size()-1).x, schwanz.get(schwanz.size()-1).y ));	
		}
	}
	
	public void bewegen() {
		
	}
	
	// Pixel/Punkte in Koordinaten umwandeln
	public static Point position(int x,int y) {
		Point p = new Point(0,0);
		
		// Felder 32*32
		// z.B 3 Feld --> 3*32
		p.x = x*32 + Gui.xoff;
		p.y = y*32 + Gui.yoff;
		return p ;
		
	}

}
