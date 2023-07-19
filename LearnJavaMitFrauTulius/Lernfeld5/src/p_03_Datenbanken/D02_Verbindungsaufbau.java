package p_03_Datenbanken;

import java.sql.DriverManager;
import java.sql.SQLException;

public class D02_Verbindungsaufbau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 
		String driver  = "com.mysql.cj.jdbc.Driver";
		
		// bei einer realen DB --> Username und url werden von Provider genommen 
		String database = "bmi";
		// Standaruser bei xampp
		String user = "root";
		String pass = "";
		String url = "jdbc:mysql://127.0.0.1/";
		
		
		// Treibertest
		
		try {
			Class.forName(driver);
			System.out.println("Treiber geladen...");
		} catch (ClassNotFoundException e) {
			System.out.println("Fehler beim Laden: " + e);
		}
		
		// Verbindung zur DB herstellen
		try {
			DriverManager.getConnection(url,user,pass);
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("Verbindung zur DB nicht möglich");
			error.getStackTrace();
		}

	}

}
