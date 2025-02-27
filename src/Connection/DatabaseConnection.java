package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection
{
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/Chili?allowPublicKeyRetrieval=true&useSSL=false";
    private static final String USER = "root";
    private static final String PASSWORD = "Kea=Krea1994";

    public static Connection connect()
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



}
