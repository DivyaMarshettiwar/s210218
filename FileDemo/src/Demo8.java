import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Demo8 {
public static void main(String[] args) {
	try {
	BufferedReader br;
//	br=new BufferedReader(new InputStreamReader(System.in));
//	int num;
//	num=Integer.parseInt(br.readLine());
	br=new BufferedReader(new FileReader("myfile.txt"));
	String s;
	s=br.readLine();
	System.out.println(s);
	}
	catch (Exception e) {
		System.out.println("error");
	}
	

}
}
