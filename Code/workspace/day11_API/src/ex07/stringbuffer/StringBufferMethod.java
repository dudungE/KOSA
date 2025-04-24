package ex07.stringbuffer;

public class StringBufferMethod {
	public static void main(String[] args) {
		StringBuffer  sb = new StringBuffer("This");
		System.out.println(sb);
		
		sb.append(" is pencil"); //문자열 추가
		System.out.println(sb);
		
//		System.out.println(sb.reverse()); //
		System.out.println("---------------------------------");
		
		sb.insert(7,  " my"); // 문자열 삽입
		System.out.println(sb);
		
		sb.replace(8, 10, "your");  // 문자열 변경(교체) 
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println("========================");
		System.out.println(sb.indexOf("your"));
		System.out.println(sb.indexOf("s"));
		System.out.println(sb.lastIndexOf("s"));
		System.out.println("========================");
		
		sb.delete(0, 5);
		System.out.println(sb);
		
		sb.setLength(5);
		System.out.println(sb);
		System.out.println(sb.capacity());
		
		sb.setLength(20);
		System.out.println(sb);

	}
}







