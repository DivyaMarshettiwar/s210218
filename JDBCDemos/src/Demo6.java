import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
//sp with in parameters
public class Demo6 {
public static void main(String[] args) {
	Connection con;
	try
	{
		con=DriverManager.getConnection("jdbc:sqlserver://CHN-CMB-FLM4-R;databaseName=s210218;user=sa;password=P@ssw0rd");
		CallableStatement c =con.prepareCall("{call student_filter(?)}");
		c.setString(1, "c++");
		ResultSet rs=c.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));;
		}
	}
	catch (Exception e) {
	System.out.println(e.getMessage());
	}
}
}
