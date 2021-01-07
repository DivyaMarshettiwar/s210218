import java.util.InputMismatchException;
import java.util.Scanner;

public class Employee {
	int id;
	String name;
	String emailid;

	void getdata() {
		Scanner s=new Scanner(System.in);
		try
		{
			System.out.println("Enter the id");
			id=s.nextInt();
			System.out.println("Enter the name");
			name=s.next();
			System.out.println("Enter the emailid");
			emailid=s.next();
		}
		catch (InputMismatchException e) {
			System.err.println("wrong input");
			throw e;
		}
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", emailid=" + emailid + "]";
	}

}
