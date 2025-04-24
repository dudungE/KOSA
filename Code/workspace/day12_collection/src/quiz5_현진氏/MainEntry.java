package quiz5_현진氏;

import java.util.HashMap;
import java.util.Scanner;
/*
 	문제] Video class 
     no  비디오번호
     title 비디오제목
     category  장르
     lend   대여여부
     lendName  대여자(고객명)
     lendDate   대여일자(오늘날짜 입력하심 되요)

     Video 추가 / 삭제 / Video 리스트 출력 / 수정 / 프로그램 종료  출력하는 프로그램 작성하기.
 */
public class MainEntry {
	public static void main(String[] args) {
		HashMap<Integer, Video> videoList = new HashMap();
		
		videoList.put(1, new Video(1, "Interstellar", "Sci-Fi", "Alice", "2025-04-01", true));
        videoList.put(2, new Video(2, "La La Land", "Romance", "", "", false));
        videoList.put(3, new Video(3, "John Wick", "Action", "Bob", "2025-03-28", true));
		
		Scanner sc = new Scanner(System.in);
		VideoCtrl vc = new VideoCtrl();
		int menu;
		boolean running = true;
		
		while(running) {
			System.out.print("\n메뉴 번호를 선택해 주세요(추가(1), 삭제(2), 출력(3), 대여(4), 종료(0)): ");
			menu = sc.nextInt();
			switch(menu) {
			case 1:  // 추가
				vc.add(sc, videoList);
				break;
			case 2:  // 삭제
				System.out.print("삭제할 번호를 입력해주세요: ");
				videoList.remove(vc.delete(sc));
				break;
			case 3:  // 출력
				vc.print(videoList);
				break;
			case 4:  // 대여
				vc.update(sc, videoList);
				break;
			case 0:  // 종료
				System.out.println("프로그램 종료");
                running = false;
                break;			
            default: System.out.println("잘못된 입력입니다.");
		}  // switch end
		}
	}

}
