// public class Person {
// 	public void speak() {
// 	  System.out.println("Hello World!");
// 	}
// }

public class Person {
	private int gender = -1;

	public Person(int gender){
		this.gender = gender;
	}

	public void speak(){
		if (gender == 1){
			System.out.println("I'm a man.");	
		} else if (gender == 2){
			System.out.println("I'm a woman.");
		}
	}

	public static void main(String[] args) {
		Person man = new Person(1);
		man.speak();
	    Person woman = new Person(2);
	    woman.speak();
	}


	//コンストラクタ（引数なし）
	// public Person () {
	// 	person = "人";
	// 	System.out.println("人");
 //    }
	// //コンストラクタ（引数あり:男性・女性の標準出力）
	// public Person (String man) {
	// 	person = man;
	// }
	// public Person (String woman) {
	// 	person = woman;
	// }
}