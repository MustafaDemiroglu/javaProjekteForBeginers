package p_03_Datenbanken;

import java.sql.*;

public class D04_Insert {

    public static void main(String[] args) {

        String driver = "com.mysql.cj.jdbc.Driver";

        // Database connection details
        // bei einer realen DB --> Username und url werden von Provider genommen 
        String database = "bmi";
        // Standaruser bei xampp
        String user = "root";
        String pass = "";
        String url = "jdbc:mysql://127.0.0.1/" + database;
        Connection connection = null;
        Statement statement = null;
        String sql;

    	// Treibertest
        // Load the database driver
        try {
            Class.forName(driver);
            System.out.println("Driver loaded...");
        } catch (ClassNotFoundException e) {
            System.out.println("Error loading driver: " + e);
        }

        // Verbindung zur DB herstellen
        // Establish a connection to the database
        try {
            connection = DriverManager.getConnection(url, user, pass);
            statement = connection.createStatement();
            System.out.println("Connected to the database.");
        } catch (SQLException error) {
            System.out.println("Unable to connect to the database");
            error.printStackTrace();
        }

        	// INSERT
     		// 1. Daten vorbereiten, die in DB eingefügt werden soll
     		// 2. SQL-Befehl formulieren
     		// 3. Statement an DB übergeben
        // INSERT using a regular SQL statement
        // 1. Prepare data to be inserted into the database
        // 2. Formulate the SQL command
        // 3. Execute the statement and insert the data
        sql = "INSERT INTO personen(Name, Vorname) VALUES ('george', 'abci')";
        
        try {
            statement.executeUpdate(sql);
            System.out.println("Data successfully added.");
        } catch (SQLException e) {
            System.out.println("Error in SQL syntax: " + sql);
            e.printStackTrace();
        }

        // SQL query with placeholders (prepared statement)
        // INSERT using a prepared statement to prevent SQL injection
        sql = "INSERT INTO personen(Name, Vorname, Groesse, Gewicht, Kategorie) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            String name = "Mustafa";
            String vorname = "Demiroglu";
            double groesse = 170.0;
            double gewicht = 75.0;
            String kategorie = "Übergewicht";
         // Create a prepared statement to avoid SQL injection
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, vorname);
            preparedStatement.setDouble(3, groesse);
            preparedStatement.setDouble(4, gewicht);
            preparedStatement.setString(5, kategorie);

            // Execute the prepared statement and insert the data
            preparedStatement.executeUpdate();
            System.out.println("Data successfully added using a prepared statement.");
        } catch (SQLException e) {
            System.out.println("Error in SQL syntax: " + sql);
            e.printStackTrace();
        }

        // DB-Verbindung beenden
        // Close the database connection
        try {
            connection.close();
            System.out.println("Database connection closed successfully.");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Database connection could not be closed.");
        }

    }
}