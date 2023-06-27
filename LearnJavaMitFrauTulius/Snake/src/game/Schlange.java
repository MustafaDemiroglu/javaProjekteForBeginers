package game;

import java.util.ArrayList;

public class Schlange {
	
	// 1 * kopf
	Kopf kopf = new Kopf(7,7);
	
	// 0 - x Schwanzteilen 
	ArrayList<Schwanz> schwanz = new ArrayList<>();
	
	
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

}
