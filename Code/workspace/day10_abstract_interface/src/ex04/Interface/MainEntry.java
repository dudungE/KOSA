package ex04.Interface;

interface A {  // interface - abstaract method, final field 만 갖는다.
	int x = 90;
	final int y = 777;
	char ch = 'A';
	
	// 추상메소드 abstract 생략가능함 - 무조건 추상메소드임
	public void show();
	public abstract void disp();
//	public void view() {  } // error
} // A end

interface B {
	 void view();
} // B end

interface C {
	String name = "happy";
	public void draw();
} // C end

interface D extends B {
	void dview();
} // D end
/////////////////////////////////////////////////////////
class Rect implements D {

	@Override
	public void view() {  // B
	}
	@Override
	public void dview() {  // D
	}
	public int plus(int x, int y) {
		return x+y;
	}
} // Rect end
///////////////////////////////////////////
class Shape {
	
}  // Shape end

abstract class AA{
	
}

class Circle implements C {

	@Override
	public void draw() {
		//name = "yuna";
		System.out.println(name + " 님이네요.");
	}
} // Circle end

/////////////////////////////////////////////////
class Multi extends AA implements B, C, A {

	@Override
	public void show() {  // A
		System.out.println("show method call~~");
	}

	@Override
	public void disp() { // A
		System.out.println("disp method call~~");
	}

	@Override
	public void draw() {  // C
		System.out.println("draw method call~~");
	}

	@Override
	public void view() {  // B
		System.out.println("view method call~~");
	}
} // Multi end

public class MainEntry {
	public static void main(String[] args) {
		Multi m = new Multi();
		m.show();
		
		B b = new Multi();
		b.view();
		
//		A  a = new A(); // 
	}
}


/*
  > interface 
  - 클래스 아님.(객체 생성 안됨)
   - implements
   - 추상메소드, 상수만 가질 수 있다. ( abstract, final 생략 가능 )
   - 다중 상속 구현,....
 */















