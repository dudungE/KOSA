package ex05.inheritance;

/*
	> inheritance(상속)
	   - extends
	   - 단일상속만 지원
	    - super
	    - 재사용
	    - 확장
	
	형식> 
	 class Super {  // 부모 클래스
	
	 }
	
	 class Sub  extends  Super {  // 자손클래스 
	
	 }

 */

public class   Point { // extends Object {   // Super Class
	 int x, y;
	 //final int a =5;
	
	//constructor method
	public Point(int x, int y) {
		//a = 100;
		this.x = x;
		this.y = y;
	}
	public Point() {
		x =  y = 10;
		System.out.println("Point class constructor");
	}
	public Point(int x) {
		this(x, 9);
		System.out.println("Point 매개변수 1개 constructor");
	}
	//getter / setter 
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
	
	//output method
	public void disp() {
		System.out.print(x + ", " + y);
	}
}







