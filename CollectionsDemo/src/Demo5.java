import java.util.Comparator;
import java.util.TreeSet;

/*
 * i want to create a collection of students
 * 
 * to rearrange user defined data there are two interfaces available
 * 1)Comparable
 * this interface has a method called comareTo which will help us in comparing data
 */
class StudentData implements Comparable<StudentData>
{
	int id;
	String name;
	public StudentData(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "StudentData [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int compareTo(StudentData o) {
//	if(this.id>o.id)
//		return 1;
//	else if(this.id<o.id)
//		return -1;
//	else 
//		return 0;
		
		if(this.name.compareTo(o.name)>0)
			return 1;
		else if(this.name.compareTo(o.name)<0)
			return -1;
		else 
			return 0;
	}	
	
}
public class Demo5 {
	public static void main(String[] args) {
		TreeSet<StudentData> stud=new TreeSet();
		stud.add(new StudentData(145, "aim"));
		stud.add(new StudentData(5435, "ant"));
		stud.add(new StudentData(45, "act"));
		stud.add(new StudentData(454, "air"));
		System.out.println(stud);
	}
}
