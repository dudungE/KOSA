package service;

import dao.*;
import model.*;

import java.util.Scanner;

public class BankService {
    private final UserDAO userDAO = new UserDAO();

    public void register(Scanner sc) {
        System.out.print("ID: ");
        String username = sc.nextLine();
        System.out.print("PW: ");
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
        System.out.print("ID: ");
        String username = sc.nextLine();
        System.out.print("PW: ");
        String password = sc.nextLine();

        User user = userDAO.login(username, password);
        if (user != null) {
            System.out.println("환영합니다, " + user.getName() + "님!");
        } else {
            System.out.println("로그인 실패!");
        }
        return user;
    }

    public void createAccount(User user) {}
    public void deposit(User user, Scanner sc) {}
    public void withdraw(User user, Scanner sc) {}
    public void showBalance(User user) {}
    public void showTransactions(User user) {}
}
