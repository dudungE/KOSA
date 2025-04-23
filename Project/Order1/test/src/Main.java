import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("gg");

        PersonManage pm = new PersonManage();
        Scanner sc = new Scanner(System.in);
        pm.init();

        while (true) {
            System.out.println("C(1) R(2) U(3) D(4) exit(0)");
            int option = sc.nextInt();
            switch (option) {
                case 1 -> {
                    pm.add();
                }
                case 2 -> {
                    pm.read();
                }
                case 3 -> {
                    System.out.println("수정할 번호 입력");
                    int index = sc.nextInt();
                    pm.update(index);
                }
                case 4 -> {
                    System.out.println("삭제할 고객 번호 입력");
                    int index = sc.nextInt();
                    pm.delete(index);
                }
                case 0 -> {
                    System.out.println("시스템 종료합니다");
                    System.exit(0);
                }
            }
        }





    }
}