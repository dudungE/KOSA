import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonManage {

    List<Person> pl = new ArrayList<>();
    Scanner sc = new Scanner(System.in);


    public void init() {pl.add(new Person("name", "PhoneNum", "address"));
        pl.add(new Person("name2", "PhoneNum2", "address3"));
        pl.add(new Person("name2", "PhoneNum2", "address3"));}


    public void add() {

        System.out.println("이름, 번호, 주소 입력");
        String name = sc.next();
        String PhoneNum = sc.next();
        String address = sc.next();

        pl.add(new Person(name, PhoneNum, address));
    }

    public void read() {
//        System.out.println(pl);
        System.out.println("고객목록");

        for (int i = 0; i < pl.size(); i++) {
            System.out.println(i + " " + pl.get(i));
        }
    }

    public void update(int i) {
        Person ps = pl.get(i);
        System.out.println("이름 폰넘버 주소 수정");
        ps.setName(sc.next());
        ps.setPhoneNum(sc.next());
        ps.setAddress(sc.next());
    }

    public void delete(int i) {
        pl.remove(i);


    }

}
