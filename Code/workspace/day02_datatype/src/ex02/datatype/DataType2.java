//*
package ex02.datatype;

public class DataType2 {
	
	// 형변환
	public static void main(String[] args) {
		short sh = 3;  // -32,768 ~ 32,767
		int num = 50000;  // -21억 ~ 21억
		
		//작은 자료형이 큰자료형에...... 자동형변환(묵시적형변환) 된다.
		num = sh;   // int (4byte) = short (2byte)
		
		System.out.println(sh + " , " + num);
		
		//큰 자료형이 작은 자료형에 넣으려면 명시적형변환 해야한다.
		//데이터 손실 발생
		num = 123;
//		num = 32769; //
		sh = (short)num;    // short (2byte) = int (4byte) 
		System.out.println(sh + " , " + num);
	}
}
//*/

/*
package ex02.datatype;

public class DataType2 {
	
	// 모든 자료형은 자신의 범위(크기)를 안벗어난다.
	public static void main(String[] args) {
		short sh = 32767;  // -32,768 ~ 32,767
		int num = 50000;  // -21억 ~ 21억
		
		System.out.println(sh + " , " + num);
		
//		num = -32769;
		num = 32770;
		
		sh = (short)num; // 명시적 형변환
		System.out.println(sh + " , " + num);
		
	}
}
//*/


// 한줄주석
/*  여러줄 주석 */
