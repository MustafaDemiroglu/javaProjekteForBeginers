package game;

import java.awt.Point;
import java.util.ArrayList;

import gui.Gui;

public class Spiel {

	// 1 x Kopf
	public static Kopf kopf = new Kopf(7, 7);

	// 0 - x Schwanzteilen
	public static ArrayList<Schwanz> schwanz = new ArrayList<>();

	public static Frucht frucht = new Frucht();
	
	public static boolean waitToMove = false;
	
	public static void addSchwanz() {
		// Spielbeginn --> erstes Element an Kopf ansetzen
		if (schwanz.size() < 1) {
			schwanz.add(new Schwanz(kopf.getX(), kopf.getY()));
		} else {
			// schon Früchte gefressen
			// --> Wieviele Schwanzteile vorhanden?
			// --> neues Element ans Ende setzen
			schwanz.add(new Schwanz(schwanz.get(schwanz.size()-1).x, schwanz.get(schwanz.size()-1).y ));
			
		}
	}

	public static void bewegen() {
		
		
		// weitere Schwanzteile --> orientieren sich an Position von Vorgänger
		if(schwanz.size() >= 2) {
			for(int i = schwanz.size() - 1; i >= 1; i--) {				
				schwanz.get(i).setX(schwanz.get(i-1).getX());
				schwanz.get(i).setY(schwanz.get(i-1).getY());				
			}
		}		
		
		
		
		//erstes Schwanzteil --> orientiert sich an Position von Kopf 		
		if(schwanz.size() >=1) {
			schwanz.get(0).setX(kopf.getX());
			schwanz.get(0).setY(kopf.getY());			
		}
		
		
		//Kopf bewegen
		// Rechts --> x + 1
		// Links --> x -1
		// Runter --> y + 1
		// Hoch --> y -1
		
		switch(kopf.getRichtung()) {
		case RECHTS:
			kopf.setX(kopf.getX() + 1);
			break;
		case LINKS:
			kopf.setX(kopf.getX() - 1);
			break;
		case HOCH:
			kopf.setY(kopf.getY() - 1);
			break;
		case RUNTER:
			kopf.setY(kopf.getY() + 1);
			break;
		}
		

	}
	
	// Pixel/Punkte in Koordinaten umwandeln
	public static Point position(int x, int y) {
		
		Point p = new Point(0, 0);
		
		// Felder 32x32 
		// z.B. 3 Feld --> 3 * 32
		p.x = x * 32 + Gui.xoff;
		p.y = y * 32 + Gui.yoff;
		
		return p;
		
	}

}
