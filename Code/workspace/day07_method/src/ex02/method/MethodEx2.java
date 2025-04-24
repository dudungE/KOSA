package ex02.method;
/*
  4) 매개변수 있고, 리턴타입 있는 경우
      public  returnType  methodName(parameter var1, parameter var2,...) { return  value;  }
 */
public class MethodEx2 {
	
	// 4) 매개변수 있고, 리턴타입 있는 경우
//	public static int name(int x) {
//		System.out.println("x = " + x);
//		return x;
//	}
	
	public static String name(int x, String irum) {
		System.out.println("x = " + x);
		return irum;
	}
	
	public static double value(int x, int y, double d) {
		return x + y + d;
	}
	
	public static String display( int x, String name) {
		value(1, 2, 3.0);
		
		for(int i = 0; i <= x; i++) {
			System.out.print(name + "\t");
		}
		System.out.println();
		return name + x;
	}

//	public static int value(int x, int y) {
//		return x + y + 2.3;
//	}
	
	public static void main(String[] args) {
		System.out.println(display(30, "&"));
		System.out.println(display(20, "*"));
		
		String trangle = display(15, "▲");
		System.out.println(trangle);
		
		
//		System.out.println(value(1,2, 12.34));
//		System.out.println(value(1,2));
		
		String str = name(10, "doyeon");
		System.out.println(str);
		
//		System.out.println(name(23));
//		int num = name(33);
//		System.out.println(num);
	}
}






