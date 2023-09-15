package game;

import java.awt.Color;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Frucht {
	
	int x;
	int y;
	public static Color fruchtFarbe;
	
	public static Color[] farben = {Color.BLUE, Color.GREEN, Color.YELLOW, Color.CYAN, Color.PINK, Color.MAGENTA, Color.WHITE, Color.ORANGE};
	
	public Frucht() {
		// Zufallszahlen für x und y
		this.x = ThreadLocalRandom.current().nextInt(0, 15);
		this.y = ThreadLocalRandom.current().nextInt(0, 15);
		this.fruchtFarbe = farben[1];
	}

	// Frucht neu positionieren wenn gefuttert oder nach bestimmter Zeit
	public void reset() {
		this.x = ThreadLocalRandom.current().nextInt(0, 15);
        this.y = ThreadLocalRandom.current().nextInt(0, 15);
        int zufall = new Random().nextInt(farben.length);
        Frucht.fruchtFarbe=farben[zufall];
        Spiel.waitToMove = false;		
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	

	
	/*
	 * 
	static int x;
	static int y;
	public static Color fruchtFarbe;
	
	public static Color[] farben = {Color.BLUE, Color.GREEN, Color.YELLOW, Color.CYAN, Color.PINK, Color.MAGENTA, Color.WHITE, Color.ORANGE};
	
	public Frucht() {
		// Zufallszahlen für x und y
		this.x = ThreadLocalRandom.current().nextInt(0, 15);
		this.y = ThreadLocalRandom.current().nextInt(0, 15);
		this.fruchtFarbe = farben[1];
	}

	// Frucht neu positionieren wenn gefuttert oder nach bestimmter Zeit
	public static void reset() {
		Frucht.x = ThreadLocalRandom.current().nextInt(0, 15);
        Frucht.y = ThreadLocalRandom.current().nextInt(0, 15);
        int zufall = new Random().nextInt(farben.length);
        Frucht.fruchtFarbe=farben[zufall];
        Spiel.waitToMove = false;		
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	*
	*/

}
