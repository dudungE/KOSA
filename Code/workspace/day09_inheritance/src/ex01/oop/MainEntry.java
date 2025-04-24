package ex01.oop;

public class MainEntry {
	
	public static void main(String[] args) {
		Point pt = new Point(); //객체생성, 메모리에할당,생성자함수자동호출
		pt.disp();
		System.out.println(pt);
		System.out.println(pt.hashCode());
		System.out.println("====================");
		Point pt2 = new Point(15, 500);  //
		pt2.disp();
		System.out.println(pt2.hashCode());
		System.out.println("====================");	
		Point pt3 = new Point(88);
		pt3.disp();
		System.out.println(pt3.hashCode());
	}
}
