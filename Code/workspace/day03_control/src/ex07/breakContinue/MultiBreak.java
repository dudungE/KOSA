package ex07.breakContinue;

public class MultiBreak {
	public static void main(String[] args) {
		
		boolean flag = true;
		
		firust : {
			second : {
				third : {
					
					int k = 100;
					System.out.println("Before the break");  // 1
					
					if( flag ) break second;   //  break 식별자;    식별자 위치까지 탈출
					
					System.out.println("This won't execute");  // 2
					
				} // end third
				
				System.out.println("msa 2기 홧팅!!!");  // 3
				
			} // end second
			System.out.println("This is after second break!!");  // 4
			
		} // end firust
		System.out.println("12345678");  // 5
	}
}

/*
	식별자1 : {
		
		식별자2 : {
			
			break 식별자1;
		}
	}
*/