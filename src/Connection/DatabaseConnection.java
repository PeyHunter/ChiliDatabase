package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection
{
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/Chili?allowPublicKeyRetrieval=true&useSSL=false";
    private static final String USER = "root";
    private static final String PASSWORD = "Kea=Krea1994";

    //single instance (singleton)
    private static DatabaseConnection instance;

    //Connection object
    private Connection connection;

    private DatabaseConnection()
    {
        connection = connect();
    }

    // private construktor to prevent instantiation
    private Connection connect()
    {
        Connection conn = null;
        try
        {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connected to the database");
        }
        catch (SQLException e)
        {
            System.out.println("Connection failed: " + e.getMessage());
        }
        return conn;
    }

    // public methode to acces instance
    public static DatabaseConnection getInstance()
    {
        if (instance == null)
        {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    // to
    public Connection getConnection()
    {
        return connection;
    }


}
