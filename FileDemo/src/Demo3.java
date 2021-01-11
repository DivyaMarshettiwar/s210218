import java.io.BufferedOutputStream;

public class Demo3 {
public static void main(String[] args) {
	try
	{
	BufferedOutputStream bos=new BufferedOutputStream(System.out);
	String name="mythreye";
	bos.write(name.getBytes());
	bos.flush();
	}
	catch (Exception e) {
		System.out.println("error");
	}
}
}
