/*
 * Write  a program for Managing Employee wages
 * there are 2 types of Employee
 * 1)Monthly wages
 * 2)Daily Wages
 * both these employees have id,name,dept
 * Monthly wages Employee have hra,da,basic
 * Daily wages Employee have no of days,sal per day.
 * 
 * Write a Program to calculate salary accordingly
 */

/*
 * things to identity
 * 1) is this just abstact calss/interface
 */

abstract class Employee
{
	int empid;
	String empname;
	String empdept;
	protected Employee(int empid, String empname, String empdept) {
		this.empid = empid;
		this.empname = empname;
		this.empdept = empdept;
	}
	abstract void calcSalary();
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empdept=" + empdept + "]";
	}
}
class DailyWagesEmployee extends Employee
{
	int noofdays;
	int salperday;
	
	public DailyWagesEmployee(int empid, String empname, String empdept, int noofdays, int salperday) {
		super(empid, empname, empdept);
		this.noofdays = noofdays;
		this.salperday = salperday;
	}

	@Override
	//the above statement is a comment but this time this comment is to my compiler
	//this is used to make my compiler understand that this method comes from my parent
	//this is called annotation
	public String toString() {
		return "DailyWagesEmployee [noofdays=" + noofdays + ", salperday=" + salperday + ", empid=" + empid
				+ ", empname=" + empname + ", empdept=" + empdept + "]";
	}

	@Override
	void calcSalary() {
		System.out.println("Salary calculation");
	}
}
public class Demo1 {
public static void main(String[] args) {
	DailyWagesEmployee raj=new DailyWagesEmployee(0, null, null, 0, 0);
	System.out.println(raj);
}
}
