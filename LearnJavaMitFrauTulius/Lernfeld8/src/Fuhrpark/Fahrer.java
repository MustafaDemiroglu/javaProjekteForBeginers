package Fuhrpark;

public class Fahrer {
	
	// Attribute
	private String name;
	private int alter ;
	private boolean fahrStatus = false ;
	private int gefahreneKilometer = 0 ;
	private int id;
	
	// Methoden
	
	public String getName() {
		return name;
	}
	
	public void setName (String name) {
		this.name = name ;
	}
	
	public int getAlter() {
		return alter;
	}
	
	public void setAlter(int alter) {
		this.alter = alter;
	}
	
	public boolean isFahrStatus() {
		return fahrStatus;
	} 
	
	public void setFahrStatus (boolean fahrStatus) {
		this.fahrStatus= fahrStatus;
	}
	
	public int getGefahreneKilometer() {
		return gefahreneKilometer;
	}
	
	public void setGefahreneKilometer (int kilometer) {
		this.gefahreneKilometer = gefahreneKilometer;
		gefahreneKilometer = gefahreneKilometer + kilometer;
		System.out.println("Ich bin " + kilometer + " gefahren");
		System.out.println("Ich bin insgesamt " + gefahreneKilometer + " gefahren" );
	}
	
	public int getId() {
		return id;
	}
	
	public void setId (int id) {
		this.id =id;
	}
	
	public Fahrer (String name) {
		super() ;
		this.name = name ;
	}
	


}
