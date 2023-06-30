package clock;

import java.util.Random;

import gui.Gui;

public class FruchtClock {
	
	private int x;
	private int y;
	private Random random;
	
	public FruchtClock() {
		random = new Random();
		// Frucht reseten
		resetFrucht();
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y; 
	}
	
	public void resetFrucht() {
		// Generiere zufällige Koordinaten für die Frucht
		x = random.nextInt(Gui.width);
		y = random.nextInt(Gui.height);
	}
	

	

}
