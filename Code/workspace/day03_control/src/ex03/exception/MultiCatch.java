package ex03.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatch {

	public static void main(String[] args) {
		System.out.println("x , y = ");
		int x, y, result;

		try {
			x = new Scanner(System.in).nextInt();
			y = new Scanner(System.in).nextInt();

			result = x / y; // 에러발생 할 수 있다.

			System.out.println(result);

		} catch (ArithmeticException e) {
			// System.out.println("0으로 나눌 수 없습니다."); // user message
			System.out.println("ArithmeticException ");
			// System.out.println(e.getMessage());
			// e.printStackTrace();
		} catch (InputMismatchException e) {
			// System.out.println("0으로 나눌 수 없습니다."); // user message
			System.out.println("InputMismatchException ");
			// System.out.println(e.getMessage());
			// e.printStackTrace();
		} catch (Exception e) {
			// System.out.println("0으로 나눌 수 없습니다."); // user message
			System.out.println("Exception");
			// System.out.println(e.getMessage());
			// e.printStackTrace();
		} // try end

	}
}
