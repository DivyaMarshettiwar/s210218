import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
public class Demo2 {
public static void main(String[] args) {
/*
 * the following way of writing a program is called as try with resources.
 * these resources that are used along with try must implement AutoCloseable 
 */
	/*
	 * BufferedOutputStream has the capability to 
	 * write inside a file or a console
	 * 1)if you want to write inside a console the the 
	 * parameter must be System.out
	 * 2)if you want to write inside a file then use FileOutputStream
	 */
	try
	{
		BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("myfile2.txt",true));
		String name="Nitin";
		bos.write(name.getBytes());//will write the data only to the bufferd output stream;
		bos.flush();//this sends the data from the bos object to the underlying file
		//if the same program is done with the help of try with resources then the flush method is also
		//called automatically
	}
	catch (Exception e) {
		System.out.println("error");
	}
	
}
}
