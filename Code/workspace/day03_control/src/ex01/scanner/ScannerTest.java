package ex01.scanner;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str2= null, str3 = null;
		System.out.println("x, y, str, str2 = ");
		
		
		
		int x = new Scanner(System.in).nextInt();
//		int y = new Scanner(System.in).nextInt();
		
		str2 = sc.next(); 
		str3 = sc.next();
		
//		String str = new Scanner(System.in).next(); // 공백 인식하지 못한다.
//		String str2 = new Scanner(System.in).nextLine();  // 공백인식한다.
		
//		System.out.println(x + ", " + y + ", " + str + ", " + str2);
		System.out.println(x + ", " + str2 + ", " + str3);
	}
}







