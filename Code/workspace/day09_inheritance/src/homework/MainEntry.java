package homework;
import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		
		Regular re;
		Sales sa ;
			
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		System.out.print("1. 내부정규직원, 2. 영업부직원  3.아르바이트  중 사원형태를 입력해주세요 ex) 판매사원  : ");
	
		choice = (sc.nextInt());
		
		switch ( choice ) {
			case 1 :
				re = new Regular();  //객체생성, 메모리에할당, 생성자함수 자동호출
				re.input();
				re.disp();
				break;
			case 2 :
				sa = new Sales();
//				re.input();
				sa.disp();
				break;
			case 3 :
				PartTime pt = new PartTime();
				pt.show();
				break;
		} // switch case end
	} // main m end
} // MainEntry class end
