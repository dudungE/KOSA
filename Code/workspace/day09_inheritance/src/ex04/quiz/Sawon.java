package ex04.quiz;

public class Sawon {
	private int sawonNum;
	private String name;
	private String role;
	private String part;
	private int salary;
	private String phoneNum;

	public Sawon() {
		this(1234, "Honggildong", "Intern", "Programmer", 50000, "010-1234-1234");
	}

	public Sawon(int sawonNum, String name, int salary) {
		this.sawonNum = sawonNum;
		this.name = name;
		this.salary = salary;
	}

	public Sawon(int sawonNum, String name, String role, String part, int salary, String phoneNum) {
		this.sawonNum = sawonNum;
		this.name = name;
		this.role = role;
		this.part = part;
		this.salary = salary;
		this.phoneNum = phoneNum;
	}

	public void display() {
		System.out.println(this.sawonNum + "\n" + this.name + "\n" + this.role + "\n" + this.part + "\n" + this.salary
				+ "\n" + this.phoneNum + "\n");
	}

	public int getSawonNum() {
		return sawonNum;
	}

	public void setSawonNum(int sawonNum) {
		this.sawonNum = sawonNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getPart() {
		return part;
	}

	public void setPart(String part) {
		this.part = part;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
}
