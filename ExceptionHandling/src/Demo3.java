public class Demo3 {

	void add(int a,int b)
	{
		System.out.println(a+b);
	}
	void divide(int a,int b) throws ArithmeticException
	{
			System.out.println(a/b);		
	}
	public static void main(String[] args) {
		Demo3 d=new Demo3();
		try
		{
			d.add(10, 20);
			d.add(23, -10);
			d.divide(34, 0);
			d.add(34, 44);
		}
		catch (Exception e) {
			System.out.println("Error message from main");
		}
		finally {
			System.out.println("Programe executed");
		}
	}
}
/*
if the method of a class don't have a try catch block to handle errors
then the main will handle them because of which the reaming lines will not get executed

in case the method has a try catch block then the error is handeled by the method
and the main will execute all statements

1) try
2)catch
3)finally
4)throws:this is used near method declaration to inform the error thrown by the
method this will help my co-developer to understand the error thrown by that method 
*/