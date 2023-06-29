package game;

import java.util.concurrent.ThreadLocalRandom;

public class Frucht {
	
	int x ;
	int y;
	
	public Frucht() {
		// Zufallzahlen für x und y
		this.x = ThreadLocalRandom.current().nextInt(0,15);
		this.y = ThreadLocalRandom.current().nextInt(0,15);
	}
	
	
	// Frucht neu positionieren wenn gefuttert oder nach bestimmter Zeit
	public void reset( ) {
		this.x = ThreadLocalRandom.current().nextInt(0,15);
		this.y = ThreadLocalRandom.current().nextInt(0,15);
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
	
	
	

}
