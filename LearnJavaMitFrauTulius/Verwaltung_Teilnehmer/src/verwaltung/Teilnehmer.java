package verwaltung;

public class Teilnehmer {

	// Atribute
	private String tnr;
	private String gruppe;
	private String name;
	private String vorname;
	
	// Konstruktor
	public Teilnehmer(String tnr, String gruppe, String name, String vorname) {
		super();
		this.tnr = tnr;
		this.gruppe = gruppe;
		this.name = name;
		this.vorname = vorname;
	}

	

	public String getTnr() {
		return tnr;
	}

	public void setTnr(String tnr) {
		this.tnr = tnr;
	}

	public String getGruppe() {
		return gruppe;
	}

	public void setGruppe(String gruppe) {
		this.gruppe = gruppe;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	
	// Zur anzeige in der Liste (1 - Muster, Max) 
	@Override
	public String toString() {
		return  tnr + "- " + name + ", " + vorname;
	}
	
	// Zum Eintragen in die CSV (1;022023;Muster;Max)
	public String toCSV() {
		return tnr + ";" + gruppe + ";" + name + ";" + vorname; 
	}

}
