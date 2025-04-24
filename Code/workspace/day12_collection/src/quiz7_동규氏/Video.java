package quiz7_동규氏;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Video {
	static int videoCnt = 1;
	private int no;
	private String title;
	private String category;
	private boolean lend;
	private String lendName;
	private String lendDate;
	
	public Video(String title, String category, boolean lend, String lendName) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yy-MM-dd");
		this.title = title;
		this.category = category;
		this.lend = lend;
		this.lendName = lendName;
		this.no = videoCnt++;
		this.lendDate = dateFormat.format(new Date());
	}
	
	@Override
	public String toString() {
		return "비디오 [번호 = " + no + ", 제목 = " + title + ", 장르 = " + category + ", 대여상태 = " + lend + ", 대여자 = "
				+ lendName + ", 대여일자 = " + lendDate + "]";
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
	public String getLendDate() {
		return lendDate;
	}
	public void setLendDate(String lendDate) {
		this.lendDate = lendDate;
	}
}
