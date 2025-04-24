package ex06.multiImplements;

import ex03.Abstract.Shape;
import ex05.Interface.IDraw;

public class MultiClass extends Shape 
								 implements Test, IDraw {
	
	private int num;
	
	public void display() {
		System.out.println("MultiClass method!!");
	}

	@Override
	public void draw() {  // IDraw
		num = 888;
		System.out.println("IDraw interface!!" + num);
	}

	@Override
	public void testView() {  // Test
		System.out.println("Test interface!!");

	}

	@Override
	public double calc(double x) {  // Shape
		System.out.println("Shape abstract class!!");
		return 5.5;
	}

	@Override
	public void show(String name) {  // Shape
		System.out.println("Shape abstract class!!" + name);
	}
}
