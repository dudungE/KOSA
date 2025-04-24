package quiz.bmi_동규氏;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PersonManager manager = new PersonManager();
		
		while(true) {
			System.out.println("======================= 비만도 측정 프로그램 ======================");
			System.out.println("1.추가 / 2.삭제 / 3.수정 / 4.출력 / 5.저장(파일) / 6.출력(파일) / 7.종료");
			switch (sc.nextLine()) {
			case "1":
				manager.addPerson();
				break;
			case "2":
				manager.deletePerson();
				break;
			case "3":
				manager.updatePerson();
				break;
			case "4":
				manager.printList();
				break;
			case "5":
				manager.saveFile();
				break;
			case "6":
				try {manager.loadFile();} catch (Exception e) {e.printStackTrace();}
				break;
			case "7":
				System.out.println("프로그램을 종료하겠습니다.");
				System.exit(0);
				break;
			default:
				System.out.println("잘못된 입력입니다. 번호 1 ~ 7만 입력해주세요.");
				break;
			}
		}
	}
}
