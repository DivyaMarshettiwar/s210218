import java.io.ByteArrayInputStream;
import java.io.FileInputStream;

public class Demo6 {
public static void main(String[] args) {
	try {
		FileInputStream fs=new FileInputStream("myfile.txt");
		/*
		 * this will always search for the file.if the file is not found then 
		 * an exception is thrown
		 */
		
		/*to read char by char
		int a=fs.read();
		this function will read the file char by char and return unicode value
		System.out.println((char)a);
		*/
		
		/*
		 int a;		 
		while((a=fs.read())!=-1)//here -1 denotes the end of file 
		{
			System.out.print((char)a);
		}
		*/
		
		byte[] b=new byte[100];
		fs.read(b);
		ByteArrayInputStream bais=new ByteArrayInputStream(b);
		int a;
		while((a=bais.read())!=-1)
		{
			System.out.print((char)a);
		}
	}
		
	catch (Exception e) {
		// TODO: handle exception
	}
}
}
