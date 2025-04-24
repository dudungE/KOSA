package ex06.arrayMethod;

public class MainEntry {
	
	public static void main(String[] args) {
		int x = 3, y = 5;
		
		int result = methodEx(x, y);
		System.out.println(result);		line();
		
		int[]  arrResult = methodEx2();
//		for (int i = 0; i < arrResult.length; i++) {
//			System.out.print(arrResult[i] + "\t");
//		}
		
		for(int item : arrResult) System.out.print(item + "\t");
		System.out.println();
		
		//1차원 배열 함수 호출 결과값 누적된 합 출력하기
		
//-------------- 2차원 배열 함수 만들기 - 더한 결과 출력 -------------------------------
		int[][] resultArr = methodEx3();
		int sum = 0;
		
		for (int i = 0; i < resultArr.length; i++) { // row
			for (int j = 0; j < resultArr[i].length; j++) {
				sum += resultArr[i][j];
			} // j end
		} // i end
		
		System.out.println("sum = " + sum);
		System.out.println("-------------------------------------------");
		
		for(int[]  item :  resultArr ) {
			System.out.println(item);  // 데이터 들어 있는 주소 출력됨
			System.out.println(item.hashCode()); // 메모리상의 주소(16진수형태)를 10진수 형태 메모리 주소로 보여줌
			System.out.println("==================");
		}
		
		System.out.println("***** foreach 문으로 2차원 배열 데이터 출력하기 ************ ");
		
		int hap = 0;
		for(int[] item : resultArr ) {
			
			for(int arrItem : item ) {
				System.out.print( arrItem + "  " );
				hap += arrItem;
			}  // arrItem end
			
			System.out.println();
		} // item end
		
		System.out.println("hap = " + hap);
		
	}

	public static int[][] methodEx3() {
		 int[][] arr = { {1,2,3, 4}, {5,6,7,8} };
		 
		return arr;
	}

	public  static int[] methodEx2() {
		int[] arr = { 1,2,3,4,5,6,7,8 };
		
		return arr;
	}

	public static int methodEx(int x, int y) {
		return x + y;
	}
	
	public static void line() {
		System.out.println("+++++++++++++++++++++++");
	}
}
