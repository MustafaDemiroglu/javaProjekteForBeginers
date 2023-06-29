package actions;

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
	public void kollisionFrucht() {
		
	}





}
