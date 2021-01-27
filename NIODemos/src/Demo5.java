import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

class FileSearch implements FileVisitor<Path>
{

	@Override
	public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
		System.out.println("Just Visited:"+dir);
		return FileVisitResult.CONTINUE;
	}

	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
		System.out.println("File that is read now"+file);
		return FileVisitResult.CONTINUE;
	}

	@Override
	public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
		System.out.println("File that is not able to be visited"+file);
		return FileVisitResult.CONTINUE;
	}

	@Override
	public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
		System.out.println("File that is completed now"+dir);
		return FileVisitResult.CONTINUE;
	}
	
}
public class Demo5 {
public static void main(String[] args) {
	Path p=Paths.get("D:\\sample questions for java");
	FileSearch f=new FileSearch();
	try {
		Files.walkFileTree(p, f);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
