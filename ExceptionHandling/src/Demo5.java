//re-throwing of exception demo
public class Demo5 
{
	void div(int a,int b)
	{
		try
		{
			System.out.println(a/b);
		}
		catch (Exception e) {
			throw e;
		}
	}
	public static void main(String[] args) {
		Demo5 d=new Demo5();
		try
		{
			d.div(12, 0);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
