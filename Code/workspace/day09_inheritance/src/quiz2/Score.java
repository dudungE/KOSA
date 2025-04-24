package quiz2;

public class Score {
	
	private String name; // 학생 이름
	private int koreanScore; // 국어 점수
	private int englishScore; // 영어 점수
	private int compScore; // 전산 점수
	
	public Score() {
		// TODO Auto-generated constructor stub
	}

	public Score(String name, int koreanScore, int englishScore, int compScore) {
	        this.name = name;
	        this.koreanScore = koreanScore;
	        this.englishScore = englishScore;
	        this.compScore = compScore;
	    }

	public int getTotalScore() {
		return koreanScore + englishScore + compScore; // 총점 계산
	}

	public double getAverageScore() {
		return getTotalScore() / 3.0; // 평균 계산
	}

	public String getGrade() {
		double average = getAverageScore();
		if (average >= 90) {
			return "A";
		} else if (average >= 80) {
			return "B";
		} else if (average >= 70) {
			return "C";
		} else if (average >= 60) {
			return "D";
		} else {
			return "F";
		}
	}
	
	public void display() {
		System.out.println("이름: " + name);
		System.out.println("총점: " + getTotalScore());
		System.out.println("평균: " + getAverageScore());
		System.out.println("학점: " + getGrade());
		System.out.println();
	}
}
