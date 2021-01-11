import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Demo1 {
public static void main(String[] args) {
	String emailid;
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the Emailid");
	emailid=scanner.nextLine();
	FileOutputStream fos=null;
	try	{
	fos=new FileOutputStream("myfile.txt",true);
	/*
	 * this class refers to the file in which you want to
	 * write data 
	 * this constructor takes 2 parameters
	 * 1)Filename:this is given in string format
	 * i have not given file location so it will take the base package as
	 * it location.
	 * 
	 * the above line will throw us an error because the file may exists
	 * may not exists.The folder that you are trying to access u may have 
	 * rights to access or you may not.
	 * 
	 * this error is prompted at compile time,this is called as my
	 * checked exceptions
	 * This line will throw FileNotFouondException--java.io
	 * 
	 * The file output stream will search for the file if the file is not found
	 * then a new file is created,in case the file is found then depending upon
	 * the second parameter either the content appended or the content is deleted
	 * and rewritten
	 * 
	 * 2) boolean parameter that tell us if we could append data if the
	 * file exists.
	 * if this parameter is set to true then it will check for the existence
	 * of file.if the file exists it will open the file go the end of file 
	 * and add the new content over there
	 */
	
	fos.write(emailid.getBytes());
	//the write method is used to write the content into the file.
	//the writing over here happens in the for of bytes
	/*
	 * the line number 30 will throw an exception stating if we have 
	 * the rights to write inside the file or not
	 * this line will throw IOException
	 */
	}
	catch(FileNotFoundException e)
	{
		System.out.println("Unable to reach the file");
	}
	catch(IOException e)
	{
		System.out.println("cannot perform the operation");
	}
	finally {
		try {
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}
