import java.util.function.Function;

class Ramuda {
	public static void main(String[] args) {

	//valueメソッド(従来)
	String str = String.valueOf(123);
	System.out.println(str);
	}

	//静的メソッド参照
	Function<Integer,String> fc2 = String::valueOf;
	String funcAns2 = fc2.apply(123);
	System.out.println(funcAns2);

	//ラムダ式
	Function<Integer,String> fc3 = inInt -> { return String.valueOf(inInt);};
	 String funcAns3 = fc3.apply(456);
	 System.out.println(funcAns3);
}