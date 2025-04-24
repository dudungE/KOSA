//package ex01.lambda;
//
//interface Message {
//	void something();    // void,  parameter X
//}
//
//class Person {
//	public void greeting(Message msg) {
//		msg.something();
//	}
//}
//
//public class MainEntry {
//	public static void main(String[] args) {
//		Person  p = new Person();
//		
//		p.greeting(new Message() {  // 일반적인 형태
//			@Override
//			public void something() {
//				System.out.println("안녕하세요. ");
//				System.out.println("한주 동안 수고 많으셨어요.");
//			}
//		});
//		
//		System.out.println("------------------------------------------------");
////		  public int sum( int x, int y ) {  return x + y; } 
////		   (x, y) -> {  x + y; }
//		
//		p.greeting(() -> {
//			System.out.println("lambda 안녕하세요. ");
//			System.out.println("한주 동안 수고 많으셨어요.");
//		});
//
//	}
//}
//
//
//
//
//
//
//
//
