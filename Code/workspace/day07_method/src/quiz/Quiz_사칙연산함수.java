package quiz;

import java.util.Scanner;

public class Quiz_사칙연산함수 {
	//puls(+), mul( * )  리턴 타입 없이 
	//sub(-) , div( / ) 리턴 타입 있고, / 함수는 예외처리도 한다.
	
	public static void mul(int su1, int su2) {
		System.out.println(su1+"*"+su2+"= "+(su1*su2));
	}

	public static void plus(int su1, int su2) {
		int result = su1 + su2;
		System.out.println(su1+"+"+su2+"= "+(su1+su2));
	}
	
	public static double div(double x, double y) {
		if( y == 0 ) {
			System.out.println("0으로 나눌 수 없습니다.");
			System.exit(0);
		}
		return x / y;
	}
	
	public static void main(String[] args) {
		//함수 호출 -
		Scanner sc = new Scanner(System.in);
		
		while(true) {  //무한루프
			
			System.out.println("input data = ");
			int su1 = sc.nextInt();
			int su2 = sc.nextInt();
			
			System.out.println("integer data input(1:+, 2:/, 3:*, 0:exit) = ");
			int choice = sc.nextInt();
			
			switch (choice) {  // 선택적 함수 호출 
				case 1: plus(su1, su2); break;
				case 2: 
						double result = div(su1, su2);
						System.out.println(su1 + " / " + su2 + " = " + result);
						break;
				case 3: mul(su1, su2); break;
				case 0: 
					System.out.println("종료를 원하시는군요. 사칙연산 종료합니다. 잘가요~");
					System.exit(0);
				default:
					System.out.println("없는 번호 선택하셨습니다. 0~3까지 중에서 선택하세요.");
			} //switch end
		} // while end
	}
}
