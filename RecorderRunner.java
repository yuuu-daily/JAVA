
import java.util.HashMap;

public class RecorderRunner {
    public static void main(String[] args) {

        Recorder recorder = new Recorder();
        recorder.execute("key1","value1");//Recorder.javaのmapに["key1"=>"value1"]が登録され、"key1=value1"が表示される
        recorder.execute("key1",null);//"value1"が表示される
    }
}