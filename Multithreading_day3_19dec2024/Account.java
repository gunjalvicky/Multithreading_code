package Multithreading_day3_19dec2024;

public class Account 
{
	private int balance=0;
	
	public synchronized void withdraw(int amount)
	{
//		System.out.println("Amount is Withdraw in progress...");
		
		while(balance <=0)
		{
			System.err.println("insufficient Balance.");
			try
			{
				wait();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}
		balance=balance-amount;
		System.out.println("withdraw balance is :"+amount);
		System.out.println("Availabe balance is :"+balance);
		System.out.println("-------------------------------------\n");
		
		
	}
	public  synchronized void  deposit(int amount)
	{
		if(amount>=0)
		{
			System.out.println("Amount depositing in progress....");
			try
			{
				balance =balance +amount;
				System.out.println(amount+" "+"balance are deposited");
				System.out.println("Available amount is :"+balance);
				System.out.println("-------------------------------------\n");
				notify();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}
		
		
	}

}

