package quiz5_현진氏;

public class Video {
	// 변수
	private int no;
	private String title, category, lendName, lendDate;
	private boolean lend;
	
	// 생성자
	public Video() {}
	public Video(int no, String title, String category, String lendName, String lendDate, boolean lend) {
		this.no = no;
		this.title = title;
		this.category = category;
		this.lendName = lendName;
		this.lendDate = lendDate;
		this.lend = lend;
	}
	
	// Getter/Setter
	public int getNo() {return no;}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {return title;}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {return category;}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getLendName() {return lendName;}
	public void setLendName(String lendName) {
		this.lendName = lendName;
	}
	public String getLendDate() {return lendDate;}
	public void setLendDate(String lendDate) {
		this.lendDate = lendDate;
	}
	public boolean isLend() {return lend;}
	public void setLend(boolean lend) {
		this.lend = lend;
	}
	
	@Override
	public String toString() {
		return String.format("%-4d %-15s %-10s %-10s %-12s %-5s",
	            no,
	            title,
	            category,
	            (lendName.isEmpty() ? "-" : lendName),
	            (lendDate.isEmpty() ? "-" : lendDate),
	            lend ? "대여중" : "보유중");
	}
	
}