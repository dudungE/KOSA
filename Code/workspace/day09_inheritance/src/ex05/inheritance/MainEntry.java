package ex05.inheritance;
// private < default < protected < public 

class Point2 {  // 부모클래스
	  protected int  x, y;
	  
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

	public void show() {
		  System.out.println("show method call~~");
	  }
}

class Circle2 extends Point2 {  // 자손클래스
	private int x,y, r;
	
	
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	public void disp() {
		System.out.println(x + ", " + y + ", " + r);
	}
	public void view() {
		System.out.println("view method call!!!");
	}
}

public class MainEntry {
	
	public static void main(String[] args) {
		Point2 p = new Point2();
		
		Circle2  c = new Circle2();
		c.setX(888);
		c.disp();
		c.show();
		c.view();
		
	}
}
