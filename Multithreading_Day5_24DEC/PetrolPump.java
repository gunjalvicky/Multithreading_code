package Multithreading_Day5_24DEC;

public class PetrolPump 
{
	public synchronized void refillCar(String CarName) throws InterruptedException
	{
		System.out.println(CarName+":"+"started refilling...");
			
				try {
					Thread.sleep(3000);
				}catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			
			System.out.println(CarName+": "+"Completed Refilling");
			Thread.sleep(2000);
	}

}
