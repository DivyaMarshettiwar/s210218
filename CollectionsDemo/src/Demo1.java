import java.util.ArrayList;
import java.util.Iterator;

/*
 * java.util Package help us in accomplishing the task of creating a array of no size
 * as when a new element come the size increases.
 * List
 * -----
 * 1) it is an ordered collection
 * 2)the order maintained over here is insertion order
 * 3)this collections allows duplicates
 * 
 * List is an interface in java.From this interface we have
 * 1)ArrayList:the data is read only in forward direction
 * 2)LinkedList:the data is read both in forward as well as reverse
 * the reverse reading is possible only with the help of  Iterator
 * descendingIterator()
 * 3)Vector
 * The below demo is on ArrayList 
 */
public class Demo1 {
	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList();
		// The ArrayList class is a genric class for whome the data type can be decided
		// by us
		l.add("Divya");// this data is in 0 index position
		// the add method allows us to add the data to the list.
		l.add("Shubam sunil");
		l.add("javed");
		l.add(1, "shubohit");// when i want shubohit to be add in index 1 this method will add the
		// data to 1 index position and reposition other data automatically

		// l.add(6,"mythreye");if my list size is less than the index position then a
		// runtime error
		// is raised

		/*
		 * how do i display my list there are three ways
		 */

		// way no 1:

		System.out.println(l);
//this line will print data in the form of []

		//l.remove(3);
		// way 2
		// instead of displaying as a collection i would like to display as a value

		for (String s : l)// this is for each loop
		{
			System.out.println(s);
		}
		/*
		 * in the above method i can only fetch a value but cannot delete it or modify
		 * it for(String s : l) { l.remove(s); } because i read from the same list.
		 */

		// way 3
		
		Iterator<String> listiterator=l.listIterator();
		while(listiterator.hasNext())//here i am checking if the next value is available
		{
			String s1=listiterator.next();//here i fetch the value.
			System.out.println(s1);
			if(s1.equals("javed"))
			{
				listiterator.remove();//this modification can be done only once
			}
			//the value is fetched form the iterator and not from the list 
		}
		
		System.out.println(l);
	}
}
