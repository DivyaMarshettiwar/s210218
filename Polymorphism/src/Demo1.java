class calc
{
	//the below function is called as varargs function
	public void add(int ...a)
	{
		int sum=0;
		for(int b:a)
		{
			sum=sum+b;
		}
		System.out.println(sum);
	}
	float add(float ...a)
	{
		
		return 0;
	}
}
public class Demo1 {
public static void main(String[] args) {
	calc c=new calc();
	c.add(1,2,3,4,5,6,7,8,9,10,11,12,12);	
}
}
