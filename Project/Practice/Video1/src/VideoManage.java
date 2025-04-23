import java.util.HashMap;
import java.util.Scanner;

public class VideoManage {

    HashMap<Integer, Video> hm = new HashMap<>();
    Scanner sc = new Scanner(System.in);
//    Video v = new Video();

    public  void init() {
        Video v = new Video("gg", "bb");
        hm.put(v.getId(), v);
        Video v2 = new Video("gg", "bb");
        hm.put(v2.getId(), v2);
        Video v3 = new Video("gg", "bb");
        hm.put(v3.getId(), v3);

    }
    public void Create(String title, String cat) {
        Video video = new Video(title, cat);
        hm.put(video.getId(), video);



    }
    public void Read() {
        System.out.println(hm);


    }
    public void Update() {

    }
    public void Delete() {

    }

}
