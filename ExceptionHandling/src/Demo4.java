import java.util.Scanner;

public class Demo4 {
	public static void main(String[] args) {
		int age;
		Scanner scanner = new Scanner(System.in);
		try {
			age = scanner.nextInt();
			if (age < 1 || age > 100) {
				throw (new Exception("Age value cannot be below 1 and above 100"));
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("throw keyword demo");
		}
	}
}
/*
 * the throw keyword is used to raise exception(user defined). the throw keyword
 * can also be used to re-throw an exception caught by the catch block
 */
