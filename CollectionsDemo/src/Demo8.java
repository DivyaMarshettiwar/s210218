import java.util.ArrayDeque;
import java.util.Iterator;

public class Demo8 {
public static void main(String[] args) {
	ArrayDeque<Integer> a=new ArrayDeque<Integer>();
	a.add(1);
	a.add(3);
	a.addFirst(23);
	a.addLast(36);
	
	Iterator<Integer> i=a.descendingIterator();
	while (i.hasNext()) {
		Integer integer = (Integer) i.next();
		System.out.println(integer);
	}
	
	
}
}
