package ex04.set;
import java.util.*;
class HashSetEx2 {
	public static void main(String[] args) 	{
		Object[] objArr = {"1",new Integer(1), "7", "3","3","4","2","2", "5", "4","4"};
		
		Set set = new LinkedHashSet();	// 
		
		for(int i=0; i < objArr.length; i++) {
			set.add(objArr[i]);
		}
		System.out.println(set);
	}
}