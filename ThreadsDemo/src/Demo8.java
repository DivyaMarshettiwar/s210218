import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Demo8 implements Runnable {
	final Lock lock = new ReentrantLock();
	Thread t;

	public void createThread(String name) {
		t = new Thread(this, name);
		t.start();
	}

	public void run()
 	{
 		do
 		{
 			try
 			{
 				if(lock.tryLock(400, TimeUnit.MILLISECONDS))
 				{
 					try
 					{
 						System.out.println("Lock Acquired by"+Thread.currentThread().getName());
 						Thread.sleep(2000);
 					}
 					finally {
 						lock.unlock();
 						System.out.println("Lock Released by"+Thread.currentThread().getName());
 					}	
 				}
 				else
 				{
 					System.err.println("Unable to Acquire Lock"+Thread.currentThread().getName());
 				}
 			}
 			catch (Exception e) {
			// TODO: handle exception
 			}
 		}
 		while(true);
 	}
	public static void main(String[] args) {
		Demo8 d= new Demo8();
		d.createThread("Rishi");
		d.createThread("Supraja");
		d.createThread("Yasmeen");
	}
}
