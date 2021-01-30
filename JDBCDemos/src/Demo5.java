import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class Demo5 {
public static void main(String[] args) {
	Connection con;
	try
	{
		con=DriverManager.getConnection("jdbc:sqlserver://CHN-CMB-FLM4-R;databaseName=s210218;user=sa;password=P@ssw0rd");
		CallableStatement c =con.prepareCall("exec student_data");\
		con.getMetaData();
		//this will return the information about the database
		
		ResultSet rs=c.executeQuery();
		ResultSetMetaData rm=rs.getMetaData();
		//this will return the information about a perticular table
		System.out.println(rm.getColumnName(1)+"\t"+rm.getColumnName(2)+"\t"+rm.getColumnName(3));
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));;
		}
	}
	catch (Exception e) {
		// TODO: handle exception
	}
}
}
