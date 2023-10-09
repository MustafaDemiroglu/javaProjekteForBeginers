package ShopSystem;

import java.util.List;
import java.util.ArrayList;

public class Auftrag {
	// Attribute
	private List<Artikel> artikelListe;
	
	// Konstruktor
	public Auftrag() {
		artikelListe = new ArrayList<>();
	}
	
	// Methode zum hinzufügen der Artikel
	public void artikelHinzufügen(Artikel artikel) {
		artikelListe.add(artikel);
	}
	
	// getter/(setter)
	public List<Artikel> getArtikelListe() {
		return artikelListe;
	}
	
	

}
