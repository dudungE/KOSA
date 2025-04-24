package ex04.quiz;

public class MainEntry {
	public static void main(String[] args) {
		Sawon s1 = new Sawon();
		s1.display();

		Sawon s2 = new Sawon(4321, "Kim Jieun", 10000000);
		s2.display();

		Sawon s3 = new Sawon(9876, "Kang Dongwon", "Team Leader", "Programming", 200000, "010-9876-5432");
		s3.display();
	}
}
