//*
package ex02.textPackage;

import java.text.ChoiceFormat;

public class ChoiceFormatEx {
	public static void main(String[] args) {
		
		String pattern = "50#F|60#D|70#C|80#B|90#A";
		
		int[]  score = { 100, 95, 70, 55, 60, 70 };
		
		ChoiceFormat form = new ChoiceFormat(pattern);
		
		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i] +" : " + form.format(score[i]) );
		}
	}
}
//*/

/*
package ex02.textPackage;

import java.text.ChoiceFormat;

public class ChoiceFormatEx {
	public static void main(String[] args) {
		
		double[]  limits = { 50, 60, 70, 80, 90 };  //낮은 값부터 큰 값의 순서로 적어줌
		String[] grades = { "F", "D", "C", "B", "A" };
		
		int[]  score = { 100, 95, 70, 55, 60, 70 };
		
		ChoiceFormat form = new ChoiceFormat(limits, grades);
		
		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i] +" : " + form.format(score[i]) + "학점");
		}
	}
}
//*/