package ex02.oop;

import  java.lang.*;  //자동임포트

class Point {  // extends Object  {   // Object class 상속 받고 있었음.
	
	private int x, y;  // 멤버변수 - 접근지정자 : prviate < default < protected < public
	
	// 멤버함수 
	public int getX() {  return x;  	}
	public void setX(int xx) {		x = xx;	}
	
	public int getY() {	return y;	}
	public void setY(int yy) {		y = yy;	}
	
	public void setData(int xx, int yy) {
		x = xx;
		y = yy;
	}
	
	public void display() {
//		System.out.println(x + ", " + y);
		System.out.println(getX() + ", " + getY());
	}
} // Point class 

public class MainEntry {
	public static void main(String[] args) {
		Point  pt = new Point(); // 객체생성, 메모리에 할당, 생성자함수 자동호출

//		pt.x = 500;
//		pt.y = 300;
//		System.out.println(pt.x + ", " + pt.y);
		
		pt.setX(1000);
		pt.setY(2000);
		pt.display();
//		System.out.println(pt.getX() + ", " + pt.getY());
		
//		pt.setData(1, 2);
//		
//		pt.setX(55);
//		System.out.println(pt.getX());
		
//		System.out.println(pt.toString());
//		System.out.println(pt);
	}
}
