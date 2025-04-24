package ex01.scanner;

import java.util.Scanner;     // ctrl + shift + o

public class MainEntry {
	
	public static void main(String[] args) {
		
				// System.in : 표준 입력
		  Scanner sc = new Scanner(System.in);
		  
		  System.out.println("integer data input : ");
		  int su = sc.nextInt();
		  
		  System.out.println(su);
	}

}
