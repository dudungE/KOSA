/*
package ex08.utilPackage;

import java.util.StringTokenizer;

public class StringTokenizerMain {
	public static void main(String[] args) {
		
		StringTokenizer token = new StringTokenizer("사과=10|초코렛=3|샴페인=1", "=|", true);
		
		while( token.hasMoreTokens() ) {  // 다음 요소가 있느냐?
			//System.out.println(token.nextToken());
			String  str = token.nextToken();
			
			if( str.equals("=")) System.out.print("\t");
			else if( str.equals("|")) System.out.print("\n");
			else System.out.println(str);
		}
	}
}
//*/

//*
package ex08.utilPackage;

import java.util.StringTokenizer;

public class StringTokenizerMain {
	public static void main(String[] args) {
		StringTokenizer token = new StringTokenizer("김연아/박태환/ 손연재 /이휘 /김지은 |박준 &공현진", "/");
		// new StringTokenizer("김연아 박태환 손연재 이휘 김지은 박준 공현진");

		while (token.hasMoreTokens()) {
			System.out.println(token.nextToken());
		}

		// split() 메소드 이용해서 출력하기
		System.out.println("--------split() 메소드 이용1-----------------------");
		String str = "김연아/박태환/ 손연재 /이휘 /김지은 |박준 &공현진";
		
		String[] result = str.split("/");
		
		for (int x = 0; x < result.length; x++) {
			System.out.println(result[x].trim()); // trim()으로 앞뒤 공백 제거
		}

		// split() 메소드로 "|"와 "&" 기준으로 문자열 나누기
		System.out.println("--------split() 메소드 이용2-----------------------");

		// "|"와 "&"을 구분자로 사용하여 문자열 분리
		String[] result2 = str.split("[|&]");
		for (int x = 0; x < result2.length; x++) {
			System.out.println(result2[x].trim()); 
		}

		System.out.println("==================================");
//		String[] result3 = "this is a test".split("\\s");
		String[] result3 = "김연아/박태환/ 손연재 /이휘 /김지은 |박준 &공현진".split("/");
		for (int x = 0; x < result3.length; x++)
			System.out.println(result3[x]);
	}
}
//*/
