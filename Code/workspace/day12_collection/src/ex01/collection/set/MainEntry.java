package ex01.collection.set;

import java.util.HashSet;
import java.util.Iterator;

// Set : 순서없고, 중복허용하지 않음
public class MainEntry {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>(); // 
		hs.add("키보드");
		hs.add("마우스");
		hs.add("컵");
		hs.add("볼펜");
		hs.add("키보드");
		
		System.out.println("요소 개수 : "+ hs.size());  // 중복허용 
		System.out.println(hs); // 순서 X
		
		HashSet<Integer> hs2 = new HashSet<>();
		hs2.add(100);
		hs2.add(3);
		hs2.add(1000);
//		hs2.add("string");
		System.out.println(hs2);
		
		HashSet hs3 = new HashSet<>();
		hs3.add(12.34);
		hs3.add(300);
		hs3.add("string");
		System.out.println(hs3);
	
		Iterator  it = hs3.iterator();
		while( it.hasNext() ) {  // 다음 요소가 있다면,...
			System.out.println(it.next());  // 요소를 꺼내와서 출력함
		}
		System.out.println();
		it = hs.iterator();
		while( it.hasNext() ) {  // 다음 요소가 있다면,...
			System.out.println(it.next());  // 요소를 꺼내와서 출력함
		}
		
	}
}









