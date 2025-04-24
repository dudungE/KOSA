package ex02.oop;

class Circle {
	// 멤버 변수 x, y, r 갖는 클래스 구현 - getter / setter method ,  output method  
	private int x, y, r;
	
//	public  Circle() {  //생성자함수 - 디폴트 생성자함수
//		x = y = 100;
//		r = 5;
//	}
	
	public Circle(int x) {
		this.x = x;
//		y = 50;
//		r =7;
	}
	
	public Circle(int x, int r) {
		this.x = x;
		y = 333;
		this.r = r;
	}
	
	public Circle(int x, int y, int r) {
		this.x = x;
		this.y = y;
		this.r = r;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}
	
	public  void display() {
		System.out.println(x + ", " + y + " , " + r);

	}
}

public class CirclMain {
	public static void main(String[] args) {
		// Circle class object create 
		Circle c = new Circle(2);  // 객체생성, 메모리에 할당, 생성자함수 자동호출
		System.out.println("초기 셋팅 값은? ");
		c.display();  // 
		
		Circle c2 = new Circle(1,2);
		c2.display();
		
		Circle c3 = new Circle(1,2,3);
		c3.display();
		
//		c.setR(10);
//		c.setX(50);
//		c.setY(100);
//		c.display();
	}
}










