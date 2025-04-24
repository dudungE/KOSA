package ex01.Abstract;

abstract class Shape {  // abstract class, Super class
	double result = 0;
	
	public abstract double calc();  // abstract method
	public abstract void draw(); 
	
	public void show() {
		System.out.println("Super class Shape call~~");
	}
} // Shape end

class Circle  extends Shape {   // Sub class
	
	double r = 5.0;

	@Override
	public double calc() {
		result = r * r * Math.PI;
		return result;
	}

	@Override
	public void draw() {
		calc();
		System.out.println("원의 넓이 : " + result + " 인 원을 그렸습니다. ");
	}
} // Circle end

// Rect class ----> Shape 
class Rect extends Shape {
	int w=3, h =5;
	
	@Override
	public double calc() {
		result = w * h;
		return result;
	}
	@Override
	public void draw() {
		calc();
		System.out.println("사각형의 넓이 : "+result+" 인 사각형을 그렸습니다.");		
	}
} //Rect end

// Triangle class 구현하기 

public class MainEntry {
	public static void main(String[] args) {
		
		Circle  c = new Circle();
//		c.calc();
		c.draw();
		
		Rect r = new Rect();
		r.draw();
		
		Shape sh = new Circle(); 
		sh.draw();
		
		sh = new Rect();
		sh.draw();				
		
//		Shape sh = new Shape();  //자체적으로 객체 생성할 수 없다.
//		Shape sh = new Circle();  // 상속 받은 자손 클래스로는 객체 생성 할 수 있다.

	}
}


/*
  > abstract class (추상클래스)
   - abstract
   - 미완성클래스 <----- 자체적으로 객체 생성할 수 없다.
      (단, 상속 받은 자손 클래스로는 객체 생성 할 수 있다.)
     - 추상메소드를 갖고 있다.
       public void show() {    }  //일반메소드
     public abstract void show(); //추상메소드 - 몸체(블럭)를 갖지 않는다.

  형식>
   public abstact class Super { //부모추상클래스

		void disp() {   }
 		abstract void show(); //추상메소드
    }

    class Sub extends Super {  //자손(서브)클래스

		추상메소드 오버라이드해야한다.
    }
*/