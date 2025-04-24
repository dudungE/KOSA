package ex02.method;

import java.util.Scanner;

/*
 	3) 매개변수 없고, 리턴타입 있는 경우
        public  returnType  methodName() { return  value;  }
*/
public class MethodEx1 {
	
	//3) 매개변수 없고, 리턴타입 있는 경우
	public static  int  show() {
		System.out.println("show() method call~");
		return 999;
	}
	
	public static void name() {
		System.out.println("doyeon");
	}
	
	public static void main(String[] args) {
		int max = max();
		int x = max();
		System.out.println(x);
		System.out.println(max);
		
		System.out.println(show());
		
		int su = show();
		System.out.println(su);
	}
	
	// max()만들어서 큰값을 리턴하는 함수 만들기
	public static  int max() {
		System.out.println("x, y = ");
		int x = new Scanner(System.in).nextInt();
		int y = new Scanner(System.in).nextInt();
		
		int max = ( x > y ) ? x : y;
		
		return max;
		
//		if( x > y ) return x;
//		else return y;
	}
	
}









