import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

/*
 * Map
 * ---
 * is going to be a collection of key value pair
                                       */
public class Demo7 {
public static void main(String[] args) {
	Hashtable<Integer,String> h=new Hashtable();
	h.put(1, "mythreye");
	h.put(2, "nitin");
	h.put(3, "shanan");
	h.put(4, "bharti");
	
	System.out.println(h.get(3));
	
	Set<Integer> keyset=h.keySet();
	//the k of my set map intrface is of set formate
	
	Iterator<Integer> setiterator=keyset.iterator();
	while (setiterator.hasNext()) {
		Integer integer = (Integer) setiterator.next();
		System.out.println(h.get(integer));
	}
}
}
/*
HAshMAp 1 null key and n null values
treemap data is in sorted order.abstract
hashtable no null key no null value/thread safe
*/