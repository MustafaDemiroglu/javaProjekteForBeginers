package actions;

import game.Spiel;

public class Kollision {

	// Wand --> gameOver
	public static boolean kollisionWand() {
		
		// wenn es kollidiert return true , wenn nicht dann false
		return (Spiel.kopf.getX() < 0 || Spiel.kopf.getX() > 15 || Spiel.kopf.getY() < 0 || Spiel.kopf.getY() > 15);
		
	}
	
	
	// sich selbst --> gameOver
	public static boolean kollisionKoerper() {
		for (int i = 0; i < Spiel.schwanz.size(); i++) {
			if (Spiel.kopf.getX() == Spiel.schwanz.get(i).getX()
					&& Spiel.kopf.getY() == Spiel.schwanz.get(i).getY() && !Spiel.schwanz.get(i).isWait()) {

				return true;
			}
		}
		return false;

	}
	
	// Frucht --> addSchwanz(), Punkte
	public static void kollisionFrucht() {
		
		if(Spiel.kopf.getX() == Spiel.frucht.getX() && Spiel.kopf.getY() == Spiel.frucht.getY()) {
			// System.out.println("Hunger");
			Spiel.addSchwanz();
			Spiel.frucht.reset();
		}
		
	}
	
	
	
	
}
