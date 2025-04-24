package ex02.staticMember;

class Atm {
	int count;      // instance member
	static int total;   // static member - 초기화 1회만...., 있던 값을 가져온다
	
	public Atm(int amount) {  // constructor method
		count += amount;
		total += amount;   // total = total + amount;
	}
	// static member 에서 일반 멤버변수는 사용 할 수 없다.
	public static void view() {
		total = total + 100;
		//count = count + 100;
	}
	public void display() {
		count += 50;
		total += 30;
		System.out.println("count = " + count);
		System.out.println("total = " + total);
	}
} // Atm end

public class MainEntry {
	public static void main(String[] args) {
		System.out.println(Atm.total);
		Atm at = new Atm(1000);
		at.display();    // c: 1000,  t: 1000
		System.out.println("-------------------------------");
		Atm at2 = new Atm(1000);
		at2.display();    // c: 1000,  t: 2000
		System.out.println("-------------------------------");
		Atm at3 = new Atm(1000);
		at3.display();    // c: 1000,  t: 3000
	}
}








