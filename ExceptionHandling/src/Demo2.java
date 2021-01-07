import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo2 {
public static void main(String[] args) {
	int num;
	Scanner scanner=new Scanner(System.in);
	try
	{
	//all statements that are prone to error should be a part of try block;
		//avoid declaring variables inside the try
		//all statements other than variable declaration can come here
		System.out.println("Enter a number");
		num=scanner.nextInt();
		System.out.println(num/0);
	}
	catch(InputMismatchException e)//this is from util package because it is associated only with scanner
	{
		System.out.println(e.getMessage());
		System.out.println("input did not match the data type");
	}
	catch(ArithmeticException e)
	{
		System.out.println(e.getMessage());
	}
	catch (Exception e) {
		//here write those statements that tell the use what the error is
			System.out.println(e.getMessage());
	}
	finally
	{
	//will execute if error occurs it will also execute when there is no error
		//when ever we are using an external resource(sql server/file) closing of
		//file and server is important
		
		//they have to be close in both cases(error/no error)
		//so closing of resources will happen here
	}
}
}
