package ex05.inheritance;

public class InheritanceMain {
	public static void main(String[] args) {
		Rectangle r = new Rectangle();  //객체생성, 메모리에할당, 생성자함수 자동호출
		r.disp();
		
		
		Rectangle r1 = new Rectangle(); 
		Rectangle r2 = new Rectangle(); 
		Rectangle r3 = new Rectangle(); 
		System.out.println("----------------------------");
		System.out.println(r1.hashCode());
		System.out.println(r2.hashCode());
		System.out.println(r3.hashCode());
		
		System.out.println("----------------------------");
		Circle c = new Circle(); // 객체생성, 메모리에할당, 생성자함수 자동호출
		c.disp();
		
//		Circle c2 = new Circle(55); 
//		c2.disp();
				
	}
}
