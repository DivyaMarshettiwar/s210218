import java.util.concurrent.locks.ReentrantReadWriteLock;

class ReadWriteLock extends Thread {
	private static final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

	public void read() {
		try {
			lock.readLock().lock();
			System.out.println(Thread.currentThread().getName() + "has got the rights to read data");
		} finally {
			System.err.println(Thread.currentThread().getName() + "has completed the read data operation");
			lock.readLock().unlock();
		}

	}

	public void write() {
		try {
			lock.writeLock().lock();
			System.out.println(Thread.currentThread().getName() + "has got the rights to update data");
		} finally {
			System.err.println(Thread.currentThread().getName() + "has completed the update data operation");
			lock.writeLock().unlock();
		}

	}
	@Override
	public void run() {
		try
		{
			read();
			sleep(2000);
			write();
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
}

public class Demo9 {
public static void main(String[] args) {
	ReadWriteLock l1=new ReadWriteLock();
	l1.setName("Mani");
	ReadWriteLock l2=new ReadWriteLock();
	l2.setName("rushi");
	l1.start();
	l2.start();
}
}
