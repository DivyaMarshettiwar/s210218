import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Demo2 {
public static void main(String[] args) {
	Connection con;
	Statement stat;
	try
	{
		Class.forName("org.h2.Driver");
		con=DriverManager.getConnection("jdbc:h2:~/MyDatabase","sa","india");
		stat=con.createStatement();
		/*
		 * 1) if the statement is a select statement(DQL) then we will have to call the executeQuery()
		 * 		the executeQuery() will return tables(ReusltSet)
		 * 2) if the statement is a insert/update/delete(DML) then we will call the executeUpdate()
		 * 		the executeUpdate() will return an integer telling the number of rows affected.
		 * 3) if the statement is a DDL/DQL(creating a table/modifying/dropping) we will use execute()
		 * 		this method returns boolean value(DDL)
		 * 		this method will return ResultSet if the query is DQL
		 */
	stat.execute("create table faculty(id int,name varchar(100))");
	}
	catch (Exception e) {
		System.err.println(e.getMessage());
	}
}
}
