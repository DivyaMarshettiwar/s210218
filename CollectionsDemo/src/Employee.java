import java.util.Comparator;

class Employee
{
	int id;
	String name;
	int sal;
	public Employee(int id, String name, int sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
}
class SortById implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.id>o2.id)
			return 1;
		else 
			return -1;
	}
	
}
class SortByName implements Comparator<Employee>
{
	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.name.compareTo(o2.name)>0)
			return 1;
		else 
			return -1;
	}
}
class SortBySalary implements Comparator<Employee>
{
	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.sal>o2.sal)
			return 1;
		else
			return -1;
	}
}