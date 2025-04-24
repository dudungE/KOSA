package ex07.stringbuffer;

public class MainEntry {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		
		System.out.println(sb.hashCode()); // 681842940
		
		System.out.println("length             /                 capacity");
		System.out.println(sb.length()+"                 /               " + sb.capacity());
		int len = sb.length();    		int size = sb.capacity();
		System.out.println(len+"                 /               " + size);
		
		sb.append("msa-th2");
		len = sb.length();		size = sb.capacity();
		System.out.println(len+"                 /               " + size);
		
		sb.append("happyvirus");
		len = sb.length();		size = sb.capacity();
		System.out.println(len+"                 /               " + size);
		
//		sb.append("12345 67890");
		sb.append("12345 67890 한글 39482394");
		len = sb.length();		size = sb.capacity();
		System.out.println(len+"                 /               " + size);
		System.out.println(sb.hashCode()); // 681842940
		
		sb.trimToSize();  // 용량 크기 조절
		len = sb.length();		size = sb.capacity();
		System.out.println(len+"                 /               " + size);
	}
}








