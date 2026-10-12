import java.sql.*;

public class DB_Connection {

    private static final String URL = "jdbc:mysql://localhost:3306/sms";
    private static final String user = "root";
    private static final String password = System.getenv("DB_PASSWORD");

    public static Connection make_Connection() throws SQLException {

        return DriverManager.getConnection(URL, user, password);
    }
}