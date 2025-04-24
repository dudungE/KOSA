import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Scanner;

public class VideoManage {

    HashMap<Integer, Video> hm = new HashMap<>();
    Scanner sc = new Scanner(System.in);
    Video v;


    public  void init() {
        Video v = new Video("gg", "bb");
        hm.put(v.getId(), v);
        Video v2 = new Video("gg", "bb");
        hm.put(v2.getId(), v2);
//        Video v3 = new Video("gg", "bb");
//        hm.put(v3.getId(), v3);

    }
    // 메서드 이름 camelcase로
    public void Create(String title, String cat) {
        v = new Video(title, cat);
        hm.put(v.getId(), v);

    }

    public void Read() {
        if (hm.size() == 0) {
            System.out.println("내용 없습니다");
            return;
            }
        System.out.println(hm);

    }

    public void Update() {
        System.out.println("삭제할 id 입력");
        int idx = sc.nextInt();
        Video v = new Video();
        v = hm.get(idx);
        System.out.println("title");
        v.setTitle(sc.next());
        System.out.println("category");
        v.setCategory(sc.next());

    }
    public void Delete() {
        System.out.println("삭제할 id 입력");
        int idx = sc.nextInt();
//        Video v; // 참조변수만 선언
        v = hm.remove(idx); //
    }

    public void lend() {

        try {
            LocalDateTime now = LocalDateTime.now();
            System.out.println("빌릴 비디오 id입력");
            // nullpointexception 처리하기
            v = hm.get(sc.nextInt());
            System.out.println(v);
            System.out.println("이름입력: ");
            v.setLendName(sc.next());
            v.setLendDate(now);
            v.setLend(true);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("없는 id입니다 ");
        }

    }

}
