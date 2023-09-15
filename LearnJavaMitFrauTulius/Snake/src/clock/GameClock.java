package clock;

import actions.Kollision;
import game.GameOver;
import game.Spiel;

public class GameClock extends Thread {

	// Endlosschleife, die Spiel laufen lässt
	public static boolean spielen = true;
	
	public void run() {
		while(spielen) {
			try {
				// Pause
				sleep(Spiel.getSpielGeschwindigkeit());
				Spiel.bewegen();
			    Spiel.waitToMove = false;
			    Kollision.kollisionFrucht();
			    
			    // Game Over wenn kopf kollisionwand
			    if(Kollision.kollisionWand()) {
			    	Spiel.gameOverWand();
			    }
			    
			    // Game Over wenn kopf kollision sich selbst
			    if(Kollision.kollisionKoerper()) {
			    	Spiel.gameOverSchwanz();
			    }
			    
			    } catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	
	
}
