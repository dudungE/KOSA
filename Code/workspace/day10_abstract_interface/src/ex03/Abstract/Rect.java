package ex03.Abstract;

public class Rect extends Shape {
	int y = 10;

	@Override
	public double calc(double x) {
		result = y * x;
		return result;
	}

	@Override
	public void show(String name) {
		calc(8.8);
		System.out.println(result +" 크기의 " + name + "이 그려졌습니다." );
	}

}
