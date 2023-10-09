package ShopSystem;

public class Lieferant {
	
	private String firma;
	private String ansprechpartner;
	private Adresse adresse;
	private String telefonnummer;
	private String faxnummer;
	private String email;
	private int mindestLagerBestand;
	private int aktuellerBestand;
	
	// Konstruktor
	public Lieferant(String firma, String ansprechpartner, Adresse adresse, String telefonnummer, String faxnummer,
			String email, int mindestLagerBestand, int aktuellerBestand) {
		super();
		this.firma = firma;
		this.ansprechpartner = ansprechpartner;
		this.adresse = adresse;
		this.telefonnummer = telefonnummer;
		this.faxnummer = faxnummer;
		this.email = email;
		this.mindestLagerBestand = mindestLagerBestand;
		this.aktuellerBestand = aktuellerBestand;
	}
	
	
	// getter /(setter)
	// weitere momentan nicht benötigt
	public int getMindestLagerBestand() {
		return mindestLagerBestand;
	}

	public int getAktuellerBestand() {
		return aktuellerBestand;
	}
	
	
	
	

}
