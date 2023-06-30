package actions;

import gui.Gui;
import clock.GameClock;
import clock.FruchtClock;
import game.Frucht;


public class Main {
	
	public static void main (String[] args) {
		
		// Oberfläche anlegen und starten
		// Neues Objekt erzeugen --> g
		// an Objekt Methode binden
		
		Gui g = new Gui();
		GameClock gc = new GameClock();
		
		Frucht frucht = new Frucht();
		FruchtClock fruchtClock = new FruchtClock();
        
        // Rufen Sie die Methoden der FruchtClock-Klasse auf
        System.out.println("Frucht-Position: (" + fruchtClock.getX() + ", " + fruchtClock.getY() + ")");
        
        fruchtClock.resetFrucht();
        System.out.println("Neue Frucht-Position: (" + fruchtClock.getX() + ", " + fruchtClock.getY() + ")");
		
        // Rufen Sie die Methoden der Frucht-Klasse auf
        System.out.println("Frucht-Position: (" + frucht.getX() + ", " + frucht.getY() + ")");
        
        frucht.reset();
        System.out.println("Neue Frucht-Position: (" + frucht.getX() + ", " + frucht.getY() + ")");
        
        
        
		g.spielFeldAnlagen();
		gc.start();
		
	}

}
