package ex04.mainMethod;

public class MainEntry {

		public static void main(String[] args) {
			
			if( args.length < 1 ) {
				System.out.println("using error!! ");
				return;   //제어권 넘김
			}
			
//			System.out.println(args[0] + args[1]); // ? 문자열 결합
//			System.out.println(args[1]);
//			System.out.println(args[2]);
//			System.out.println(args[5]);
			
//			String s1 = args[0];
//			String s2 = args[1];
//			int num1 = Integer.parseInt(s1);
//			int num2 = Integer.parseInt(s2);
			
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			
			System.out.println(num1 + num2);
			
			System.out.println("plus = " + (  Integer.parseInt(args[0]) + Integer.parseInt(args[1]) ) );
			
			
		}
}










