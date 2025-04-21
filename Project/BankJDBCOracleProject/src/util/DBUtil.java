package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {


    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        String URL = "jdbc:oracle:thin:@localhost:1521:xe";
        String USER = "jjh";
        String PASSWORD = "tiger";
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
