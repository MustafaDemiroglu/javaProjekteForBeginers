package game;

import javax.swing.JOptionPane;

import clock.GameClock;

public class GameOver {

	    // Gameover and Game enden und exit

		public static void gameOverFrucht() {

			GameClock.spielen = false;
			int option = JOptionPane.showConfirmDialog(null, "Giftige Frucht gegessen! Spiel neu starten?", null, 1);
			switch (option) {
			case 0:
				Spiel.setPunkte(0);
				Spiel.setSpielGeschwindigkeit(200);
				Spiel.schwanz.clear();
				Spiel.kopf.setX(7);
				Spiel.kopf.setY(7);
				GameClock.spielen = true;
				break;
			default:
				System.exit(0);
				break;
			}
		}

		
		public static void gameOverWand() {

			GameClock.spielen = false;
			int option = JOptionPane.showConfirmDialog(null, "Gegen die Wand! Spiel neu starten?", null, 1);
			switch (option) {
			case 0:
				Spiel.setPunkte(0);
				Spiel.setSpielGeschwindigkeit(200);
				Spiel.schwanz.clear();
				Spiel.kopf.setX(7);
				Spiel.kopf.setY(7);
				GameClock.spielen = true;
				break;
			default:
				System.exit(0);
				break;
			}
		}

		public static void gameOverSchwanz() {

			GameClock.spielen = false;
			int option = JOptionPane.showConfirmDialog(null, "Selbst gefressen! Spiel neu starten?", null, 1);
			switch (option) {
			case 0:
				Spiel.setPunkte(0);
				Spiel.setSpielGeschwindigkeit(200);
				Spiel.schwanz.clear();
				Spiel.kopf.setX(7);
				Spiel.kopf.setY(7);
				// Spiel.kopf.setRichtung();
				GameClock.spielen = true;
				break;
			default:
				System.exit(0);
				break;
			}
		}

		
		
		
	
	
	
	
	/* 
    
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
	    	Spiel.setSpielGeschwindigkeit(200);
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
		    	Spiel.setSpielGeschwindigkeit(200);
		    	// Punkte
		    	Spiel.punkte=0;
            }
        }
    	}

    
  */
	
	
	
}
