package ex02.oop;

public class Rectangle {
	// x, y, x2, y2
	// getter/setter method, output method
	int x, y, x2, y2;
	
	public Rectangle() {
		x = y = x2 = y2 = 10;
		y = y2 = 5;
	}
	
	public Rectangle(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Rectangle(int i, int j, int k) {
		x = i;
		y = j;
		x2 = k;
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

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}
	
	public void disp() {
		System.out.println(x + ", " +y +", " +x2+" , "+y2);
	}
	
}





