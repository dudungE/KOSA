package ex01.oop;

public class Point {
	private int x, y;
	
	//생성자함수 3개 
	public Point() {
		this(10, 200); // 첫줄에 위치해야함
		System.out.println("default constructor");
//		x = y = 100;
		
	}

//	public Point(int xx, int yy) { //
	public Point(int x, int y) { //
//		this(x,y);
		System.out.println("2 constructor");
		this.x = x;
		this.y = y;
	}

	public Point(int x) {
		this(3,999);
		System.out.println("1 constructor");
//		this.x = x;
//		y = 9999;
	}
	
	//getter / setter
	
	//output method
	public void disp() {
		System.out.println(x + ", " +y );
	}
}
