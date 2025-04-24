package ex03.oop;

public class MainEntry {

	public static void main(String[] args) {
		TV  t = new TV();
		
		t.disp();
		System.out.println();
		System.out.println(t); // 
		
		System.out.println();
		TV t2 = new TV(9, "red");
		System.out.println(t2);
	}

}
