package game;

public class Kopf {

	int x;
	int y;
	
	// Schlange soll bei spielbeginn nach rects schauen
	Richtung richtung = Richtung.RECHTS;
	
	
	// Konstruktor
	public Kopf (int x, int y) {
		super();
		this.x=x;
		this.y=y;
	}
	
	
	// Methoden
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x=x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y=y;
	}
	
	public Richtung getRichtung() {
		return richtung;
	}
	
	public void setRsictung (Richtung richtung) {
		this.richtung = richtung ;
	}
	
	
}
