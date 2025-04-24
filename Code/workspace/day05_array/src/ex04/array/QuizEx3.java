package ex04.array;

import java.util.Scanner;

public class QuizEx3 {
	
	public static void main(String[] args) {
		int[]  a = new int[5];   //객체생성, 메모리에할당, 생성자함수 자동호출
		
		// 임의적인 데이터 입력 받아서, 출력하는 프로그램 작성
		System.out.println("x = ");
		int x = new Scanner(System.in).nextInt();
		System.out.println(x);
		
		// 임의적인 데이터 3개 입력 받아서, 출력하는 프로그램 작성
		Scanner sc = new Scanner(System.in);
		System.out.println("y = ");
		int y=0;
		//input
		for(int i = 1; i < 4 ; i++ ) {
			y = sc.nextInt();
//			System.out.println(y);
		}
		
		//output
		for(int i = 1; i < 4 ; i++ ) {
			System.out.println(y);
		}
		
		System.out.println("array a = ");
		for(int i = 0; i < a.length ; i++ ) {
			a[i] = sc.nextInt();
		}
		
		for(int i = 0; i < a.length ; i++ ) {
			System.out.println(a[i]);
		}
	}
}




