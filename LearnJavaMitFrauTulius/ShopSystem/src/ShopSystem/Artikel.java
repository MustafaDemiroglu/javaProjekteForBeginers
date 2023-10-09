package ShopSystem;

public class Artikel {
	// Attribute
	private String name;
	private double preis;
	private boolean lagerArtikel;
	private Lieferant lieferant;
	private int mindestLagerBestand;
	private int aktuellerBestand;
	
	// Konstruktor
	public Artikel(String name, double preis, boolean lagerArtikel, Lieferant lieferant, int mindestLagerBestand,
			int aktuellerBestand) {
		super();
		this.name = name;
		this.preis = preis;
		this.lagerArtikel = lagerArtikel;
		this.lieferant = lieferant;
		this.mindestLagerBestand = mindestLagerBestand;
		this.aktuellerBestand = aktuellerBestand;
	}
	
	// getter/ (setter)
		public String getName() {
			return name;
		}

		public double getPreis() {
			return preis;
		}

		public int getMindestLagerBestand() {
			return mindestLagerBestand;
		}

		public int getAktuellerBestand() {
			return aktuellerBestand;
		}

}
