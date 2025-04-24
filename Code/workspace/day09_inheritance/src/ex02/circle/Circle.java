package ex02.circle;

public class Circle {
	private int  x, y, r;
	
	// 생성자함수 4개
	public Circle() {
		this(100, 100, 5);
//		x = y = r = 5;
	}
	
	public Circle(int x,  int y, int r) {
		this.x = x;
		this.y = y;
		this.r = r;
	}
	
	public Circle(int r) {
//		this.r = r;
		this(150,200, r);
	}
	public Circle(int x, int y) {
//		this(x, y, 5);
		this(333);
//		this.x = x;
//		this.y = y;
	}
	
	public void disp() {
		System.out.println(x + ", " +y + ", " + r);
	}
}
