package ex02.oop;

import java.util.Scanner;

public class PersonMain {
	public static void main(String[] args) {
		Person person = new Person(); //
		Scanner sc = new Scanner(System.in);
//		person.setName("yuna");
//		person.setAge(33);
//		person.setPhone("111-8888-999");
		System.out.println("name = ");		person.setName(sc.next());
		System.out.println("age = ");			person.setAge(sc.nextInt());
		System.out.println("phone = ");		person.setPhone(sc.next());
		
		person.disp();
	}
}
