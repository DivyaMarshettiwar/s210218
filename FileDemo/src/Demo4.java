import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Demo4 {
public static void main(String[] args) {
	try(BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("myfile3.txt",true)));)
	{
		String name="Mythreye";
		bw.write(name);
		bw.flush();
	}
	catch (Exception e) {
		// TODO: handle exception
	}
}

}
