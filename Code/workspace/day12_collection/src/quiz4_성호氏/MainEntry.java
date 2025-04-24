package quiz4_성호氏;

import java.util.Scanner;

public class MainEntry {

	public static void main(String[] args) {
		VideoManager vm = new VideoManager();
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		
		while (flag) {
			System.out.println("안녕하세요 비디오 관리 시스템입니다.");
			System.out.println("메뉴를 선택해주세요");
			System.out.println("1. 비디오 추가");
			System.out.println("2. 비디오 삭제");
			System.out.println("3. 비디오 출력");
			System.out.println("4. 비디오 수정");
			System.out.println("5. 프로그램 종료");
			
			int selectNumber = sc.nextInt();
			
			switch (selectNumber) {
				case 1:
					vm.addVideo();
					break;
					
				case 2:
					vm.delete();
					break;
					
				case 3:
					vm.printVideos();
					break;
					
				case 4:
					vm.editVideo();
					break;
					
				case 5:
					System.out.println("프로그램을 종료합니다.");
					flag = false;
					System.exit(0);
					break;
	
				default:
					System.out.println("올바른 숫자를 입력해주세요");
					break;
			}
		}
		
		System.out.println();

	}

}
