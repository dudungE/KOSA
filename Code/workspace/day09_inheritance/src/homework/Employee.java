package homework;

import java.util.Scanner;
//import java.lang.*;  // 

public class Employee { // extends Object {
	protected int empNO;
	protected String name, dept, phone;
	
	Scanner sc = new Scanner(System.in);
	
	public Employee() {  //
	/*	int num ;
		String name, dept, phone;
		System.out.print("empNO = ");			num = sc.nextInt();
		System.out.print("name = ");				name = sc.next();
		System.out.print("dept = ");				dept = sc.next();
		System.out.print("phone = ");				phone = sc.next();		
		this.empNO = num;
		this.name = name;
		this.dept = dept;
		this.phone = phone;*/
	}
	public void input(){   // 입력 메소드 
		int num ;
		String name, dept, phone;
		System.out.print("empNO = ");		  this.empNO= sc.nextInt();	 //num = sc.nextInt();
		System.out.print("name = ");				name = sc.next();
		System.out.print("dept = ");					dept = sc.next();
		System.out.print("phone = ");				phone = sc.next();		
		//this.empNO = num;
		this.name = name;
		this.dept = dept;
		this.phone = phone;
	}
	
	public Employee(int empNO, String name, String dept, String phone) {

		super();
		this.empNO = empNO;
		this.name = name;
		this.dept = dept;
		this.phone = phone;
	}
	public Employee(int empNO) {
		this(empNO, null, null, null);
	}

	public int getEmpNO() {
		return empNO;
	}

	public void setEmpNO(int empNO) {
		this.empNO = empNO;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	public void disp() {
		System.out.println("사원 번호 :" + empNO + "\n 이름 : " + name);
		System.out.println("부서 :" + dept + "\n 연락처 : " + phone);
	}
	
}
