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
			    
			    // Kollisionen
			    if(Kollision.kollisionWand() || Kollision.kollisionKoerper()) {
			    	Spiel.schwanz.clear();
			    	Spiel.kopf.setX(7);
			    	Spiel.kopf.setY(7);
			    	
			    	// Punkte
			    	Spiel.punkte=0;
			    	
			    	// Spiel beenden
				    // System.exit(0);
			    }
			    
			    
			    if (Kollision.kollisionKoerper()) {
			    	Spiel.schwanz.clear();
			    	Spiel.kopf.setX(7);
			    	Spiel.kopf.setY(7);
			    	
			    	// Punkte
			    	Spiel.punkte=0;
			    	
			    	// Spiel beenden
				    // System.exit(0);
			    }
				
				// Warten
				
			    
			 
				
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	
	
	
	
}
