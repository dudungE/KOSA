package ex02.oop;

public class Person {
	private String name, phone;  //멤버변수
	private int age;
	
	//멤버함수
	public String getName() {
		return name;
	}
	public void setName(String irum) {
		name = irum;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	// 출력함수
	public void disp() {
		System.out.println("name = " + name);
		System.out.println("age = " + age);
		System.out.println("phone = " + getPhone());
	}
}







