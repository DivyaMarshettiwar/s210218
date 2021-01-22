//this program is a demo to show that any program in java is executed with the help of thread
public class Demo1 {
public static void main(String[] args) {
	Thread t=Thread.currentThread();
	System.out.println(t.getName());
}
}
