import java.sql.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String user = "jjh";
        String password = "tiger";
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection(url, user, password);
            String sql = "SELECT * FROM cal";
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                System.out.println(rs.getString("week") + " " + rs.getString("day") +
                        " " + rs.getString("num_day"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try { if(rs != null) rs.close(); } catch (Exception e) {}
            try { if(stmt != null) stmt.close(); } catch (Exception e) {}
            try { if(con != null) con.close(); } catch (Exception e) {}
        }

    }
}