import java.util.*;
import java.sql.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("start");

        Scanner sc = new Scanner(System.in);
        AccountDAO dao = new AccountDAO();

        while (true) {
            System.out.println("\n--- 계좌 관리 시스템 ---");
            System.out.println("1. 계좌 생성");
            System.out.println("2. 계좌 목록 조회");
            System.out.println("3. 입금");
            System.out.println("4. 출금");
            System.out.println("5. 계좌 삭제");
            System.out.println("0. 종료");
            System.out.print("선택 > ");
            int choice = sc.nextInt();
            sc.nextLine();

            try {
                switch (choice) {
                    case 1 -> {
                        System.out.print("계좌번호: ");
                        String accNum = sc.nextLine();
                        System.out.print("이름: ");
                        String name = sc.nextLine();
                        System.out.print("초기 입금액: ");
                        int bal = sc.nextInt();
                        dao.createAccount(new Account(accNum, name, bal));
                        System.out.println("계좌 생성 완료");

                    }
                    case 2 -> {
                        List<Account> list = dao.getAllAccounts();
                        list.forEach(acc -> System.out.printf("번호: %s | 이름: %s | 잔액: %d원\n",
                                acc.getAccountNumber(), acc.getOwnerName(), acc.getBalance()));
                    }
                    case 3 -> {
                        System.out.print("계좌번호: ");
                        String accNum = sc.nextLine();
                        System.out.print("입금액: ");
                        int amount = sc.nextInt();
                        dao.deposit(accNum, amount);
                        System.out.println("입금 완료");
                    }
                    case 4 -> {
                        System.out.print("계좌번호: ");
                        String accNum = sc.nextLine();
                        System.out.print("출금액: ");
                        int amount = sc.nextInt();
                        dao.withdraw(accNum, amount);
                        System.out.println("출금 완료");
                    }
                    case 5 -> {
                        System.out.print("삭제할 계좌번호: ");
                        String accNum = sc.nextLine();
                        dao.deleteAccount(accNum);
                        System.out.println("계좌 삭제 완료");
                    }
                    case 0 -> {
                        System.out.println("프로그램 종료");
                        return;
                    }
                    default -> System.out.println("잘못된 입력입니다.");
                }
            } catch (Exception e) {
                System.out.println("오류 발생: " + e.getMessage());
            }
        }




        // db 연결 test
//        Connection con = null;
//        Statement stmt = null;
//        ResultSet rs = null;
//
//        try {
//            Class.forName("oracle.jdbc.driver.OracleDriver");
//            con = DBUtil.getConnection();
//            String sql = "SELECT * FROM cal";
//            stmt = con.createStatement();
//            rs = stmt.executeQuery(sql);
//
//            while (rs.next()) {
//                System.out.println(rs.getString("week") + " " + rs.getString("day") +
//                        " " + rs.getString("num_day"));
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            try { if(rs != null) rs.close(); } catch (Exception e) {}
//            try { if(stmt != null) stmt.close(); } catch (Exception e) {}
//            try { if(con != null) con.close(); } catch (Exception e) {}
//        }


    }
}