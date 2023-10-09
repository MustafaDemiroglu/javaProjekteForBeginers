package ShopSystem;

public class ShopSystem {
	
	public static void main(String[] args) {
		// Objekt kundenAdresse
		Adresse kundenAdresse = new Adresse ("Mutergasse 7", "75213", "Entenhausen");
		KreditKarte karte1 = new KreditKarte ("Max Müller", "47110815");
		Kunde kunde1 = new Kunde ("Max Müller", kundenAdresse, "01712546987", "06817548", "max@muster,de", karte1);
		
		System.out.println(kunde1.getAdresse());
		
		// Artikel anlegen
		// Lieferanten mit Adresse anlegen
		// .......
		
		
	}

}
