import java.util.Scanner;
class LessBalanceException extends Exception{
	public LessBalanceException(String message) {
		super(message);
	}
}
class Account{
	int balance;	
	public Account(int amt) {
		if(amt>500)
			balance=amt;
		else
			balance=500;
	}
	public Account(){
		balance=500;
	}	
	void deposit(int amt){
		balance=balance+amt;
	}	
	void withdraw(int amt) throws LessBalanceException	{
		if((balance>amt)&&((balance-amt)>500))
			balance=balance-amt;
		else
			throw new LessBalanceException("Exception not enough money available");
	}
}
public class Question12 {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);	
	Account a=new Account(4000);
	int ch;
	char ans;
	do {
	System.out.println("1) for deposit 2) for withdraw");
	ch=scanner.nextInt();
	if(ch==1)
	{
		int amt;
		System.out.println("Enter the amount to deposite");
		amt=scanner.nextInt();
		a.deposit(amt);
	}
	else if(ch==2)
	{
		int amt;
		System.out.println("Enter the amount to deposite");
		amt=scanner.nextInt();
		try {
			a.withdraw(amt);
		} catch (LessBalanceException e) {
			System.out.println(e.getMessage());
		}
	}
	else {
		System.out.println("wrong choice");
	}
		System.out.println("do you want to do the next transaction press y for yes");
		ans=scanner.next().charAt(0);
	}
	while(ans=='y');
}
}
