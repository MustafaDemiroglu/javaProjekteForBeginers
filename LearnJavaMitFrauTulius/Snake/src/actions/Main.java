package actions;

import gui.Gui;
import clock.GameClock;

public class Main {
	
	public static void main (String[] args) {
		
		// Oberfläche anlegen und starten
		// Neues Objekt erzeugen --> g
		// an Objekt Methode binden
		
		Gui g = new Gui();
		GameClock gc = new GameClock();
		
		g.spielFeldAnlagen();
		gc.start();
		
	}

}
