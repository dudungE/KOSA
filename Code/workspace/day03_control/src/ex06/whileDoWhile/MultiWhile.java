package ex06.whileDoWhile;

public class MultiWhile {
	public static void main(String[] args) {
		
		// 구구단 전체 출력 - 중첩 while문 이용
		
		int i=1, j ;
		
		while( i < 10) {
			j = i;
			while ( j <= 9) {
				System.out.print(j + "*"  + i + "=" + (i*j) + "\t");
			} // in end
			
			System.out.println();
		} // out end
		
	}
}
