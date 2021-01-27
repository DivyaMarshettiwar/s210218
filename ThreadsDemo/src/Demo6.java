class Parata {
	boolean order=true;
	synchronized void makeParata(int data) {
		if(!order)
		{
			try
			{
				wait();
			}
			catch (Exception e) {
				// TODO: handle exception
			}			
		}
		System.out.println("Order Placed");
		order=false;
		notify();
	}

	synchronized void serveParata() {
		if(order)
		{
			try
			{
				wait();
				
			}
			catch (Exception e) {
				// TODO: handle exception
			}
		}
		order=true;
		System.out.println("Orderd Servered");
		notify();
	}
}
class Chef extends Thread
{
	Parata p;	
	Chef(Parata p)
	{
		this.p=p;
		this.start();
	}
	
	@Override
	public void run() {
		int data=1;
		while(true)
		{
			p.makeParata(data);
			data++;
		}
	}
}
class Customer extends Thread
{
	Parata p;
	
	Customer(Parata p)
	{
		this.p=p;
		this.start();
	}
	@Override
	public void run() {
		while(true)
		{
			p.serveParata();
		}
	}
}

public class Demo6 {
public static void main(String[] args) {
	Parata p=new Parata();
	Chef c=new Chef(p);
	Customer x=new Customer(p);	
}

}
