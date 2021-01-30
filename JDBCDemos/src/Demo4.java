import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Demo4 {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	Connection con;
	PreparedStatement stat;
	//this is used for all DML operation or parameterized select query.
	try {
		con=DriverManager.getConnection("jdbc:sqlserver://CHN-CMB-FLM4-R;"
				+ "databaseName=s210218;user=sa;password=P@ssw0rd");
		stat=con.prepareStatement("insert into student values(?,?,?)");
		int id;
		String name;
		String course;
		System.out.println("Enter the id");
		id=scanner.nextInt();
		System.out.println("Enter the name");
		name=scanner.next();
		System.out.println("Enter the course");
		course=scanner.next();
		stat.setInt(1, id);
		stat.setString(2, name);
		stat.setString(3, course);
		int result=stat.executeUpdate();
		if(result>0)
			System.out.println("inserted");
		else
			System.out.println("not inserted");
	} catch (Exception e) {
		System.err.println(e.getMessage());
	}
}
}
