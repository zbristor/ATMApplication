import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ATM implements iATM{
ArrayList<Account> list;
Scanner sc=new Scanner(System.in);
public ATM()
{
	list=new ArrayList<Account>();
	Account ac1= new Account("56666", "zbristor",507.89, "4455");
	Account ac2= new Account("12345", "kabir",3000.45, "1234");
	Account ac3= new Account("35678", "hanuk",984.45,"2299");
	Collections.addAll(list,ac1,ac2,ac3);
}
public String sInput()
{
	System.out.println("Enter the account number: ");
	String s = sc.nextLine();
	return s;
}
public String pinInput()
{
	System.out.println("Enter the pin number: ");
	String p = sc.nextLine();
	return p;
	
}
public String check(Account a)
{
	int count=0;
	String p;
	do{
	System.out.println("Incorrect. Your pin is incorrect. Try again: ");
	p = sc.nextLine();
	if(count==3)
	{
		return "Your account has been locked";
	}
	count++;
	}while(!(p.equals(a.getPin())&&count<4));
	return "";
}
public double next(Account a)
{
	System.out.println("What would you like to do today? (d)deposit (w)withdraw (c) check balance");
	String ne = sc.nextLine();
	if(ne.equals("d"))
	{
		System.out.println("How much would you like to deposit? ");
		double dep = sc.nextDouble();
		System.out.println("Balance after deposit is: "+a.deposit(dep, a.getBalance()));
		return a.deposit(dep, a.getBalance());
		
	}
	else if(ne.equals("w"))
	{
		System.out.println("How much would you like to withdraw? ");
		double wit = sc.nextDouble();
		System.out.println("Balance after withdrawal is: "+a.withdraw(wit, a.getBalance()));
		return a.withdraw(wit, a.getBalance());
	}
	else if(ne.equals("c"))
	{
		System.out.println("Your balance is: "+a.getBalance());
		return a.getBalance();
	}
	return 0.0;
}	
public Account retrieve(String s, String p)
{
	//int count=3;
	for (Account acc: this.list)
	{
		if(acc.getAccNum().equals(s) && acc.getPin().equals(p))
			{
				return acc;
			}
		else 
		{
			break;
			/*
			count--;
			System.out.println("Either the pin number or the account number is incorrect. You have "+count+" more tries before the account is locked.");
			if(count==0)
			{
				System.out.println("Your account has been locked.");
			}
			*/
		}
	}
	return null;
		
}
// The deposit, withdraw, and checkBalance methods are combined in the next()method
public double deposit(Account a, double d)
{
	System.out.println("Balance after deposit is: "+a.deposit(d, a.getBalance()));
	return a.deposit(d, a.getBalance());
}
public double withdraw(Account a, double w)
{
	System.out.println("Balance after withdrawal is: "+a.withdraw(w, a.getBalance()));
	return a.withdraw(w, a.getBalance());
}

public double checkBalance(Account a)
		{
			return a.getBalance() ;
		}
		

}

