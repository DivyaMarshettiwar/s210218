import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//demo for moving a file
public class Demo4 {
public static void main(String[] args) {
	Path sourcefile=Paths.get("C:\\Users\\mruser\\Desktop\\pooja.pdf");
	Path targetfile=Paths.get("d:\\pooja.pdf");
	try {
		if(Files.exists(sourcefile))
		{
			Files.move(sourcefile, targetfile);
		}
		else
		{
			System.out.println("no such file");			
		}
		//this will replace the file if it exists
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
