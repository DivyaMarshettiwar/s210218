import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo1 {
	public static void main(String[] args) {
		try {
			Class.forName("org.h2.Driver");
			// this line is used for loading the driver and registering the driver
			// for SQL any Version this line is the same
			// Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			// ClassNotFoundException

			// Driver d=new com.microsoft.sqlserver.jdbc.SQLServerDriver();
			// DriverManager.registerDriver(d);
			// SQL Exception
			
			Connection connection = DriverManager.getConnection("jdbc:h2:~/MyDatabase","sa","india");
			Connection connection1 = DriverManager.getConnection("jdbc:h2:~/test","sa","");
			/*
			 * the get connection method takes a 3 parameters 
			 * 1)url:this is the url with
			 * which we can connect to the database. this url has a pattern it begins with
			 * jdbc:sqlserver jdbc:mysql jdbc:h2 jdbc:oracle now this will be followed by my
			 * database name
			 * it has three parts the first is tha java protocol(jdbc):the second is the
			 * database(sqlserver/oracle/h2/mysql):the three parameter is going to be the
			 * database name(when we give the database name we can give it will the ip address and
			 * the port number.
			 * 
			 *  in our case we all have stand alone database so we will use localhost
			 * 2) username:the name with which we will login into sql
			 * server(sa) 
			 * 3)Password:the password for sql server.
			 * 
			 * in case of sql server the getConnection method can take one parameter as the
			 * url it self will contain all information
			 */
			System.out.println(connection);
			System.out.println(connection1);
			Statement statement=connection.createStatement();
			ResultSet resultset=statement.executeQuery("select * from student");
			while(resultset.next())//this reads the data row by row when a row is found it will return true
			{
				System.out.println(resultset.getInt(1)+resultset.getString(2));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
