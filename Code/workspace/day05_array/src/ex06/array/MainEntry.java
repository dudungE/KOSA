package ex06.array;

import java.util.Iterator;
import java.util.Random;

/* 3차원 배열
   자료형[][][] 배열명 = new 자료형[면크기][행크기][열크기];
   int[][][] a = new int[2][2][3];
 */
public class MainEntry {
	public static void main(String[] args) {
		int[][][] a = new int[2][3][4];
		
		System.out.println(a.length); //면크기
		System.out.println(a[0].length); //행크기
		System.out.println(a[1].length); //행크기
		System.out.println(a[0][0].length); //열크기
		System.out.println(a[0][1].length); //열크기
		System.out.println(a[0][2].length); //열크기
		System.out.println("=========================");
		// 임의적인 데이터 입력 받아서 출력하는 프로그램 작성
		//input
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				for (int k = 0; k < a[i][j].length; k++) {
					a[i][j][k] = new Random().nextInt(100);
				} // k end
			} // j end
		} // i end
		
		//output
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				for (int k = 0; k < a[i][j].length; k++) {
					System.out.print(a[i][j][k] + "\t");
				} // k end
				System.out.println();
			} // j end
			System.out.println();
		} // i end
		
	}
}







