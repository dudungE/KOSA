package ex03.oop;

public class TV {
	int channer;  //멤버변수
	String color; 
	
	public TV(int c) {  //매개변수 1개 생성자함수
		channer = c;
	}
	
	public TV(String c) { //매개변수 1개 생성자함수
		color = c;
	}
	
	public TV(int c, String co) { //매개변수 2개 생성자함수
		channer = c;
		color = co;
	}
	
	public TV() {  // 디폴트 생성자함수 
		channer = 17;
		color = "green";
	}
	
	public int getChanner() {
		return channer;
	}

	public void setChanner(int channer) {
		this.channer = channer;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void disp() {
		System.out.println(channer + ", " + color);
	}
	
	public String toString() {
//		String str = channer + ", " + color;
//		return str;
		return channer + ", " + color;
	}
}
