package Multithreading_day3_19dec2024;

public class Depositor extends Thread
{
	private Account account;

	public Depositor(Account account) {
		super();
		this.account = account;
	}
	@Override
	public void run()
	{
		int []deposits= {12000};
		for(int d:deposits)
		{
			
//			if(d>0)
//			{
				try 
			{
				
				Thread.sleep(1000);
				account.deposit(d);
				
			} catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
//			}
//			System.err.println("The amount are not a deposited.try to add some positive amount.");
			
		}
		
	}
	
}
