package ex05.array;

import java.util.Scanner;

public class QuizEx3 {
	public static void main(String[] args) {
		int[][] a = new int[2][3];
		//2차원 배열에 임의적인 숫자 입력 받아서 합 출력 해주세요.
		
		Scanner sc = new Scanner(System.in);
		int hap = 0;
		
		System.out.println("array data 2row, 3col = ");
		//input
//		for (int i = 0; i < a.length; i++) {  // row ,    배열명.length  <---- 행의길이
//			for (int j = 0; j < a[i].length; j++) {  // col ,   배열명[행크기].length  <---- 열의길이
//				System.out.print("a["+i+"]["+j+"] = ");
//				a[i][j] = sc.nextInt();
//				
//				hap += a[i][j];
//			} // j end
//		} // i end
		
		int x = 1;
		
		for (int i = 0; i < a.length; i++) {  
			for (int j = 0; j < a[i].length; j++) {  
//				  a[i][j] = (int)(Math.random() * 100) + 1;
				
//				a[i][j] = x + i;
				a[i][j] = x += 5;
				  
				  hap += a[i][j];
			} // j end
		} // i end
		
		System.out.println();
		
		//output
		for (int i = 0; i < a.length; i++) {  // row
			for (int j = 0; j < a[i].length; j++) {  // col
				System.out.print(a[i][j] + "\t");
			} // j end
			System.out.println();
		} // i end
		
		System.out.println("hap = " + hap);
	}
}
