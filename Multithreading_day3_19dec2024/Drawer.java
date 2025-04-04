package Multithreading_day3_19dec2024;


public class Drawer extends Thread
{
	private Account account;

	public Drawer(Account account) 
	{
		super();
		this.account = account;
	}
	@Override
	public void run()
	{
		int []withdrwals= {2000};
		
		
			for(int w:withdrwals)
			{
//				if(w>0)
//				{
				try
				{
				account.withdraw(w);
				Thread.sleep(1000);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
//			}System.err.println("The withdraw amount are not a Negative Please positive Amount.");
		}
		
			
		
	}
}
