package ex06.inheritance;

public class MainEntry {
	public static void main(String[] args) {
		
		Shape sh = new Circle();  // 부모로 객체 생성가능
		sh.show();
		
		sh = new Triangle();
		sh.show();
		
//		Triangle t = new Triangle(); // 각자 자신 클래스 생성
//		t.show();
		
		Circle c = new Circle();
		c.show();
		

	}
}
