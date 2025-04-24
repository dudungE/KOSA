package ex04.array;

import java.util.Scanner;

public class QuizEx1 {
	public static void main(String[] args) {
		//배열 여러개 데이터 중에서 7의 개수를 찾기
//		int[] a = new int[] { 7, 3, 7, 8, 1, 9, 7, 100, 12, 7, 33, 7 };
		
		int NUM = 30;
		
		Scanner  sc = new Scanner(System.in);
//		NUM = sc.nextInt();
		int[] a = new int[NUM];
		int seek = 7, count = 0, sum = 0;
		
		double avg = a[i] / NUM; 
		
		System.out.println("7, 3, 7, 8, 1, 9, 7, 100, 12, 7, 33, 7 데이터 합? ");
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		
//		for (int i = 0; i < a.length; i++) {
		for (int i = a.length-1; i >= 0 ; i--) {
			System.out.print(a[i]+"\t");
			System.out.print("a["+i+"] ="+ a[i]+"\n");
		}
		
		for (int i = 0; i < a.length; i++) {
			
			if( a[i] == seek ) count++;
			
		}
		
		System.out.println("7의 개수= " + count + ", sum = " + sum);
		
		//1. 배열 데이터 값 출력
//		System.out.println(a.length);
		
	}
}
