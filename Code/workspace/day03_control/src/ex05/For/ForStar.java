package ex05.For;

public class ForStar {
	public static void main(String[] args) {
		
		// 역정삼각형////////////////////////////////////
			for (int i = 1; i <= 5; i++) { // row - 개행

				for(int j = 1; j <= 5-i;  j++ ) System.out.print(" ");
				
				for (int j = 1; j <= (2 *i - 1); j++) { // col - '*' 출력

					System.out.print("*");

				} // j end

				System.out.println();

			} // i end
			System.out.println();

		// 역정삼각형////////////////////////////////////
		for (int i = 1; i <= 5; i++) { // row - 개행

			for (int j = 1; j <= 6-i; j++) { // col - '*' 출력

				System.out.print("*");

			} // j end

			System.out.println();

		} // i end
		System.out.println();

		// 정삼각형////////////////////////////////////
		for (int i = 1; i <= 5; i++) { // row - 개행

			// for (int j = 5; j >= 6-i; j--) {
			for (int j = 1; j <= i; j++) { // col - '*' 출력

				System.out.print("*");

			} // j end

			System.out.println();

		} // i end
		System.out.println();

		// 정사각형////////////////////////////////////
		for (int i = 1; i <= 5; i++) { // row - 개행

			for (int j = 1; j <= 5; j++) { // col - '*' 출력

				System.out.print("*");

			} // j end

			System.out.println();

		} // i end
	}
}
