package quiz;

import java.util.Scanner;   //ctrl + shift + o

public class UpDownGame {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int randomInt = (int) (Math.random() * 100) + 1;
		System.out.println("up/down 게임입니다. 기회는 총 5번\n숫자를 입력해주세요.");
		for (int i = 0; i < 5; i++) {
			int n = sc.nextInt();
			if (randomInt > n) {
				System.out.println("up");
			} else if (randomInt < n) {
				System.out.println("down");
			} else
				System.out.println("정답!");
		}
		System.out.println("입력 기회 5회를 다 사용 하셨습니다. 답은 " + randomInt + "였습니다.");
	}
}

/*
	문제1] 업/다운 게임 프로그램 작성 (난수 이용)
	1~100 숫자 중에서 임의의 난수 추출해 놓고, 사용자는 5번의 기회를줘서 입력 받는다.  
	그 입력 받은 숫자와 추출한 난수가 같은지를 판정하는 프로그램 작성
 */