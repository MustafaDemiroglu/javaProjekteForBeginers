package clock;

import actions.Kollision;
import game.Spiel;
import javax.swing.JOptionPane;

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
			    	JOptionPane.showMessageDialog(null, "Du hast leider Pech! Vielleicht nächstes Mal?");
			    	
			    	int option = JOptionPane.showConfirmDialog(null, "Möchtest du weiterspielen?", "Spiel beendet", JOptionPane.YES_NO_CANCEL_OPTION);
			    	if (option == JOptionPane.YES_OPTION) {
			    		// Der Spieler möchte weiterspielen
                        // Setze das Spiel zurück
			    		Spiel.schwanz.clear();
				    	Spiel.kopf.setX(7);
				    	Spiel.kopf.setY(7);
				    	// Punkte
				    	Spiel.punkte=0;
			    	} else {
			    		int option1 = JOptionPane.showConfirmDialog(null, "Möchtest du das Spiel jetzt beenden?", "Spiel wird ausgeschlossen", JOptionPane.YES_NO_OPTION);
				    	if (option1 == JOptionPane.YES_OPTION) {
				    		// Spiel beenden
						    System.exit(0);
				    		
				    	} else {
				    		// Der Spieler möchte weiterspielen
	                        // Setze das Spiel zurück
				    		Spiel.schwanz.clear();
					    	Spiel.kopf.setX(7);
					    	Spiel.kopf.setY(7);
					    	// Punkte
					    	Spiel.punkte=0;
	                    }
                    }
			    	}
			    
			    
			    
			    
			    
			    if (!Spiel.pause) {
                    // Nur wenn das Spiel nicht pausiert ist, fortsetzen
                    sleep(200);
                    Spiel.bewegen();
                    Kollision.kollisionFrucht();
			    }
			    
			    
			    
			    
              
			    } catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	
	// Warten
	
	
}
