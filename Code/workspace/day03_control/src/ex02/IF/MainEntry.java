//*
package ex02.IF;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		
		System.out.println("input data = ");
		int su = new Scanner(System.in).nextInt();
		String str = null;
		
		//짝,홀수 판정 if
		if( su % 2 == 0 ) System.out.println("even");
		else System.out.println("odd");
		
		//삼항(조건) 연산자 이용
		str = ( su % 2 == 0 ) ? "even" : "odd";
		System.out.println(su + " ====> " +str);
		
		//양수, 음수, 0 판정 if
		if( su > 0 ) System.out.println("양수");
		else if( su < 0 ) System.out.println("음수");
		else System.out.println("0이군요");
	}
}
//*/



/*
package ex02.IF;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		
		System.out.println("input data = ");
		
		Scanner sc = new Scanner(System.in);  // 객체생성, 메모리에 할당, 생성자함수 자동호출
		int su = sc.nextInt();
		
		if( su % 2 == 0 ) System.out.println("짝수");
		else System.out.println("홀수");
	}
}
//*/