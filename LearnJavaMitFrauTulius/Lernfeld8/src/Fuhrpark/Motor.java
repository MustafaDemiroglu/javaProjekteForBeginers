package Fuhrpark;

public class Motor {
	
	private int motorPS = 150 ;
	
	public int getMotorPS() {
		return motorPS;
	}
	
	public void setMotorPS (int motorPS) {
		this.motorPS = motorPS;
	}
	
	public Motor() {
		System.out.println("Standardmotor");
	}
	
	public Motor ( int motorPS) {
		this.motorPS = motorPS;
	}

}
