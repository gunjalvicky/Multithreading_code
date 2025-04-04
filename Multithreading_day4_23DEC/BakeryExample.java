package Multithreading_day4_23DEC;

public class BakeryExample {

	private static Thread customerThread;

//	@SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException
	{
		Bakery bakery=new Bakery();
		Thread bakerThread=new Thread(new Baker(bakery));
		bakerThread.start();
		Thread[] customerThreads=new Thread[5];
		for(int i=0;i<5;i++)
			
		{
			customerThreads[i]=new Thread(new Customer(bakery, "Customer-"+(i+1)));
			customerThreads[i].start();
		}
		try {
			bakerThread.join();
			for(Thread customerThread:customerThreads);
			{
				customerThread.join();
			}
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("Baker simulation completed.");
		

	}

}
