
public class Demo6 {
public static void main(String[] args) {
	Employee e=new Employee();
	try
	{
		e.getdata();
		System.out.println(e);
	}
	catch (Exception e1) {
		System.out.println("error in main");
	}
}
}
