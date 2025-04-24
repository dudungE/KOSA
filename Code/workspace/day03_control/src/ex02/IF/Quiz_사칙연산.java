//*
package ex02.IF;

import java.util.Scanner;

public class Quiz_사칙연산 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try
		{
				int x, y, result = 0;   
				char str;
				String msg; 

				System.out.print("연산자를 입력하세요 ( +, -, *, / ) : ");
				//str = sc.next(); sym = str.charAt(0);
				str = sc.next().charAt(0);

				System.out.print("정수 2개를 입력하세요 : ");
				x = sc.nextInt(); y = sc.nextInt();
				if(str == '+') 	result =  x+y;
				else if(str == '-') result =  x-y;
				else if(str == '*') result =  x*y;
				else if(str == '/')  result =  x/y;
				else	System.out.println("\nresult : ERROR!\n");
				
				System.out.println("\nresult : " + x +  str  + y + " = " + result + "\n");
		}
		catch (Exception e)
		{
			System.out.println("0으로 나눌 수 없습니다.");
//			e.printStackTrace();
		}
	}

}
//*/
/*
package ex02.IF;

import java.util.Scanner;

public class Quiz_사칙연산 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try
		{
				int x, y; char sym;
				char str;

				System.out.print("연산자를 입력하세요 ( +, -, *, / ) : ");
				//str = sc.next(); sym = str.charAt(0);
				str = sc.next().charAt(0);

				System.out.print("정수 2개를 입력하세요 : ");
				x = sc.nextInt(); y = sc.nextInt();
				if(str == '+')
					System.out.println("\nresult : " + x + " + " + y + " = " + ( x+y ) + "\n");
				else if(str == '-')
					System.out.println("\nresult : " + x + " - " + y + " = " + ( x-y ) + "\n");
				else if(str == '*')
					System.out.println("\nresult : " + x + " * " + y + " = " + ( x*y ) + "\n");
				else if(str == '/') {
					System.out.println("\nresult : " + x + " / " + y + " = " + ( x/y ) + "\n");
				}
				else
					System.out.println("\nresult : ERROR!\n");
		}
		catch (Exception e)
		{
			System.out.println("0으로 나눌 수 없습니다.");
//			e.printStackTrace();
		}
	}

}
//*/


/*
package ex02.IF;

import java.util.Scanner;

public class Quiz_사칙연산 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x, y; char sym;
		String str;

		System.out.print("연산자를 입력하세요 ( +, -, *, / ) : ");
		str = sc.next(); 
		sym = str.charAt(0);

//		System.out.println(" str.charAt(2) = " + str.charAt(2));
		System.out.print("정수 2개를 입력하세요 : ");
		x = sc.nextInt(); y = sc.nextInt();

		if(sym == '+')
			System.out.println("\nresult : " + x + " + " + y + " = " + ( x+y ) + "\n");

		else if(sym == '-')
			System.out.println("\nresult : " + x + " - " + y + " = " + ( x-y ) + "\n");

		else if(sym == '*')
			System.out.println("\nresult : " + x + " * " + y + " = " + ( x*y ) + "\n");

		else if(sym == '/') {
			try 	{
				System.out.println("\nresult : " + x + " / " + y + " = " + ( x/y ) + "\n");
			} 
			catch (Exception e)	{
				//e.printStackTrace(); //에러를 단계별로 찾아서 출력
				System.out.println( e.getMessage() );  //제공되는 에러 메세지
				//System.out.println("\nresult : ERROR!\n");  //user message
			}
		}

		else
			System.out.println("\nresult : ERROR!\n");
	}

}
//*/

/*
	문제] 사칙연산 프로그램 작성(예외처리하기)
	  숫자 2개 입력 받고, 연산자(+, -, *, /) 1개 입력 받아서
	    
	  result> 
	    3
	    5
	    +    
	
	   3 + 5 = 8
	
	 String strop = sc.next();   "+"    strop == "+"
	 char op = strop.charAt(0)

*/






