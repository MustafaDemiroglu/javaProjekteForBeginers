package p_03_Datenbanken;

public class D01_TreiberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String driver = "com.mysql.cj.jdbc.Driver";
		
		try {
			Class.forName(driver);
			System.out.println("Treiber geladen...");
		} catch (ClassNotFoundException e) {
			System.out.println("Fehler beim Laden: " + e);
		}
	}

}
