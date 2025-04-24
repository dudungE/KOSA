package ex06.string;

public class StringMethod {
	public static void main(String[] args) {
		String s1 = "happydoyeon";
		String s2 = "SEOUL";
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s2.replace("EO", "korea"));  // SkoreaUL
		System.out.println(s2);  // SEOUL
//		s2 = s2.replace("EO", "korea");
//		System.out.println(s2);
		System.out.println("==================================");
		
		s1 = s1 + s2;
//		s1 = s1.concat(s2);  //문자열 결합
		System.out.println(s1);
		System.out.println("==================================");
		
		String s3 = new String("       ab       cd     ");
		System.out.println(s3);
		System.out.println(s3.length()); // 문자열의 길이 
		s3 = s3.trim();  // 공백제거
		System.out.println(s3.length()); 
		System.out.println("==================================");
		
//		String s4 = new String("ab defg 345566 keirte  9848948");
//		String[] s5 = s4.split(" ");
		String s4 = new String("ab/defg/345566/keirte/9848948");
		String[] s5 = s4.split("/");
		for (int i = 0; i < s5.length; i++) {
			System.out.println("분리된 "+i+"번 문자열 : " + s5[i]);
		}
		
		String s6 = "123-4567-8906";
		String[] s7 = s6.split("-");
		for (int i = 0; i < s7.length; i++) {
			System.out.println(s7[i]);
		}
		
		String s8 = "134234afksfsg  84723534 fskdfs 03248234 string";
		char  ch = s8.charAt(8);
		System.out.println(ch); //k
		
		s8 = s8.substring(5, 7); 
		System.out.println(s8);  //4a
		
		System.out.println("+++++++++++++++++++++++++++++++");
		System.out.println("소문자로 출력 toLowerCase() : " + s2.toLowerCase());
		System.out.println("대문자로 출력 toUpperCase() : " + s1.toUpperCase());
		
		char[] ch2 = s1.toCharArray();
//		for (int i = 0; i < s1.length(); i++) {
		for (int i = 0; i <ch2.length; i++) {
			System.out.print(ch2[i] +"\t");
			
		}
		
	}
}












