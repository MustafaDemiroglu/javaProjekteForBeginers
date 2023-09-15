package actions;

import java.awt.Color;

import game.Frucht;
import game.GameOver;
import game.Spiel;

public class Kollision {

	// für Frucht reset benötigt, wenn man den Frucht nicht rechtzeitig nehmen kann
	// public static boolean frucht ;

	// Wand --> gameOver
	public static boolean kollisionWand() {

		// wenn es kollidiert return true , wenn nicht dann false
		return (Spiel.kopf.getX() < 0 || Spiel.kopf.getX() > 15 || Spiel.kopf.getY() < 0 || Spiel.kopf.getY() > 15);

	}

	// sich selbst --> gameOver
	public static boolean kollisionKoerper() {
		for (int i = 0; i < Spiel.schwanz.size(); i++) {
			if (Spiel.kopf.getX() == Spiel.schwanz.get(i).getX() && Spiel.kopf.getY() == Spiel.schwanz.get(i).getY()
					&& !Spiel.schwanz.get(i).isWait()) {

				return true;
			}
		}
		return false;

	}

	// Frucht --> addSchwanz(), Punkte
	public static void kollisionFrucht() {

		if (Spiel.kopf.getX() == Spiel.frucht.getX() && Spiel.kopf.getY() == Spiel.frucht.getY()) {
			// System.out.println("Hunger");
			Spiel.addSchwanz();
			// Spiel.frucht.reset();
			// Punkte
			// Spiel.punkte+=1 ;

			
			
			// Andere Punkte für verschiedene Farbe und auch verbotene Fruchte 
			
			if (Frucht.fruchtFarbe == Color.BLUE) {
				Spiel.setSpielGeschwindigkeit(80);
				Spiel.setPunkte(Spiel.getPunkte() * 2);
			}

			if (Frucht.fruchtFarbe == Color.GREEN) {
				Spiel.setSpielGeschwindigkeit(150);
				Spiel.setPunkte(Spiel.getPunkte()+2);
			}

			if (Frucht.fruchtFarbe == Color.YELLOW) {
				Spiel.setSpielGeschwindigkeit(200);
				Spiel.setPunkte(Spiel.getPunkte()+0);
				Spiel.gameOverFrucht();
			}

			if (Frucht.fruchtFarbe == Color.CYAN) {
				Spiel.setSpielGeschwindigkeit(200);
				Spiel.setPunkte(Spiel.getPunkte() + 2);
			}

			if (Frucht.fruchtFarbe == Color.PINK) {
				Spiel.setSpielGeschwindigkeit(300);
				Spiel.setPunkte(Spiel.getPunkte() + 1);
			}

			if (Frucht.fruchtFarbe == Color.MAGENTA) {
				Spiel.setSpielGeschwindigkeit(170);
				Spiel.setPunkte(Spiel.getPunkte() + 1);
			}

			if (Frucht.fruchtFarbe == Color.WHITE) {
				Spiel.setSpielGeschwindigkeit(100);
				Spiel.setPunkte(Spiel.getPunkte() + 3);
			}

			if (Frucht.fruchtFarbe == Color.ORANGE) {
				Spiel.setSpielGeschwindigkeit(130);
				Spiel.setPunkte(Spiel.getPunkte() + 4);
			}


			// für die best Bestscore
			if (Spiel.punkte > Spiel.bestepunkte) {
				Spiel.bestepunkte = Spiel.punkte;
			}
			
			Spiel.waitToMove = true ;
			Spiel.frucht.reset();
		}

	}

}
