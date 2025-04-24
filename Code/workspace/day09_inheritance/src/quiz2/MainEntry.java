package quiz2;

public class MainEntry {
	public static void main(String[] args) {
		
		// 학생 성적 객체 생성
		Score s = new Score();
		s.display();
		System.out.println("=====================");
		
		Score score = new Score("이영희", 90, 92, 95);
		// 성적 출력
		score.display();
		
	}
}
