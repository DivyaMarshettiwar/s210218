import java.io.FileWriter;

public class Demo5 {
public static void main(String[] args) {
	try(FileWriter f=new FileWriter("myfile4.txt",true))
	{
		String name="mythreye";
		f.write(name);
		
	}
	catch (Exception e) {
		// TODO: handle exception
	}
}
}
