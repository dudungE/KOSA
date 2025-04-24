//package ex01.lambda;
//
//interface Message {
//	int something();    // int  return type,  parameter X
//}
//
//class Person {
//	public void greeting(Message msg) {
//		int su = msg.something();
//		System.out.println("Message interface something : " + su);
//	}
//}
//
//public class MainEntry2 {
//	public static void main(String[] args) {
//		Person  p = new Person();
//		
//		p.greeting(new Message() {  // 일반적인 형태
//			@Override
//			public int something() {
//				System.out.println("return type 안녕하세요 ");
//				System.out.println("한주 동안 수고 많으셨어요.");
//				return 100;
//			}
//		});
//		
//		System.out.println("------------------------------------------------");
////		  public int sum( int x, int y ) {  return x + y; } 
////		   (x, y) -> {  x + y; }
//		
//		p.greeting(() -> {  // lambda 형태
//			System.out.println("lambda  return type 안녕하세요. ");
//			System.out.println("한주 동안 수고 많으셨어요.");
//			return 200;
//		});
//	}
//}

