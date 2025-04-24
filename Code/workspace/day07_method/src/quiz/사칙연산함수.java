package quiz;

import java.util.Scanner;

public class 사칙연산함수 {
	
	public static void main(String[] args) {
		// x, y 입력 받아서 add(), sub(), mul(), div() 만들기 , mul(), div() 함수는 리턴타입으로 만들기
		// 예외처리 할것 
		int x, y ;
		Scanner sc = new Scanner(System.in);
		System.out.println("x = ");
		x = sc.nextInt();
		do {
			System.out.println("y = ");
			y = sc.nextInt();
		} while(y == 0);
		
		
//		if( y == 0 ) {
//			System.out.println("0으로 나눌 수 없습니다.");
//			System.exit(0);
//		}
		
		int div = div(x,y);
		System.out.println(x + " / " + y + " = " + div);
	}

	public  static int div(int x, int y) { //public  static int div(int...x) {
		if( y == 0 )  {
			System.out.println("0으로 나눌 수 없습니다.");
			System.exit(0);
		}
		return x/y;
	}
	
	public  static int div2(int x, int y) {
		
		if( y != 0 )  return x/y;
		
		else {
			System.out.println("0으로 나눌 수 없습니다.");
			System.exit(0);
			return 0;
		}
	}
}




