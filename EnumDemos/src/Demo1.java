enum Fruits
{
	MANGO(120),ORANGE(100),APPLE(180);
	
	private int price;
	
	private Fruits(int price)
	{
		this.price=price;
	}
	
	public void displayCost()
	{
		System.out.println("the price per kg is Rs:"+price);
	}
}

public class Demo1 {
	public static final String[] fruits= {"MANGO","ORANGE","APPLE"};
	public static void main(String arg[])
	{
		System.out.println(fruits[0]);
		Fruits f=Fruits.APPLE;
		f.displayCost();
	}
	

}
