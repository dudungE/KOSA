//*
package ex06.whileDoWhile;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		
		//원하는 단을 입력 받아서 구구단 출력하기
		System.out.print("dan = ");
		int dan = new Scanner(System.in).nextInt();
		
		int i = 1; // 초기화
		do {
			System.out.println(dan + " * " + i + " = " + dan * i);
			i++; // 증감식
		} while( i < 10 ); // 조건

			
	}
}
//*/


/*
package ex06.whileDoWhile;

public class MainEntry {
	public static void main(String[] args) {
		
		int a = 1; // 반드시 변수 초기화
		
		while( a <= 3 ) {
			System.out.print(a + "\t");
			a++; // 증감식
		}
	}
}
//*/