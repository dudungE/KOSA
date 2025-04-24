package ex02.IF;

import java.util.Scanner;

public class Quiz_윤년판정프로그램 {
	public static void main(String[] args) {
		//1. 변수선언
		int year;
		String msg = "";
		boolean flag = false;
		
		//2. 메세지 출력 및 입력 받기
		System.out.print("year = ");
		year = new Scanner(System.in).nextInt();
				
		//3. 처리(계산)
		if( (  year % 4 == 0 ) && ( year % 100 != 0 ) || ( year % 400 == 0 )) {
			flag = true;
		}
		
		msg = ( flag == true ) ? "윤년" : "평년";
		
		//4. 결과출력
		System.out.println(year + " 년도 ===> " + msg);
	}
}

//문제] 윤년/평년 판정 프로그램 프로그램 작성
//if( year % 4 == 0 ) {
//	if( year % 100 != 0 || year % 400 == 0 ) 
//		"윤년";
//}




