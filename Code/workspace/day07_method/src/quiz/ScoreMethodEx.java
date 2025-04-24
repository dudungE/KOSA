package quiz;

import java.util.Scanner;

//문제] 성적처리 프로그램을 함수로 분리한다.
//입력함수 input() - 이름, 국어,영어,전산 점수
//출력함수 output()
//총점_평균 구하는 함수 total_avg(~~~~ )
//학점 구하는 함수 grade(~~~)
//메인함수 

public class ScoreMethodEx {
	
	static int kor=0, eng=0, com=0, sum=0;
    static double avg=0;
    static String name= "";
    static char grade = ' ';
    
    public static void output() {
    	
    	 System.out.println("이름 : "+name);
         System.out.println("국어점수 : "+kor);
         System.out.println("영어점수 : "+eng);
         System.out.println("전산점수 : "+com);
         
         System.out.printf("총점 : %d,  평균 : %.2f",sum, avg);
         System.out.println("학점 : "+grade);
    } // output end
    
    public static void main(String[] args) {
        input();
        process();
        grade();
        output();       
    } // main end
    
    public static void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("이름을 입력 하세요 : ");        name = sc.nextLine();
        System.out.println("국어점수 입력 : ");        		kor = sc.nextInt();
        System.out.println("영어점수 입력 : ");        		eng = sc.nextInt();
        System.out.println("전산점수 입력 : ");        		com = sc.nextInt();
    } // input  end
    
    public static void process() {
        sum = kor+eng+com;
        avg = sum/3.0;
    } // process  end
    
    public static void grade() {
        switch((int)avg/10){
	        case 10:
	        case 9:   grade = 'A';
	        case 8:   grade = 'B';
	        case 7:   grade = 'C';
	        case 6:   grade = 'D';
	        default :  grade = 'F';
        }
    } // grade  end
}

