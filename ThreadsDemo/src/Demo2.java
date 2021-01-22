class Race extends Thread
{
	void running_race() throws InterruptedException
	{
		
		for(int i=0;i<10;i++)
		{
			if(i==5&&(Thread.currentThread().getName().equals("Raj")))
			{
				Thread.sleep(5000);
			}
			System.out.println(Thread.currentThread().getName()+" is running at"+i);
		}	
	}	
	@Override
	public void run(){
		try {
			running_race();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//in available is runnable interface the thread class inherits runnable interface
	//any code written or called inside the run method is executed in the form thread
}
public class Demo2 {
	public static void main(String[] args) {
		Race raj=new Race();
		Race rani=new Race();
		raj.setName("Raj");
		rani.setName("Rani");
		rani.setPriority(Thread.NORM_PRIORITY+2);
		raj.setPriority(Thread.NORM_PRIORITY-3);
		rani.start();
		raj.start();
	}
}
