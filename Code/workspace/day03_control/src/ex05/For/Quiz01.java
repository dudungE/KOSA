//*
package ex05.For;

import java.util.Iterator;

public class Quiz01 {
	public static void main(String[] args) {
		
		for (int i = 1; i < 6; i++) {
//		for (int i = 5; i >= 1; i--) {
			System.out.print("*");
		}
	}
}
//*/

/*
package ex05.For;

import java.util.Iterator;

public class Quiz01 {
	public static void main(String[] args) {
		
		for (int i = 1; i < 6; i++) {
//		for (int i = 5; i >= 1; i--) {
			System.out.print("*");
		}
	}
}
//*/

/*
package ex05.For;

// 1 ~ 100 까지 중에서 3의 배수의 개수, 합 구하는 프로그램 작성
public class Quiz01 {
	public static void main(String[] args) {
		
		int sum = 0, count =0;
		for(int i = 1; i <= 100; i++) {
			if( i % 3 == 0 ) {
				count++; //count += 1; //count = count + 1;
				sum += i; 
			}
		}
		
		System.out.println("3의 배수의 개수 = "+ count + "\t 합 = "+ sum);
	}
}
//*/

/*
package ex05.For;

// 1 ~ 100 까지 출력하는 프로그램 작성
public class Quiz01 {
	public static void main(String[] args) {
		for(int i = 0; i <= 100; i++) {
			if( i % 10 == 0 ) System.out.println();
			System.out.print(i+ " ");
		}
	}
}
//*/