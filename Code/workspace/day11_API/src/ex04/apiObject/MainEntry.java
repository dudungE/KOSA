package ex04.apiObject;

class Point {   }

public class MainEntry {
	public static void main(String[] args) {
		Point pt = new Point();  //객체생성, 메모리에 할당, 생성자함수 자동호출
		System.out.println("Point  pt  information");
		System.out.println("class name : " + pt.getClass());
		System.out.println("hash code : " + pt);  // 63961c42
		System.out.println("hash code : " + pt.hashCode());  //1670782018
		System.out.println("Object String : " + pt);
		System.out.println("Object String : " + pt.toString());
		System.out.printf("10진수  주소 %d\n", 0x63961c42);
		
		System.out.println("===========================");
		Point pt2 = new Point();
		System.out.println("Point  pt2  information");
		System.out.println("class name : " + pt2.getClass());
		System.out.println("hash code : " + pt2.hashCode());  //495053715
		System.out.println("Object String : " + pt2);
		System.out.println("Object String : " + pt2.toString());
		System.out.println("##################################");
		
		System.out.println("pt2.toString() : toString()의 의미 ");
		System.out.println(pt2.getClass().getName()+'@'+pt2.hashCode());
		System.out.println(pt2.getClass().getName()+'@'+Integer.toHexString(pt2.hashCode()));
		
		Point pt3 = new Point();
		
		if( pt.hashCode() == pt3.hashCode() ) {
			System.out.println("same");
		} else {
			System.out.println("not same");
		}
		
		Point pt4;
		pt4 = pt;
		
		if( pt.hashCode() == pt4.hashCode() ) {
			System.out.println("same");
		} else {
			System.out.println("not same");
		}
		
	}
}








