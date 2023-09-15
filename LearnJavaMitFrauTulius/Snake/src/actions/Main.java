package actions;

import clock.GameClock;
import clock.FruchtClock;
import gui.Gui;
import game.Frucht;
import game.Spiel;

public class Main {

	public static void main(String[] args) {
		
		// Oberfläche anlegen und starten
		// Neues Objekt erzeugen --> g
		// an Objekt Methode binden
		
		Gui g = new Gui();
		GameClock gc = new GameClock();
		FruchtClock fc = new FruchtClock();
		
		g.spielfeldAnlegen();
		gc.start();
		fc.start();

	}

}
