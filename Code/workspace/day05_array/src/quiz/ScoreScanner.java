//*
package quiz;

import java.util.Scanner;

public class ScoreScanner {
	
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        int students = 3;
	        int subjects = 3;  //"국어", "영어", "전산"
	        String[] subjectNames = {"국어", "영어", "전산"};
	        String[] name = new String[students];
	        int[][] scores = new int[students][subjects]; // 학생수, 과목수
	        int[] totalScores = new int[students];
	        double[] averages = new double[students];
	        char[] grades = new char[students];
	        
	        // 입력 받기
	        for (int i = 0; i < students; i++) {
	        	System.out.print("\nname = " );
	        	name[i] = sc.next();
	            System.out.println(name[i] + " 학생 " + (i + 1) + "의 성적 입력: ");
	            for (int j = 0; j < subjects; j++) {
	                System.out.print(subjectNames[j] + " 점수: ");
	                scores[i][j] = sc.nextInt();
	                totalScores[i] += scores[i][j];
	            } // j end
	            averages[i] = totalScores[i] / (double) subjects;
	            grades[i] = getGrade(averages[i]);
	        } // i end
	        
	        sc.close();
	        
	        // 결과 출력
	        System.out.println("\n성적표 ************************************");
	        System.out.println("번호\t이름\t 국어\t영어\t전산\t총점\t평균\t평점");
	        
	        for (int i = 0; i < students; i++) {
	            System.out.print((i + 1) + "\t");
	            System.out.print(name[i] + "\t");
	            for (int j = 0; j < subjects; j++) {
	                System.out.print(scores[i][j] + "\t");
	            } // j  end
	            System.out.printf("%d\t%.2f\t%2c\n", totalScores[i], averages[i], grades[i]);
	        } // i  end
	    }
	    
	    // 평점 계산 메서드
	    public static char getGrade(double avg) {
	        if (avg >= 90) return 'A';
	        else if (avg >= 80) return 'B';
	        else if (avg >= 70) return 'C';
	        else if (avg >= 60) return 'D';
	        else return 'F';
	    }
}
//*/


/*
package quiz;

import java.util.Scanner;

public class ScoreScanner {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//1. 변수선언
		int kor, eng , com,  tot;
		String name = null;
		double avg = 0;
		char grade = ' ';
		
		//2. 메세지 출력 및 입력받기
		System.out.print("name ? ");
		name = sc.nextLine();   // next()  vs nextLine()
		
//		do {
//			System.out.println("kor, eng, com = ? ");
//			kor = sc.nextInt();		eng = sc.nextInt();		com = sc.nextInt();
//		} while( ( kor < 0 || kor > 101 ) || ( eng < 0 || eng > 101 ) || ( com < 0 || com > 101 ) );  // 한꺼번에 처리
		
		do {
			System.out.println("당신의 Kor 점수 입력 요망: ");
			kor = sc.nextInt();
		} while( kor < 0 || kor > 101 );  // 각 과목별 처리 
		
		do {
			System.out.println("당신의 Eng 점수 입력 요망: ");
			eng = sc.nextInt();
		} while( eng < 0 || eng > 101 );
		
		do {
			System.out.println("당신의 Com 점수 입력 요망: ");
			com = sc.nextInt();
		} while( com < 0 || com > 101 );
//	
		
		//3. 처리(계산)
		tot = kor + eng + com;
		avg = tot / 3. ;   //avg = (kor + eng + com) / 3. ;
		
		// 학점(평점) 구하기 - if
		if (avg >= 90)	grade = 'A';
		else if (avg >= 80)	grade = 'B';
		else if (avg >= 70)	grade = 'C';
		else if (avg >= 60)	grade = 'D';
		else	grade = 'F';
		
		  switch ((int)avg / 10) {   // switch ( tot / 30) {
			case 10: 
			case  9: grade = 'A'; break;
			case  8: grade = 'B'; break;
			case  7: grade = 'C'; break;
			case  6: grade = 'D'; break;
			default: grade = 'F'; break;
		  }
		
		//4. 결과 출력
		System.out.println("\n\n"+name + "님의 성적처리 ***********");
		System.out.print("kor : " + kor + "\t eng : " + eng + "\t com : " + com + "\ntot : " + tot );
		System.out.printf("\t avg : %.2f   grade: %c " , avg, grade);
		
		//----------------------------------------------------------
		if( avg >= 60 ) { // 3과목 평균 60점 이상이어야하고,..
			
			if( kor >= 40 && eng >= 40 && com >= 40) {
				System.out.printf("\n모든 과목이 40점 이상이며, 평균이 %.1f로 [합격]입니다\n", avg);
			} else {
				System.out.printf("\n평균이 %.1f 이지만, ", avg);
				if( kor < 40 ) System.out.print("\n국어" + kor + "점");
				if( eng < 40 ) System.out.print("\n영어" + eng + "점");
				if( com < 40 ) System.out.print("전산" + com + "점");
				System.out.print("으로 [과락탈락] 입니다.");
			}
			
		} else {
			System.out.printf("\n평균이 %.1f로 [평균 미달 탈락]입니다\n", avg);
		} // out if end
		//-------------------------------------------------------
		
	}
}
//*/

/*
문제] 이름 입력 받고, 국어,영어,전산 점수 입력 받아서 
	  총점, 평균, 학점까지 구하는 프로그램 작성
	  점수 (0~100) 점 사이값만 입력 받기
	  무한루프 이용해서 원하는 만큼 입력 받기
	  
	  이도연님의 성적표**************
	  국어 : 100, 영어 : 100, 전산 : 100
	  총점 : 300, 평균 : 100.0  학점 : A
*/


