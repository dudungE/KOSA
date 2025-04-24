package ex03.returnValue;

public class MainEntry {
	
	public static void main(String[] args) {
		
		int x = 5;
		
		System.out.println(x);
		x *= 100;
		
		if( x == 500 ) return;   // 제어권 넘김
		
		System.out.println(x);
		System.out.println("여기까지 출력해줘~~~");
		
		
	}
}

/*
> return
   return 값;   // 오직 1개
  예) int x = 3, y = 5;
     return x + y;   // return x, y;  <---- error

  return;  //제어권 넘김

*/