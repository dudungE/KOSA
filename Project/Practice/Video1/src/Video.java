/*
 	문제] Video class
     no  비디오번호
     title 비디오제목
     category  장르
     lend   대여여부
     lendName  대여자(고객명)
     lendDate   대여일자(오늘날짜 입력하심 되요)

     1. 비디오 번호, 제목 장르 CRUD
     2. 대여할시 대여여부, 대여자, 대여일자

     Video 추가 / 삭제 / Video 리스트 출력 / 수정 / 프로그램 종료  출력하는 프로그램 작성하기.
 */

import java.time.LocalDateTime;


public class Video {
    private int id;
    private static int count;
    private String title, category, lendName;
    private boolean lend;
    LocalDateTime lendDate;

    public Video (String title, String category) {
        this.id = count++;
        this.title = title;
        this.category = category;
    }

    public Video() {
        this.id = count++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Video.count = count;
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

    public String getLendName() {
        return lendName;
    }

    public void setLendName(String lendName) {
        this.lendName = lendName;
    }

    public boolean isLend() {
        return lend;
    }

    public void setLend(boolean lend) {
        this.lend = lend;
    }

    public LocalDateTime getLendDate() {
        return lendDate;
    }

    public void setLendDate(LocalDateTime lendDate) {
        this.lendDate = lendDate;
    }

    @Override
    public String toString() {
        return
                ">>title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", lendName='" + lendName + '\'' +
                ", lend=" + lend +
                ", lendDate=" + lendDate +"\n";
    }
}
