package p_03_Datenbanken;

import java.sql.*;

public class D04_Insert {

    public static void main(String[] args) {

        String driver = "com.mysql.cj.jdbc.Driver";

        // Database connection details
        String database = "bmi";
        String user = "root";
        String pass = "";
        String url = "jdbc:mysql://127.0.0.1/" + database;
        Connection connection = null;
        Statement statement = null;
        String sql;

        // Load the database driver
        try {
            Class.forName(driver);
            System.out.println("Driver loaded...");
        } catch (ClassNotFoundException e) {
            System.out.println("Error loading driver: " + e);
        }

        // Establish a connection to the database
        try {
            connection = DriverManager.getConnection(url, user, pass);
            statement = connection.createStatement();
            System.out.println("Connected to the database.");
        } catch (SQLException error) {
            System.out.println("Unable to connect to the database");
            error.printStackTrace();
        }

        // INSERT using a regular SQL statement
        // 1. Prepare data to be inserted into the database
        // 2. Formulate the SQL command
        sql = "INSERT INTO personen(Name, Vorname) VALUES ('george', 'abci')";
        // 3. Execute the statement and insert the data
        try {
            statement.executeUpdate(sql);
            System.out.println("Data successfully added.");
        } catch (SQLException e) {
            System.out.println("Error in SQL syntax: " + sql);
            e.printStackTrace();
        }

        // INSERT using a prepared statement to prevent SQL injection
        sql = "INSERT INTO personen(Name, Vorname, Groesse, Gewicht, Kategorie) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            String name = "John";
            String vorname = "Doe";
            double groesse = 180.0;
            double gewicht = 75.0;
            String kategorie = "Standard";

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