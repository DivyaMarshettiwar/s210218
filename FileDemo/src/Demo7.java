import java.io.BufferedInputStream;
import java.io.FileInputStream;
public class Demo7 {
public static void main(String[] args) {
	BufferedInputStream bs=new BufferedInputStream(System.in);
	/*
	 * this stream is used to read data form console of a file
	 * the statement above shows us how to read from console.
	 * the statement below show how to read from file.
	 */
	try(BufferedInputStream bs1=new BufferedInputStream(new FileInputStream("myfile2.txt"));)
	{
		int a;
		while((a=bs1.read())!=-1)
		{
			System.out.print((char)a);
		}
	}
	catch (Exception e) {
		// TODO: handle exception
	}
}
}
