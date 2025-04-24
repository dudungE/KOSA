package quiz;

import java.util.Scanner;

public class 학점 {
	public static void main(String[] args) {
		
		char grade= ' ';
		int jumsu = 0 ;
		
		do {
			System.out.println("jumsu input(0~100점) = ");
			jumsu = new Scanner(System.in).nextInt();
		} while( jumsu < 0 ||  jumsu > 100 );
		
		
		//if   -  A, B, C, D, F 학점
		   if (jumsu >= 90)  grade = 'A' ;    
	        else if (jumsu >= 80) grade = 'B' ;   
	        else if (jumsu >= 70) grade = 'C' ;  
	        else if (jumsu >= 60) grade = 'D' ;  
	        else grade = 'F' ;  
		   
		   System.out.println(jumsu + "점 ===> " + grade + "학점");
		   
		   //switch~case   -  A, B, C, D, F 학점
//		   switch ( jumsu ) {
//			case 100: 
//			case 99:
//			case 98:  case 97: case 96:
//			case  90: grade = 'A'; break;
//			case 89: case 88: case 87: case 86: 
//			case  80: grade = 'B'; break;
//			case  70: grade = 'C'; break;
//			case  60: grade = 'D'; break;
//			default: grade = 'F'; break;
//	 }
		   
		   
//		   switch (jumsu / 10) {
//				case 10: 
//				case  9: grade = 'A'; break;
//				case  8: grade = 'B'; break;
//				case  7: grade = 'C'; break;
//				case  6: grade = 'D'; break;
//				default: grade = 'F'; break;
//		 }
		   
		  //  - 개선된 switch 참고 
		  // https://docs.oracle.com/en/java/javase/14/language/switch-expressions.html
		 //  https://openjdk.org/jeps/361

		  grade =  switch (jumsu / 10) {  // ex) grade = 'A';
			case 10, 9 -> 'A'; 
			case  8 -> 'B'; 
			case  7-> 'C';
			case  6 -> 'D'; 
			default -> 'F'; 
	      };
	  
		   
		
		System.out.println("당신의 "+jumsu +"점 ==> " + grade +"학점 입니다.");
		   
		
//		  if (jumsu <= 100 && jumsu >= 90) {
//	            System.out.println("A");
//	        } else if(jumsu < 90 && jumsu >= 75) {
//	            System.out.println("B");
//	        } else if(jumsu < 75 && jumsu >= 55) {
//	            System.out.println("C");
//	        } else if(jumsu < 55 && jumsu >= 35) {
//	            System.out.println("D");
//	        } else if(jumsu < 35 && jumsu >= 0) {
//	            System.out.println("E");
//	        } else {
//	            System.out.println("점수를 다시 입력해주세요");
//	        }
	}
}
