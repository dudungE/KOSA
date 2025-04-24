import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("hi");

        VideoManage vm = new VideoManage();
        vm.init();
        vm.Read();


        Scanner sc = new Scanner(System.in);
        Boolean flag = true;
        while (flag) {
            System.out.println("1:C 2:R 3:U 4:D 5:lend 0:exit");
            int opt = sc.nextInt();
            switch (opt) {
                case 1 -> {
                    sc.nextLine(); // 개행 버퍼 제거
                    System.out.println("title");
                    String title = sc.nextLine();
                    System.out.println("category");
                    String cat = sc.nextLine();
                    vm.Create(title, cat);}
                case 2 -> {vm.Read();}
                case 3 -> {vm.Update();}
                case 4 -> {vm.Delete();}
                case 5 -> {vm.lend();}
                case 0 -> {
                    System.out.println("시스템 종료합니다.");
                    System.exit(0);
                }


            }
        }



    }
}



