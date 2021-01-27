import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//copy file demo
public class Demo3 {
public static void main(String[] args) {
	Path sourcefile=Paths.get("C:\\Users\\mruser\\Desktop\\sample.txt");
	Path targetfile=Paths.get("d:\\sample.txt");
	try {
		Files.copy(sourcefile, targetfile);
		//this will replace the file if it exists
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
