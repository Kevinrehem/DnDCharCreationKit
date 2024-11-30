package dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String url = "jdbc:mysql://localhost:3306/dndcckitdb";
    private static final String username = "root";
    private static final String password = "root";

    private static Connection  connection;

    public static Connection getConnection(){
        try {
            if(connection==null){
                connection= DriverManager.getConnection(url, username, password);
            }
            return connection;
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
