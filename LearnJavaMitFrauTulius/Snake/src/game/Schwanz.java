package game;

public class Schwanz {
	
	int x ;
	int y ;
	
	// Schwanz darf nicht bewegen, wenn neues Teil angefügt wird
	boolean wait = true ;
	
	public Schwanz (int x, int y) {
		this.x=x;
		this.y=y;
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
	
	public boolean isWait() {
		return wait;
	}
	
	public void setWait (boolean wait) {
		this.wait = wait ;
	}
	

}
