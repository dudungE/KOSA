package quiz_score;

import java.util.Arrays;
import java.util.Scanner;

public class Score {
	
	//멤버변수
	int SU;
	String[] name;
	int[][] arr;
	double[] avg, scorePan;
	char[] grade;
	
	public Score() {
		// 멤버 초기화
	}
	
	//user method(멤버함수) - input, output 등등
	public  void input(String[] name, int[][] arr) {
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d 번째 학생 이름: ", i + 1);
			name[i] = sc.next();

			for (int j = 0; j < arr[0].length - 1; j++) {
				switch (j) {
					case 0:	System.out.println("국어점수 입력: ");	break;
					case 1:	System.out.println("영어점수 입력: ");	break;
					case 2:	System.out.println("전산점수 입력: ");	break;
				} // switch end
				
				arr[i][j] = sc.nextInt();
				
			} // in for end
		} // out for end
	} // input end  
	
	public  void output(int SU, String[] name, int[][] arr, double[] avg, char[] grade, double[] scorePan)
	{
		for (int i = 0; i < arr.length; i++) {
			System.out.println(name[i] + "님의 성적표");
			System.out.println("국어: " + arr[i][0] + "\t영어: " + arr[i][1] + "\t전산: " + arr[i][2]);
			System.out.printf("총점: %d 평균 : %.1f 평점(학점) : %c ", arr[i][3], avg[i], grade[i]);

			for (int j = 0; j < scorePan.length; j++) {
				if (scorePan[j] == avg[i]) {
					System.out.printf("석차(등수) : %d\n", SU - j);
				}
			}
			line();
		}
	} // output end
	
	public  void total(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length - 1; j++) {
				arr[i][3] += arr[i][j];
			}
		}
	} // 총점 end

	public  void average(int[][] arr, double[] avg, int NO) {

		for (int i = 0; i < arr.length; i++) {
			avg[i] = (double) arr[i][3] / NO;
		}
	} // 평균 end

	public  char grade(double avg) {

		char grade = ' ';

		switch ((int) avg / 10) {
			case 10:
			case 9:	grade = 'A';	break;
			case 8:	grade = 'B';	break;
			case 7:	grade = 'C';	break;
			case 6:	grade = 'D';	break;
			default:	grade = 'F';
		}// switch end
		
		return grade;
		
	} // 학점 end

	private  void line() {
		System.out.println("----------------------------");
	} // line end
	
	//getter / setter 
	public int getSU() {
		return SU;
	}

	public void setSU(int sU) {
		SU = sU;
	}

	public String[] getName() {
		return name;
	}

	public void setName(String[] name) {
		this.name = name;
	}

	public int[][] getArr() {
		return arr;
	}

	public void setArr(int[][] arr) {
		this.arr = arr;
	}

	public double[] getAvg() {
		return avg;
	}

	public void setAvg(double[] avg) {
		this.avg = avg;
	}

	public double[] getScorePan() {
		return scorePan;
	}

	public void setScorePan(double[] scorePan) {
		this.scorePan = scorePan;
	}

	public char[] getGrade() {
		return grade;
	}

	public void setGrade(char[] grade) {
		this.grade = grade;
	}
	
}


/*
문제] 이름 입력 받고, 국어,영어,전산 점수 입력 받아서 
	  총점, 평균까지 구하는 프로그램 작성
	  
	  이도연님의 성적표**************
	  국어 : 100, 영어 : 100, 전산 : 100
	  총점 : 300, 평균 : 100.0, 평점(학점) : A,  석차(등수) : 1
*/