package ex06.multiImplements;

import ex03.Abstract.Shape;
import ex05.Interface.IDraw;

public class MainEntry {
	public static void main(String[] args) {
		// 1.자기자신~
		MultiClass mc = new MultiClass();
		mc.view();
		mc.testView();
		mc.draw();
		mc.display();
		System.out.println(mc.su);
		System.out.println("------------");

		// 2.부모로 객체 생성
		Shape s = new MultiClass();
		s.show("도형이야");
		s.view();

		System.out.println("------------");
		Test t = new MultiClass();
		t.testView();
		System.out.println(t.str);

		System.out.println("------------");
		IDraw d = new MultiClass();
		d.draw();
		System.out.println(d.su);
	}
}
