import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BmiControl extends Bmi {

    int idx;
    List<Bmi> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    Bmi bmi;


    public void init() {
        list.add(new Bmi("jjh", true, 177, 77));
        list.add(new Bmi("was", false, 157, 47));
    }

    public void create() {
        System.out.println("이름 성별(남/여) 키 몸무게");
        String[] oprs = sc.nextLine().split("\\s+");
        if (oprs.length == 4) {
            boolean gender = true;
            if (oprs[1].equals("남")) gender = true;
            else gender = false;
            bmi = new Bmi(oprs[0],gender, Integer.parseInt(oprs[2]),Integer.parseInt(oprs[3]));
            list.add(bmi);
        } else {
            System.out.println("다시 입력");
        }

    }

    public void read() {
//        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            Bmi bmi = list.get(i);
            System.out.println(i + "번: " + bmi + bmiResult(bmi.getBmi()));
        }
    }

    public String bmiResult(double bmi) {
        //18.5> 저체중 18.5<= bmi< 23 정상 23<=bmi<25 과체중 25<=비만
        //BMI = weight / (((height-100)*0.9/ 100.0)*((height-100)*0.9/100))
        //남자의 경우 곱셈 계수 0.9 여자의 경우 0.85
        if (bmi >= 25) return ">>비만입니다.";
        else if(bmi >= 23) return ">>과체중 입니다";
        else if (bmi >= 18.5) return ">>정상입니다";
        else return ">>저체중입니다";
    }


    public void update() {
        System.out.println("수정할 번호 입력");
        int i = sc.nextInt();
        bmi = list.get(i);

        System.out.println("[수정] 이름 성별(남/여) 키 몸무게");
        sc.nextLine();
        String[] oprs = sc.nextLine().split("\\s+");
        if (oprs.length == 4) {
            boolean gender = true;
            if (oprs[1].equals("남")) gender = true;
            else gender = false;
            bmi.setName(oprs[0]);
            bmi.setGender(gender);
            bmi.setHeight(Integer.parseInt(oprs[2]));
            bmi.setWeight(Integer.parseInt(oprs[3]));
        } else {
            System.out.println("[수정]다시 입력");
        }
    }

    public void delete() {
        System.out.println("삭제할 번호 입력");
        idx = sc.nextInt();
        list.remove(idx);
        System.out.println("삭제 완료");
        // 잘못된번호 입력시 예외 발생
    }

    // 별도 클래스로 저장 밑 불러오기
    public void save () {}
    public void load () {}



}
