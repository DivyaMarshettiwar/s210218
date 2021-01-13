class PaymentGateway
{
	static String data;
	int x;
	
	static class ValidateData
	{
		/*
		 * this class can access only the static variables of the outer class
		 * to access the non static variables i need object of outer class
		 */
		void validate()
		{
			PaymentGateway p=new PaymentGateway();
			System.out.println(data);
			p.x=10;
		}
	}
}
public class Demo2 {

	public static void main(String[] args) {
		PaymentGateway.ValidateData v=new PaymentGateway.ValidateData();
		v.validate();
	}
}
