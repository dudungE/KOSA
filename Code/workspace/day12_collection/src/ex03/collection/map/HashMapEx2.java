package ex03.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx2 {
	
	static HashMap  phoneBook  = new HashMap();
	
	public static void main(String[] args) {
		addPhoneNo("친구", "조민희", "010-111-2222");
		addPhoneNo("친구", "유훈종", "010-333-5555");
		addPhoneNo("친구", "이태원", "010-777-8888");
		addPhoneNo("회사", "이재용", "010-999-0000");
		addPhoneNo("회사", "이유상", "010-444-2323");
		addPhoneNo("회사", "조이든", "010-666-7878");
		addPhoneNo("회사", "박이든", "010-5656-7878");
		addPhoneNo("세탁",  "010-9898-1212");
		
		printList();
	} // main end
	
	// 그룹을 추가하는 메서드
	static void addGroup(String groupName) {
		
		if( !phoneBook.containsKey(groupName) ) {
			phoneBook.put(groupName, new HashMap());
		}
	}
	
	// 그룹에 전화번호를 추가하는 메서드
	public static void addPhoneNo(String groupName, String name, String tel) {
		
		addGroup(groupName);
		
		HashMap group = (HashMap)phoneBook.get(groupName);
		group.put(tel, name);  // 이름은 중복 될 수 있으니, 전화번호를 key로 저장한다.
	}
	
	public static void addPhoneNo(String name, String tel) {
		addPhoneNo("기타", name, tel);
	}

	// 전화번호부 전체를 출력하는 메소드
	public static void printList() {
		Set set = phoneBook.entrySet();   		//System.out.println(set);
		Iterator it = set.iterator();
		
		while( it.hasNext() ) {
			Map.Entry e = (Map.Entry)it.next();
			
			Set subSet = ((HashMap)e.getValue()).entrySet();
			Iterator  subIt = subSet.iterator();
			
			System.out.println(" * "+e.getKey() +"["+ subSet.size()+"]");
			
			while( subIt.hasNext() ) {
				Map.Entry subE = (Map.Entry)subIt.next();
				String telNo = (String)subE.getKey();
				String name = (String)subE.getValue();
				System.out.println(name + " " + telNo);
			} // in while end
			System.out.println();
		} // end out while
		
	} //end printList()	
}









