package quiz_score;

import java.util.Arrays;

public class ScoreMain {
	
	public static void main(String[] args) {
		
		int SU = 2, NO = 3;
		int[][] arr = new int[SU][NO + 1]; // 인원수, 과목수/총점
		String[] name = new String[SU];
		double[] avg = new double[SU];
		char[] grade = new char[SU];
		
		Score s = new Score();  // 객체생성

		s.input(name, arr);
	
		s.total(arr);
		s.average(arr, avg, NO);
		for (int i = 0; i < avg.length; i++) {
			grade[i] = s.grade(avg[i]);
		}

		double[] scorePan = Arrays.copyOf(avg, SU);
		Arrays.sort(scorePan);
		
		s.output(SU,name, arr, avg, grade,scorePan);

	} // main end
}
