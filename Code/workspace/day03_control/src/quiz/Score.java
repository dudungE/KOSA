//*
package quiz;

public class Score {
	public static void main(String[] args) {
		// kor, eng, com , name --> tot, avg 구하는 프로그램 작성
		int kor = 90, eng = 88, com = 100,  tot;
		String name = "doyeon";
		double avg = 0;
		
		tot = kor + eng + com;
		avg = tot / 3. ;   //avg = (kor + eng + com) / 3. ;
		
		System.out.println(name + "님의 성적처리 ***********");
		System.out.print("kor : " + kor + "\t eng : " + eng + "\t com : " + com + "\ntot : " + tot );
		System.out.printf("\t avg : %.2f" , avg);
		
	}
}
//*/

/*
문제] 이름 입력 받고, 국어,영어,전산 점수 입력 받아서 
	  총점, 평균, 학점까지 구하는 프로그램 작성
	  
	  이도연님의 성적표**************
	  국어 : 100, 영어 : 100, 전산 : 100
	  총점 : 300, 평균 : 100.0, 평점(학점) : A
*/