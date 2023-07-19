package p_03_Datenbanken;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

public class D03_Select {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 
		String driver  = "com.mysql.cj.jdbc.Driver";
		
		// bei einer realen DB --> Username und url werden von Provider genommen 
		String database = "bmi";
		// Standaruser bei xampp
		String user = "root";
		String pass = "";
		String url = "jdbc:mysql://127.0.0.1/" + database;
		Connection connection = null;
		Statement statement = null;
		
		String sql = "";
		
		// Treibertest
		
		try {
			Class.forName(driver);
			System.out.println("Treiber geladen...");
		} catch (ClassNotFoundException e) {
			System.out.println("Fehler beim Laden: " + e);
		}
		
		// Verbindung zur DB herstellen
		try {
			connection = DriverManager.getConnection(url,user,pass);
			statement = connection.createStatement();
			System.out.println("Verbindung zur DB hergestellt");
		} catch (SQLException error) {
			// TODO: handle exception
			System.out.println("Verbindung zur DB nicht möglich");
			error.getStackTrace();
		}
		
		// Arbeiten mit der DB
		// SELECT - Abfrage von Daten
		// SELECT * from personen
		// * bedeutet ALLES
		
		// 1. SQL-Befel formulieren
		// 2. Befehle an DB senden unr Ergebnis (ResultSet) empfangen
		// 3. ResultSet weiterverarbeiten
		
		try {
			// 1.
			sql = "SELECT * from personen";
			// 2.
			ResultSet rs = statement.executeQuery(sql);
			// 3.
			while (rs.next()) {
				int id = rs.getInt("PersonID");
				String name = rs.getString("Name");
				String vorname = rs.getString("Vorname");
				double groesse = rs.getDouble("Groesse");
				double gewicht = rs.getDouble("Gewicht");
				String kategorie = rs.getString("Kategorie");
				System.out.println(id + " : " + name + " , " + vorname + " , " + groesse + " , " + gewicht + " , " + kategorie);
				
			}
		} catch (SQLException e) {
			System.out.println("SQL Befehle fehlerhaft : " + sql);
			e.printStackTrace();
		}
		 
		
		
		// DB-Verbindung beenden
		
		try {
			connection.close();
			System.out.println("Datenbank erfolgreich geschlossen");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("DB konnte nicht geschlossen werden");
		}
		
		

	}

}
