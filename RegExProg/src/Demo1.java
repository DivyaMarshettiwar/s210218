import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo1 {
	public static void main(String[] args) {
		String mob_no;
		System.out.println("Enter the mobile number");
		Scanner scanner=new Scanner(System.in);
		mob_no=scanner.next();
		System.out.println("The mobile number is"+mob_no);
//		Pattern mobilepattern=Pattern.compile("[0-9]{10}");
//		Matcher matchmob_no=mobilepattern.matcher(mob_no);
//		if(matchmob_no.matches())
//			System.out.println("the user has enter his mobile no");
//		else
//			System.out.println("the user has not entered mobile no");

//	System.out.println(Pattern.matches("[9876][0-9]{9}", mob_no));
	
	while(!mob_no.matches("[9876][0-9]{9}"))
	{
		System.err.println("incoorect mobile number pls enter again");
		mob_no=scanner.next();
	}
	}
}
