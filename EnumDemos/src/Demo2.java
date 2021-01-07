
enum Account_Type
{
	SAVINGS(4),FD(5),RD(6),CURRENT(0);
	
	//the value given inside the brackets needs to be assigned to a variable.
	
	private int rate;
	//this variable will now hold the value assigned;
	//this variable is only for this class and not for any other classes
	
	private Account_Type(int rate) {
	this.rate=rate;
	}
	
	public void display()
	{
		System.out.println("message from enum"+rate);
	}
	
}
public class Demo2 
{
	public static void main(String[] args) {
		
		Account_Type a=Account_Type.CURRENT;
		System.out.println(a.ordinal());
		a.display();
		System.out.println(Account_Type.valueOf("FD"));
		
		
		for(Account_Type ab : Account_Type.values())
			System.out.println(ab);
		
	}
}
