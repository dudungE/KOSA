import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("hi");

        BmiControl bc = new BmiControl();
        bc.init();
        Scanner sc = new Scanner(System.in);


        boolean flag = true;
        while (flag) {
            System.out.println("1:C 2:R 3:U 4:D 5:save 0:exit");
            switch (sc.nextInt()) {
                case 1 -> {bc.create();}
                case 2 -> {bc.read();}
                case 3 -> {bc.update();}
                case 4 -> {bc.delete();}
            }
        }

    }
}
