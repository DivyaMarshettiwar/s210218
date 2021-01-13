class Login//to get data  pojo class
{
	String username;
	String password;
	public Login(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	class ValidateDetails//for my bl
	{
		void verify()
		{
			if(username.equals("mythreye")&&password.equals("niit"))
				System.out.println("this is from validateDetails classs");
		}
	}

}
public class Demo1 {
public static void main(String[] args) {
	Login gmaillogin=new Login("u","p");
	Login.ValidateDetails verification=gmaillogin.new ValidateDetails();
	verification.verify();
			
	}
}
/*
	every object of the outer class has a separate object of inner class
	this method may not be suitable for web application(flipkart)
	
	this is suitable only for stand alone application
	in a supermarket i will have 10 machines each machine will have separate
	Installation 
*/