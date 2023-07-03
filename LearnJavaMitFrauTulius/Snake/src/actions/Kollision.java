package actions;

import game.Frucht;
import game.Spiel;

public class Kollision {

	// Wand --> gameOver
	public static boolean kollisionWand() {
		return (Spiel.kopf.getX()<0 || Spiel.kopf.getX()>15 || Spiel.kopf.getY()<0 || Spiel.kopf.getY()>15);
	}
	
	// sich selbst --> gameOver
	public static boolean kollisionKoerper() {
		return false;
	}
	
	
	
	// Frucht --> addschwanz(), Punkte
	public static void kollisionFrucht() {
		if (Spiel.kopf.getX() == Spiel.frucht.getX() && Spiel.kopf.getY() == Spiel.frucht.getY()) {
	        Spiel.addSchwanz();
	        System.out.println("Hunger");
	        Spiel.frucht.reset();
	    }
	}





}
