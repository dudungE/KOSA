package ex02.RandomClass;

import java.util.Random;

public class MainEntry {
	public static void main(String[] args) {
		
		Random rand = new Random();  //객체생성, 메모리에 할당, 생성자함수 자동호출
		
		System.out.println(rand.nextDouble());
		System.out.println(rand.nextInt());
		
		int num = rand.nextInt();
		System.out.println(num);
		
		System.out.println("----------------------------------");
		// rand.nextInt(n);  // 0 ~ n-1 값 추출함
		System.out.println(rand.nextInt(5));  // 0 ~ 4 
		System.out.println(rand.nextInt(5)+1);  // 1 ~ 5 
		
		System.out.println("----------------------------------");
		for (int i = 0; i < 6; i++) {
			System.out.println( rand.nextInt(45) + 1 );
		}
	}
}








