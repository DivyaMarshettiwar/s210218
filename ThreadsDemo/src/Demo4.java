class A extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++)
			System.out.println("Hi");
	}
}

class B extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++)
			System.out.println("Bye");
	}
}

public class Demo4 {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		try {
			System.out.println("Executing Main");
			a.start();
			a.join();
			b.start();
			b.join();
			System.out.println("Ended in Main");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

//join

//wait and notify/notify all