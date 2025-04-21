package service;

import dao.*;
import model.*;
import java.util.Scanner;

public class BankService {
    private final UserDAO userDAO = new UserDAO();
    private final AccountDAO accountDAO = new AccountDAO();
    private final TransactionDAO transactionDAO = new TransactionDAO();

    public void register(Scanner sc) {
        System.out.print("아이디: ");
        String username = sc.nextLine();
        System.out.print("비밀번호: ");
        String password = sc.nextLine();
        System.out.print("이름: ");
        String name = sc.nextLine();

        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setName(name);

        if (userDAO.register(user)) {
            System.out.println("회원가입 성공!");
        } else {
            System.out.println("회원가입 실패!");
        }
    }

    public User login(Scanner sc) {
        System.out.print("아이디: ");
        String username = sc.nextLine();
        System.out.print("비밀번호: ");
        String password = sc.nextLine();
        User user = userDAO.login(username, password);
        if (user != null) System.out.println("로그인 성공! 환영합니다 " + user.getName());
        else System.out.println("로그인 실패!");
        return user;
    }

    // 계좌 생성, 입금, 출금, 잔액조회, 거래내역 등 나머지 메서드는 계속 확장 가능
}

