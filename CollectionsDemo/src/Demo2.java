import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

/*
 * this time my collection is collection of user defined data type
 */
class Student {
	int id;
	int marks;

	public Student(int id, int marks) {
		this.id = id;
		this.marks = marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", marks=" + marks + "]";
	}

}

public class Demo2 {
	public static void main(String[] args) {
		ArrayList<Student> stdlist = new ArrayList();
		stdlist.add(new Student(1, 100));
		stdlist.add(new Student(2, 67));
		stdlist.add(new Student(3, 30));
		stdlist.add(new Student(4, 60));
		stdlist.add(new Student(5, 50));
		stdlist.add(new Student(6, 34));

		// how will i display this list

		// type 1:
		System.out.println(stdlist);
		// this type will work only for predefined data type
		// why all predefined wrapper class data type overrides a method called toString
		// this method comes from object class so if the user defined datatype also
		// overrides
		// the toString method then way 1 is possible

		// type 2: using for each

		for (Student s1 : stdlist) {
			System.out.println(s1);
			if (s1.id == 3) {
				stdlist.remove(s1);
			}
			// this line is also possible only if toString method is overriden
		}
		Iterator<Student> studiterator = stdlist.listIterator();
		// this will start from 0 and go till end
		while (studiterator.hasNext()) {
			Student s2 = studiterator.next();
			if (s2.id == 3)
				studiterator.remove();
		}
	}
}