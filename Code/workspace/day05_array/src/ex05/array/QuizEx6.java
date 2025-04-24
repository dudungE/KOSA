package ex05.array;

import java.util.Scanner;

public class QuizEx6 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] a = new int[2][3]; //객체생성, 메모리에할당, 생성자함수 자동호출
		
		System.out.println(a.length); //행크기
		System.out.println(a[0].length);  //열크기
		System.out.println(a[1].length);
		
				
		
		for(int i = 0; i < a.length ; i++ ) {   // row
			for (int j = 0; j < a[i].length; j++) {  // col
				System.out.println("array a["+i+"]["+j+"] = ");
				a[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i < a.length ; i++ ) {   // row
			for (int j = 0; j < a[i].length; j++) {  // col
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
	
}






