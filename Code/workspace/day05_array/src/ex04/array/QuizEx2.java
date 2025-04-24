package ex04.array;

import java.util.Scanner;

public class QuizEx2 {
	public static void main(String[] args) {
		
//		int SU = 3;
//		System.out.println("배열 크기는? ");
//		int NUM = new Scanner(System.in).nextInt();
//		double[] arr = new double[NUM];
		
		int SU = 30, sum = 0;
		double avg = 0;
		double[] arr = new double[SU];
//		System.out.println("일일 강수량 입력 하세요. ");
		for (int i = 0; i < arr.length; i++) {
			
			System.out.println((i+1) + "일 강수량 입력 하세요. ");
			arr[i] = new Scanner(System.in).nextDouble();
			sum += arr[i];
			avg = (double)sum / arr.length;   // avg = sum / SU; 
			
		} // end for
		
//		System.out.println("4월 평균 강수량 : " +avg);
		System.out.printf("4월 평균 강수량 : %.2f" , avg);
	}
}


 /*
	문제3] 기상청 근무 
	   특정달(4월 30일 기준) 강수량 평균(소숫점 2자리까지 출력) 구하는 프로그램 작성?
	   	   
	    1.2
	    0
	    10.
	    0.5
	
	  int[] a = new int[30];

*/