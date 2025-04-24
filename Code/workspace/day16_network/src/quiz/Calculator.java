package quiz;

public class Calculator {
	// 더하는 함수
	public static int plus(int x, int y) {
		return x + y;
	}

	// 빼는 함수
	public static int sub(int x, int y) {
		return x - y;
	}

	public static void main(String[] args) {
		int x = 3;
		int y = 5;

		// 더하기 예시
		int resultPlus = plus(x, y);
		System.out.println("덧셈 결과: " + resultPlus);

		// 빼기 예시
		int resultSub = sub(x, y);
		System.out.println("뺄셈 결과: " + resultSub);
	}
}