
import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
    public static Connection getConnection() throws Exception {
        String url = "jdbc:oracle:thin:@localhost:1521:xe"; // 본인 환경에 맞게 수정
        String user = "jjh";
        String password = "tiger";
        Class.forName("oracle.jdbc.driver.OracleDriver");

        return DriverManager.getConnection(url, user, password);
    }
}

