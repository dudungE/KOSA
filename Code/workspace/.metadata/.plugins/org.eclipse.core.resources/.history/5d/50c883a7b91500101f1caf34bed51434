package ex01.lambda;

@FunctionalInterface
interface Message {
	void something(int x, int y);    //  parameter O
//	int good(int x);
}

@FunctionalInterface
interface Talk {
	void something(String x, String y);
}

class Person {
	public void greeting(Message msg) {
		msg.something(3, 5);
	}
	
	public void greeting(Talk msg) {
		msg.something("Hello " , "MSA-th2 !!");
	}
}

public class MainEntry5 {
	public static void main(String[] args) {
		Person  p = new Person();
			
		System.out.println("------------------------------------------------");
//		  public int sum( int x, int y ) {  return x + y; } 
//		   (x, y) -> {  x + y; }

		char ch = 'K';
		
//		p.greeting(  (x, y)  -> {  // 에러발생, 타입에 대해서 애매해서 타입을 정확히 써줘야함
//		p.greeting(  (int x, int y)  -> { 
		p.greeting(  (String x, String y)  -> {  // lambda 형태, 자료형 안써도 됨,  매개변수가 2개 이상일때는 괄호 생략하면 안됨
			System.out.println("lambda  return type, parametor O 안녕하세요  ");
			System.out.println("x = " + x + ", y = " + y);
			//ch = 'P';  // 값 변경 할 수 없다.
			System.out.println(ch);  // 출력은 가능
			
			num = 500; // static  변수값은 변경 가능함.
			System.out.println(num);
		});
	}
	
	static int num = 30;
}








