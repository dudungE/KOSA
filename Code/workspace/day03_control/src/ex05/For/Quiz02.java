//*
package ex05.For;

public class Quiz02 {
	public static void main(String[] args) {
		//구구단 전체 출력하기
		for (int i=1; i<10; i++) {
			
            for (int j=2; j<10; j++) {
            	
                System.out.print(j + "*"  + i + "=" + (i*j) + "\t");
            	//System.out.printf("%2d * %d = %2d", j, i, (i*j) );
            }
            
            System.out.println();
        }
	}
}
//*/

/*
package ex05.For;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		//원하는 단을 입력 받아서 구구단 출력하기
		System.out.print("dan = ");
		int dan = new Scanner(System.in).nextInt();
		
		for (int i = 1; i < 10; i++) {
			System.out.println(dan + " * " + i + " = " + dan*i);
		}
	}
}
//*/