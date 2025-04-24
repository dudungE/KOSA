package ex03.operator;

//최단산쉬관논삼대콤
public class OperatorTest2 {
	
	public static void main(String[] args) {
		//논리연산자: and (&, &&), or ( | , || ), xor ( ^ ), not ( ! )
		// 2진논리 ==> 결과: 값,   10진 논리 ==> 결과 : 참/거짓
		
//		System.out.println(4^7);
		
		int x = 10, y = 20, z = 30;
		boolean flag = false;
		
//		flag = (x > y) && ( y < z );   // '&&' 연산은 앞에 것이 '거짓'이면 뒤는 수행하지 않는다.	
		flag = (x > y) || ( y > z );
		System.out.println(flag);
		
//		flag = (x > y) && ( y > z );
		flag = (x < y) || ( y > z );   // '||' 연산은 앞에 것이 '참'이면 뒤는 수행하지 않는다.	
		System.out.println(flag);
		
		
	}
}
