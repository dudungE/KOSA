/*
 * > 예외처리 (Exception)
  Java는 의무적(반드시)으로 예외처리를 해야하는 상황들이 있음.
   -- 네트워크, 데이터베이스(JDBC), Thread, IO(입출력), File,...

  형식> 
     try {
	정상코드(또는 예외 발생 예측 코드); 
     } catch(Exception e ) {
	예외 발생시 처리할 코드;
     }

   1) try ~ catch : 직접처리   <--- 권장
    2) throws  : 위임
    3) throw   : 예외 던지기

 */

//*
package ex03.exception;

//import java.util.*;
import java.util.Scanner;


public class MainEntry {
	public static void main(String[] args) {
		System.out.println("x , y = ");
		int x, y, result;
		
		x = new Scanner(System.in).nextInt();
		y = new Scanner(System.in).nextInt();
		
		if( y == 0 ) {
			System.out.println("0으로 나눌 수 없습니다.");
			System.exit(0);  //
		}
		
		result = x / y;   // 에러발생 할 수 있다. 
		
		System.out.println(result);
		
	}
}
//*/

/*
package ex03.exception;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		System.out.println("x , y = ");
		int x, y, result;
		
		x = new Scanner(System.in).nextInt();
		y = new Scanner(System.in).nextInt();
		
		result = x / y;   // 에러발생 할 수 있다. 
		
		System.out.println(result);
		
	}
}
//*/






