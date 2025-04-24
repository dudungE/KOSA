package Quiz;

public class 산술연산문제 {
	
	// 연산자 /, % 이용해서 만원?, 천원? 백원? 십원? 
		public static void main(String[] args) {
			//1. 변수선언
			int pay = 567890;
			int man, chun, back, sip;   //몫 저장 변수
			int m_na, ch_na, b_na;   // 나머지 저장 변수
			
			//2. 메세지 출력 및 입력받기
			//3. 처리(계산)
			man = pay / 10000;			m_na = pay % 10000;
			chun = m_na / 1000;			ch_na = m_na % 1000;
			back = ch_na / 100;			b_na = ch_na % 100;
			sip = b_na / 10;
			
			//4. 결과출력(화면)
			System.out.println("\n\n만원 : "+ man
										  +"장\n천원 : " + chun
										  +"장\n백원 : " + back
										  +"개\n십원 : " + sip + "개");
			
			System.out.println("===========================");
			System.out.println("10000 : "+ (pay / 10000)
										+"장\n1000 : " + (pay % 10000) / 1000
										  +"장\n100 : " + (pay % 1000) / 100
										  +"개\n10 : " + (pay%100)/10 + "개");
			
			
//			System.out.println("만원 : " + pay / 10000 + "장");
//			System.out.println("천원 : " + (pay % 10000) / 1000 + "장");
//			System.out.println("백원 : " + (pay % 1000) / 100 + "개");
//			System.out.println("십원 : " + (pay%100)/10 + "개");
			
		}
}


/*
문제1] 월급을 단위로 계산하기
	int pay = 567890;
	
       result :
	만원 : 56장
	천원 : 7장
	백원 : 8개
	십원 : 9개 
*/