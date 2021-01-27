import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.HashSet;
import java.util.Set;

//creating a file with read /write privilages
public class Demo2 {
public static void main(String[] args) {
	Path p=Paths.get("D:\\sample questions for java\\myfile1.txt");
	Path p1=Paths.get("D:\\sample questions for java\\output folder");
	try {
		Files.createFile(p);
		Files.createDirectories(p1);
		//if i want to create a file with read permission only
		/*
		Set<PosixFilePermission> perms=PosixFilePermissions.fromString("rw-rw-rw");
		FileAttribute<Set<PosixFilePermission>> att=PosixFilePermissions.asFileAttribute(perms);
		Files.createFile(p, att);
		//the above code works with unix
	 */
	/*	Set<PosixFilePermission> per=new HashSet<PosixFilePermission>();
		per.add(PosixFilePermission.OTHERS_READ);
		per.add(PosixFilePermission.OWNER_READ);
		FileAttribute<Set<PosixFilePermission>> att=PosixFilePermissions.asFileAttribute(per);
		Files.createFile(p, att);
		*/
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
