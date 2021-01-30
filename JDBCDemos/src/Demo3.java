import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Demo3 {
	public static void main(String[] args) {
		Connection con;
		Statement stat;
		/*
		 * there are three types of statement that i can use to execute on a database.
		 * 
		 * 1)createStatement:This method is used to execute statements one by one on a datatbase
		 * for each and every value for the same statement 
		 * select * from person.address where city='dallass';
		 * it is better to use createStatement where there is no value to be passed
		 * 2)PreparedStatement():this is used when ever we want to pass values.
		 * the statement is prepared once for execution and for different values the values are just 
		 * replaced
		 * 3)CallableStatement-this is used to call the stored procedures found in sql server
		 * to call the store procedures we will use prepareCall() method of connection
		 */
		Scanner scanner=new Scanner(System.in);
		try {
			con=DriverManager.getConnection("jdbc:sqlserver://CHN-CMB-FLM4-R;"
					+ "databaseName=s210218;user=sa;password=P@ssw0rd");
			stat=con.createStatement();
			int id;
			String name;
			String course;
			System.out.println("Enter the id");
			id=scanner.nextInt();
			System.out.println("Enter the name");
			name=scanner.next();
			System.out.println("Enter the course");
			course=scanner.next();
			String query="insert into student values("+id+",'"+name+"','"+course+"')";
			stat=con.createStatement();
			int result=stat.executeUpdate(query);
			if(result>0)
				System.out.println("inserted");
			else
				System.out.println("not inserted");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
