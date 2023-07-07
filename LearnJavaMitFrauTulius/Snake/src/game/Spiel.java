package game;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Random;
import gui.Gui;

public class Spiel {
	
	// 1 * Kopf
	public static Kopf kopf = new Kopf(7,7);
	
	// 0 - x Schwanzteilen 
	public static ArrayList<Schwanz> schwanz = new ArrayList<>();
	
	public static Frucht frucht = new Frucht();
	
	
	
	public static boolean waitToMove = false ;

	public static Object frame;
	
	public static void addSchwanz() {
		// Spielbeginn --> Erstes Element an Kopf ansetzen
		if (schwanz.size()<1) {
		schwanz.add(new Schwanz(kopf.getX(), kopf.getY()));
		} else {
			// schon Früchte gefressen
			// --> wie viele Schwanzteile vorhanden
			// neues element ans Ende setzen
			schwanz.add(new Schwanz(schwanz.get(schwanz.size()-1).x, schwanz.get(schwanz.size()-1).y ));	
		}
	}
	
	public static void bewegen() {
		
		// weitere Schwanzteie --> orinieren sich an position von vorhänger 
		if(schwanz.size()>=2) {
			for (int i = schwanz.size()-1;i>=1;i--) {
				schwanz.get(i).setX(schwanz.get(i-1).getX());
            	schwanz.get(i).setY(schwanz.get(i-1).getY());
	            } 
			}
		
		
		// erstes Schwanzteil --> orientiert sich an position Kopf
		 if (schwanz.size()>=1) {
			 schwanz.get(0).setX(kopf.getX());
         	 schwanz.get(0).setY(kopf.getY());
	        }
		
		// kopf bewegen
		// Rechts --> x+1
		// Links --> x-1
		// Runter --> y+1
		// Hoch --> y-1
		switch (kopf.getRichtung()) {
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
	public static Point position(int x,int y) {
		Point p = new Point(0,0);
		
		// Felder 32*32
		// z.B 3 Feld --> 3*32
		p.x = x*32 + Gui.xoff;
		p.y = y*32 + Gui.yoff;
		return p ;
		
	}

}
