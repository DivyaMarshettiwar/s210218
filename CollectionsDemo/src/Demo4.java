import java.util.TreeSet;

/*
 * Tree set:
 * this follows aesc order
 * insertion time is greater
 * why?
 * 
 * the elements are to inserted in aesc so i need to check my set for the correct 
 * location and re arrange the elements if required.
 * 
 */
public class Demo4 {
public static void main(String[] args) {
	TreeSet<String> names=new TreeSet();
	names.add("yasmeen");
	names.add("ravi");
	names.add("aishwarya");
	names.add("diyva");
	names.add("pooja");
	names.add("ravi");
	
	System.out.println(names);
}
}
