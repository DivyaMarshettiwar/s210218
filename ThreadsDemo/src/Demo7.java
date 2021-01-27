import java.util.concurrent.atomic.AtomicInteger;

public class Demo7 {
public static void main(String[] args) {
AtomicInteger a=new AtomicInteger(5);
//i dont want to use any operator
//but want to perform all  action
System.out.println(a.getAndIncrement());
System.out.println(a);
System.out.println(a.getAndAdd(10));
System.out.println(a);
System.out.println(a.addAndGet(10));
}
}
