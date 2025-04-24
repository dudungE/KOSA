package ex05.inheritance;

public class Circle extends Point {  // Sub class 

	private int r;
//	private Point pt;
	
	public Circle(int r) {
		super(5, 7);  // 반드시 첫줄에 위치
		this.r = r;
		System.out.println("Circle 매개변수 1개 constructor");
	}
	public Circle(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Circle 매개변수 2개 constructor");
	}
		
	public Circle() {
		super(22);
		r = 5;
		System.out.println("Circle class constructor");
	}
	
	// output method
	public void disp() {
//		pt.disp();
		super.disp();  // Point  pt = new Point();
		System.out.println( ", " + r);
//		System.out.println(x + ", " + y + ", " + r);
	}
}







