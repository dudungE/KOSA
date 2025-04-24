package quiz_성호氏;

public class Human {  // model
	private String name;
	private String gender;
	private double height;
	private double weight;
	private double bmi;
	
	public Human() {
		// TODO Auto-generated constructor stub
	}
	
	public Human(String name, String gender, double height, double weight) {
		this.name = name;
		this.gender = gender;
		this.height = height;
		this.weight = weight;
		this.bmi = 0;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public double getBmi() {
		return bmi;
	}
	
	public void setBmi(double bmi) {
		this.bmi = bmi;
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", gender=" + gender + ", height=" + height + ", weight=" + weight + ", bmi="
				+ bmi + "]";
	}
}
