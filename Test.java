// import java.text.SimpleDateFormat;
// import java.util.Date;

// public class Test {
// 	public static void main(String[] args) {

// 		// 現在日時を取得
// 		Date date1 = new Date();
// 		System.out.println(date1);
// 	}
// }

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test {
	public static void main(String[] args) {
		// 現在日時を取得
		Calendar cal1 = Calendar.getInstance();
        
		// Date型に変換
		Date date1 = cal1.getTime();
		System.out.println(date1);
        
		 // 表示形式を指定
		SimpleDateFormat sdformat
		= new SimpleDateFormat("HH:mm:ss SSS");
		String fdate1 = sdformat.format(date1);
		System.out.println(fdate1);
	}
}