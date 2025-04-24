package quiz4_성호氏;

import java.time.LocalDate;

public class Video {
	private static int noCount = 1;
	private int no;
	private String title;
	private String category;
	private boolean lend;
	private String lendName;
	private LocalDate lendDate;
	
	public Video(String title, String category, String lendName) {
		this.no = noCount++;
		this.title = title;
		this.category = category;
		this.lend = false;
		this.lendName = lendName;
		this.lendDate = LocalDate.now();
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public boolean isLend() {
		return lend;
	}

	public void setLend(boolean lend) {
		this.lend = lend;
	}

	public String getLendName() {
		return lendName;
	}

	public void setLendName(String lendName) {
		this.lendName = lendName;
	}

	public LocalDate getLendDate() {
		return lendDate;
	}

	public void setLendDate(LocalDate lendDate) {
		this.lendDate = lendDate;
	}

	@Override
	public String toString() {
		return "Video [no=" + no + ", title=" + title + ", category=" + category + ", lend=" + lend + ", lendName="
				+ lendName + ", lendDate=" + lendDate + "]";
	}
}
