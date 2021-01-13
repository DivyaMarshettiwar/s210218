class MyLogin
{
	String username;
	String password;
	public MyLogin(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	void validate()
	{
		class ValidateData
		{
			void check()
			{
				if(username.equals("mythreye")&&password.equals("niit"))
				{
					System.out.println("Login");					
				}
			}
		}
		ValidateData v=new ValidateData();
		v.check();	
	}
}
public class Demo3 {
public static void main(String[] args) {
	MyLogin l=new MyLogin(null, null);
	l.validate();
}
}
