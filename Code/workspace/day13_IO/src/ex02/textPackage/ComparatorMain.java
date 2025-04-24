package ex02.textPackage;

import java.util.TreeSet;

public class ComparatorMain {
	public static void main(String[] args) {
		
		TreeSet set1 = new TreeSet(); //오름차순 정렬해줌
		TreeSet set2 = new TreeSet(new UserDesending()); //사용자가 만든 내림차순 클래스 객체 전달
		
		int[] score = { 98, 88, 52, 100, 95, 100, 70, 55, 60, 70 };
		
		for (int i = 0; i < score.length; i++) {
			set1.add(score[i]);
			set2.add(score[i]);
			
		}
		
		System.out.println(set1);
		System.out.println(set2);
	
	}
}
