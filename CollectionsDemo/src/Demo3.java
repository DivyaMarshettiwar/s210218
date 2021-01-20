import java.util.HashSet;

/*
Set
----
this interface allows no duplication
this is a collection where the insertion cannot happen based upon index
the items in the set are not arranged in the order of insertions

there are two types of set

1)HashSet:
the elements in this set are arranged based upon hash value
we prefer to use hash set as insertion is faster
TreeSet
*/
public class Demo3 {
	public static void main(String arg[]) {
		HashSet<Integer> s=new HashSet();
		s.add(1);
		s.add(1);
		s.add(4);
		s.add(-1);
		s.add(-3);
		
		System.out.println(s);
	}
}
