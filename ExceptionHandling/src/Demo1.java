
public class Demo1 {
public static void main(String[] args) {
	int a=10;
	int b=0;
	int c;
	try
	{
		//this is a block of code that the JVM will try to execute
		c=a/b;
		System.out.println(c);
		/*
		 * when a statement with a runtime error is executed by the jvm
		 * 	1)jvm will throw the error.
		 * 	2)it will now look for a block of code that could handle 
		 * 		the error thrown this block of code is our catch block
		 * 	3)if no catch block is found the the program throws an error.
		 */
		
	}
	catch(Exception e)
	{
		System.out.println("error");
	}
	}
}
