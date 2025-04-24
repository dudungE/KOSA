package ex00;

public class MainEntry {
	public static void main(String[] args) {
		int num1 = 30;
		
		System.out.println(num1++);  //30
		System.out.println(++num1); //32
		System.out.println(num1--); //32
		System.out.println(--num1);  //30
		System.out.println(num1++ + ++num1);  // 62
		
		
		
//		int num1 = 5;
//		int num2 = ++num1;    <---- 이부분에서 ++num1; 로 인해서 6으로 값 셋팅
//		
//		System.out.println(num1);  // 6  위에 ++num1; 에서 6으로 셋팅 된 값이 출력됨
//		System.out.println(num2);  //6   위의 num2 = ++num1;  대입으로 num1의 값을 넣었기 때문에... 6 
//		System.out.println(++num1); //7   6이었던 상태에서 전위 연산으로 값증가하고 출력하니 7입니다.
	}
}
