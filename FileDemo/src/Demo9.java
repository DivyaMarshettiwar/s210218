import java.io.FileReader;

public class Demo9 {
	public static void main(String[] args) {
		try(FileReader fr=new FileReader("myfile.txt");){
			char[] a=new char[100];
		fr.read(a);
		System.out.println(a);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
