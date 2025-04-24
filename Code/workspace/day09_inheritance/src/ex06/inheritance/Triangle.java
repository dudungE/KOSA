package ex06.inheritance;

import java.util.Scanner;

public class Triangle extends Shape { // Sub class 

	public Triangle() {
		Scanner sc = new Scanner(System.in);
		System.out.print("넓이 = ");
		this.w = sc.nextInt();
		System.out.print("높이 = ");
		this.h = sc.nextInt();
	}
	
	public double calc() {
		this.result = ( w * h ) / 2.0;
		
		return result;
	}
	
	public void show() {
		System.out.println("넓이 = "+w + ", 높이 = "+ h
				+", 삼각형넓이= "+calc() );
	}
}
