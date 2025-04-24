/*
package quiz;

import java.util.Scanner;
//4. 임의의 문자열을 입력 받아서 대문자는 소문자로, 소문자는 대문자로 출력하는 프로그램
public class MainEntry {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("문자열을 입력하세요: ");
        String input = sc.nextLine();
        String result ="";
        
//        StringBuilder result = new StringBuilder();
        
        // 문자열을 하나씩 순회하면서 대소문자 변환
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isUpperCase(ch)) {
            	result += Character.toLowerCase(ch);
//                result.append(Character.toLowerCase(ch));
                
            } else if (Character.isLowerCase(ch)) {
            	result += Character.toUpperCase(ch);
//                result.append(Character.toUpperCase(ch));
                
            } else {
            	result += ch;
//                result.append(ch); // 대소문자가 아닌 문자는 그대로
            }
        }

        System.out.println("변환된 문자열: " + result.toString());
        
        sc.close();
    }
}
//*/

//*
package quiz;

//3. 주어진 문자열을 대문자는 소문자로 소문자는 대문자로 출력하기 
public class MainEntry {
	public static void main(String[] args) {
		String str = "abcDEFGHeijwEIMPYmnqr";
		// 위의 str 문자열을 대문자는 소문자로 소문자는 대문자로 출력하기
		String result = "";
		
		for (int i = 0; i < str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if( ch >= 'A' && ch <= 'Z' ) {
				result += String.valueOf(ch).toLowerCase();
			} else if( ch >= 'a' && ch <= 'z') {
				result += String.valueOf(ch).toUpperCase();
			} else {
				result += ch;
			} // if end
		} // for end
		
		System.out.println( result );
  }
}
//*/

/*
package quiz;

import java.util.Scanner;
//2. 주어진 문자열에서 대문자 개수와 소문자 개수 출력하는 프로그램
public class MainEntry {
	public static void main(String[] args) {
        String str = "ABC def kbsmbc 123 BB";
        
        int upperCount = 0;
        int lowerCount = 0;
        int digitCount = 0;

        // 문자열을 하나씩 순회하면서 대소문자 개수 계산
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isUpperCase(ch)) {
                upperCount++;
            } else if (Character.isLowerCase(ch)) {
                lowerCount++;
            } else if (Character.isDigit(ch)) {  //
            	digitCount++;
            }
        }

        // 결과 출력
        System.out.println("대문자 개수: " + upperCount);
        System.out.println("소문자 개수: " + lowerCount);
        System.out.println("숫자 개수: " + digitCount);
        
    }
}
//*/

/*
package quiz;

import java.util.Scanner;
//1. 대문자로 입력 받아서 소문자로 출력하는 프로그램
public class MainEntry {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("대문자 문자열을 입력하세요: ");
	        String input = sc.nextLine();

	        // 대문자를 소문자로 변환
	        String result = input.toLowerCase();
	        
	        System.out.println("소문자 문자열: " + result);
	        
	        sc.close();
	    }
}
//*/