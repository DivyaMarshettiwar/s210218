class MyData {
	public synchronized static void disp() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Execution done by thread" + Thread.currentThread().getName() + "at " + i);
		}
	}

}

class X extends Thread {
	@Override
	public void run() {
		MyData.disp();
	}

}

class Y extends Thread {
	@Override
	public void run() {
		MyData.disp();
	}
}

public class Demo5 {
	public static void main(String[] args) {
		X x = new X();
		Y y = new Y();
		x.start();
		y.start();
	}
}
