
import java.sql.*;
import java.util.*;

public class AccountDAO {

    public void createAccount(Account acc) throws Exception {
        String sql = "INSERT INTO account VALUES (?, ?, ?)";
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, acc.getAccountNumber());
            pstmt.setString(2, acc.getOwnerName());
            pstmt.setInt(3, acc.getBalance());
            pstmt.executeUpdate();
        }
    }

    public List<Account> getAllAccounts() throws Exception {
        List<Account> list = new ArrayList<>();
        String sql = "SELECT * FROM account";
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                list.add(new Account(
                        rs.getString("account_number"),
                        rs.getString("owner_name"),
                        rs.getInt("balance")
                ));
            }
        }
        return list;
    }

    public void deposit(String accNum, int amount) throws Exception {
        String sql = "UPDATE account SET balance = balance + ? WHERE account_number = ?";
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, amount);
            pstmt.setString(2, accNum);
            pstmt.executeUpdate();
        }
    }

    public void withdraw(String accNum, int amount) throws Exception {
        String sql = "UPDATE account SET balance = balance - ? WHERE account_number = ? AND balance >= ?";
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, amount);
            pstmt.setString(2, accNum);
            pstmt.setInt(3, amount);
            int rows = pstmt.executeUpdate();
            if (rows == 0) {
                throw new RuntimeException("잔액 부족 또는 계좌 없음");
            }
        }
    }

    public void deleteAccount(String accNum) throws Exception {
        String sql = "DELETE FROM account WHERE account_number = ?";
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, accNum);
            pstmt.executeUpdate();
        }
    }
}

