package ShopSystem;

import java.util.ArrayList;
import java.util.List;

public class Kunde {
	// Atrribute
	private String name;
	private Adresse adresse;
	private String telefonnummer;
	private String faxnummer;
	private String email;
	private KreditKarte kreditkarte;
	
	private List<Auftrag> auftragsListe;

	// Konstruktor
	public Kunde(String name, Adresse adresse, String telefonnummer, String faxnummer, String email,
			KreditKarte kreditkarte) {
		super();
		this.name = name;
		this.adresse = adresse;
		this.telefonnummer = telefonnummer;
		this.faxnummer = faxnummer;
		this.email = email;
		this.kreditkarte = kreditkarte;
		// auftragsListe wird gefüllt über methode bestellungAufgeben
		this.auftragsListe = new ArrayList<>();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public KreditKarte getKreditkarte() {
		return kreditkarte;
	}

	public void setKreditkarte(KreditKarte kreditkarte) {
		this.kreditkarte = kreditkarte;
	}

	// Methoden
	public Auftrag bestellungAufgeben() {
		// erzeugt ein neues Objekt der Klasse Auftrag
		// ruft den Konstruktor der Klasse Auftrag auf 
		Auftrag auftrag = new Auftrag();
		// füllt die Auftargsliste unseres Kunden
		auftragsListe.add(auftrag);
		return auftrag;
	}
	
	// ############### in schöner umbauen #################
	// wir müssen auslagern -- > "Inenleben gehört eigentlich zu auftrag"
	public List<Auftrag> getAuftraege() {
		
		/*
		 *  eine andere Version für diese Methoder
		// Artikel: name, Preis: preis;
		// artikel.getName(), artikel.getPreis()
		
		List<Auftrag> auftraegeMitArtikeln = new ArrayList<>();
		// welche Aufträge hat der kunde
		// durchläuft die liste auftragsliste undwählt jedes Element aus und " zwischenspeichert" es unter dem Namen auftarg
		for (Auftrag auftrag: auftragsListe) {
			// jeden einzelnen Auftrag durchlaufen und auflisten welche Artikel er enthält
		Auftrag auftragMitArtikeln = new Auftrag(); 
		for(Artikel artikel: auftrag.getArtikelListe()) {
			auftragMitArtikeln.artikelHinzufügen(artikel);
			System.out.println("Artikel: " + artikel.getName() + ", Preis: " + artikel.getPreis());
			}
			// einzelne aufträge zu Gesamtliste zufügen
			auftraegeMitArtikeln.add(auftragMitArtikeln);
		}
		*/
		
		List<Auftrag> auftraegeMitArtikeln = new ArrayList<>();

		for (Auftrag auftrag : auftragsListe) {
			if(auftrag.getArtikelListe().size()>0)
				auftraegeMitArtikeln.add(auftrag);
			for (Artikel artikel : auftrag.getArtikelListe()) {
				// Ausgabe irgendwann auslagern
				System.out.println("Artikel: " + artikel.getName() + ", Preis: " + artikel.getPreis());
			}
        }
		return auftraegeMitArtikeln;
	}
}
