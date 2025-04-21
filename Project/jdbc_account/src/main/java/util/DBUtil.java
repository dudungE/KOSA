package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
    private static final String URL = "jdbc:oracle:thin:@localhost:1521:XE"; // XE 또는 너의 SID
    private static final String USER = "YOUR_USER";      // 오라클 계정명
    private static final String PASSWORD = "oracle";  // 비밀번호

    public static Connection getConnection() throws Exception {
        Class.forName("oracle.jdbc.OracleDriver");
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
