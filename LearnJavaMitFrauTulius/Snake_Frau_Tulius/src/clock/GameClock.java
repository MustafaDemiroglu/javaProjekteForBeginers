package clock;

import actions.Kollision;
import game.Spiel;

public class GameClock extends Thread {

	// Endlosschleife, die Spiel laufen lässt
	boolean spielen = true;
	
	public void run() {
		while(spielen) {
			try {
				// Pause
				sleep(200);
				Spiel.bewegen();
			    Spiel.waitToMove = false;
			    Kollision.kollisionFrucht();
			    if(Kollision.kollisionWand()) {
			    	// Spiel beenden
			    	System.exit(0);
			    }
				
				// Warten
				// Kollisionen
				
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	
	
	
	
}
