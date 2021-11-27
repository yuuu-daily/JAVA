// class FizzBuzz {
// 	public static void main(String[] args) {
// 		// 条件式
// 		for (int i = 1 ; i <= 30; i++) {
// 			if (i%3==0 && i%5==0) {
// 				System.out.println("Fizz Buzz");	
// 			} else if (i%3==0) {
// 				System.out.println("Fizz");
// 			} else if (i%5==0) {
// 				System.out.println("Buzz");
// 			} else {
// 				System.out.println(i);
// 			}	
// 		}
// 	}
// }
public class FizzBuzz {
  public static void main(String[] args) {
    if (args.length == 0) {
        return;
    }
    int max = Integer.parseInt(args[0]);
    String result = null;
    for (int i = 0; i < max; i++) {
        int num = i + 1;
        result = "";
        if (num % 3 == 0) {
            result = result + "Fizz";
        }
        if (num % 5 == 0) {
            result = result + "Buzz";
        }
        if (result.length() == 0) {
            result = result + num;
        }
        System.out.print(result + " ");
    }
  }
}