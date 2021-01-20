import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Demo6 {
public static void main(String[] args) {
	ArrayList<Employee> e=new ArrayList<Employee>();
	e.add(new Employee(12, "venkatesh", 2000));
	e.add(new Employee(45, "sai shankar", 4562));
	e.add(new Employee(452, "waseem", 56433));
	e.add(new Employee(21, "Hariharan", 1234));
	e.add(new Employee(211, "unnikrishnan", 46356));
	
	System.out.println("press 1 to sort by name,2 to sort by id,3 to sort by salary");
	int ch;
	Scanner s=new Scanner(System.in);
	ch=s.nextInt();
	if(ch==1)
	//sort the data by coding
	Collections.sort(e, new SortByName());
	else if(ch==2)
		Collections.sort(e, new SortById());
	else
		Collections.sort(e,new SortBySalary());
	System.out.println(e);
}
}
