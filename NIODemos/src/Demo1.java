import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Demo1 {
public static void main(String[] args) {
	File f=new File("D:\\sample questions for java\\java testmoz links1.txt");
	//here the exact file is in your hand
	Path p=Paths.get("D:\\sample questions for java\\java testmoz links1.txt");
	//here the path is alone available to do any operation u need to use the Files class
	//adv 2: here the method of the Files class is going to throw exception.
	//it is throwing a checked exception so that there is no chance of an error at runtime
	System.out.println(p.getParent());
	System.out.println(p.getFileName());
	System.out.println(p.getRoot());
	System.out.println(p.getNameCount());
	System.out.println(p.getName(1));
}
}
