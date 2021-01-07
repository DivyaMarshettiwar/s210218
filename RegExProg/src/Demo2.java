import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) 
	{
		String password;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your password");
		password=scanner.next();
		while(!password.matches("[a-zA-Z0-9@[^.]]{8,16}"))
		{
			System.out.println("Entered password is wrong reenter the password");
			password=scanner.next();
		}
		System.out.println("Password accepted");
	}
}
/*
 * [def]---d/e/f [^def]---anything other than d/e/f [a-c[p-z]] [a-z&&[p-t]]
 * [a-z] any alphabet from a-z can come any number of times [a-z]{n} [a-z]{n,m}
 * 
 */
