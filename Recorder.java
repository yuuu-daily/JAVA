// import java.util.HashMap;
// import java.util.Map;

// public class Recorder {
//     private HashMap<String, String> map = new HashMap<> ();

//     //インスタンスメソッドの定義
//     public void execute(String key, String value) {

//         if (key == null && value == null) {
//             this.map.clear();
//             System.out.println("Empty");
//         } else if (key != null && value == null) {
//             this.map.get(key);
//         } else if (key != null && value.equals("Delete")) {
//             Object removed == this.map.remove(key);
//             // Object removed == this.map.remove(key);
//             if (removed == null) {
//                 throw new IllegalArgumentException();
//             } else {
//                 System.out.println(key + " deleted" );
//             }
//         } else {
//             this.map.put(key, value);
//             System.out.println(key + "=" + value);
//         }
//     }
// }
        //キーと値が指定されたとき
        //if (map.containsKey("key1") && map.containsValue("value1")) {
        //キーと値のペアを登録
        //map.put("key1", "value1");
        //System.out.println(map);
import java.util.HashMap;
import java.util.Map;

public class Recorder {
  private Map<String, String> map = new HashMap<>();

    public void execute(String key, String value) {
        if (key == null && value == null) {
            this.map.clear();
            System.out.println("Empty");
        } else if (key != null && value == null) {
            this.map.get(key);
        } else if (key != null && value.equals("Delete")) {
            Object removed = this.map.remove(key);
            if (removed == null) {
                throw new IllegalArgumentException();
            } else {
                System.out.println(key + " deleted");
            }
        } else {
            this.map.put(key, value);
            System.out.println(key + "=" + value);
        }
    }
}

