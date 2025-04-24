package ex02.method;

/*1) 매개변수 없고, 리턴타입 없는 경우
    public  returnType  methodName() {   }
    
    2) 매개변수 있고, 리턴타입 없는 경우
        public  returnType  methodName(parameter var1, parameter var2,...) {   }
*/
public class MainEntry {
	
	// 2) 매개변수 있고, 리턴타입 없는 경우
	public static void plus(int x, int y, String msg) {  //함수정의부(구현부)
		System.out.println("hap = " + (x + y));
		int sum = x + y;
		System.out.println("sum = " + sum);
		System.out.println(msg);
		System.out.println(x + ", " + y + ", " + msg);
	}
	
	// 절대값 구하는 함수 구현하기.
	public static void abs( int x ) {
		if ( x < 0 ) x = -x;
		System.out.println("절대값 : " +x);
	}
	
	
	public static void main(String[] args) {  //시작점(진입점)
		abs(-9);
		abs(100);
		plus(1,2, "hello");  //함수호출
		line();
		System.out.println("start main");
		info();
		line();
		info();
		line();
		line();
		
		System.out.println("end main");
	}
	
	
	//1) 매개변수 없고, 리턴타입 없는 경우
	public static void info() {
		System.out.println("doyeon");
		System.out.println("010-9872-0202");
		System.out.println("seoul");
	}
	public static void line() {
		System.out.println("---------------------------------");
	}
}
