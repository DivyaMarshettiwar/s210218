import java.util.Scanner;

class TicketException extends Exception
{
	public TicketException(String message) {
		super(message);	
	}
}
public class Demo7 
{
	public static void main(String[] args) {
		int ticket_count=100;
		int bookticket;
		Scanner s=new Scanner(System.in);
		try
		{
			bookticket=s.nextInt();
			if(bookticket>ticket_count)
				throw new TicketException("enough tickets not available");
			else if(bookticket<=0)
				throw new TicketException("cannot be less that or equal to zero");
			else if((ticket_count-bookticket)<0)
				throw new TicketException("enough tickets not available");
			else
				ticket_count=ticket_count-bookticket;
		}
		catch (Exception e) {
				System.err.println(e.getMessage());
		}
	}

}
