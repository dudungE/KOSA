
package controller;

import model.User;
import service.BankService;

import java.util.Scanner;

public class BankController {
    private final BankService service = new BankService();
    private final Scanner sc = new Scanner(System.in);
    private User loginUser = null;

    public void run() {
        while (true) {
            if (loginUser == null) showLoginMenu();
            else showAccountMenu();
        }
    }

    private void showLoginMenu() {
        System.out.println("1. 회원가입 | 2. 로그인 | 0. 종료");
        String input = sc.nextLine();
        switch (input) {
            case "1" -> service.register(sc);
            case "2" -> loginUser = service.login(sc);
            case "0" -> {
                System.out.println("종료합니다."); System.exit(0);
            }
        }
    }

    private void showAccountMenu() {
        System.out.println("\n1. 계좌 생성 | 2. 입금 | 3. 출금 | 4. 잔액조회 | 5. 거래내역 | 9. 로그아웃");
        String input = sc.nextLine();
        switch (input) {
            case "1" -> service.createAccount(loginUser);
            case "2" -> service.deposit(loginUser, sc);
            case "3" -> service.withdraw(loginUser, sc);
            case "4" -> service.showBalance(loginUser);
            case "5" -> service.showTransactions(loginUser);
            case "9" -> loginUser = null;
        }
    }
}

