package ex06.string;

class Point{ }

public class MainEntry {
	public static void main(String[] args) {
		int x = 999;
		String str = "abc";
//		String str = new String("abc");
		System.out.println("str : " + str);
		
		Point pt = new Point();
		System.out.println(pt);
		System.out.println(str);
		
		char data[] = {'a', 'b', 'c'};
	    str = new String(data);
	    System.out.println("str : " + str);
	    System.out.println("kbs");
	    
	    String msg = "cdefghij";
	    System.out.println("Korea " + msg);  // Korea cdefghij
	    System.out.println(msg);  //cdefghij
		
	    msg = msg.concat(" Korea");  //문자열 결합
	    System.out.println(msg);
	    
	    String str2 = "abcdef".substring(2);
	    System.out.println(str2);  // cdef
	    
	    str2 = "abcdefghi1234566jexy".substring(2, 5);  // 상한값 포함, 하한값 미포함
	    System.out.println(str2);
	    
	    System.out.println(msg + " : " + str2);
		
	}
}







