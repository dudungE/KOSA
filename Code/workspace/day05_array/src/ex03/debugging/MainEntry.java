package ex03.debugging;

public class MainEntry {
	
	public static void main(String[] args) {
		
		int x = 5, y = 10;
		int i ; 
		for ( i = 1; i <= 10; i++) {
			
			
			if ( i == x ) continue;
			
			y++;
			--x;
			
		}
		System.out.println(i);
		
		System.out.println("x = " + x  + ", \ty = " + y);
	}
}
