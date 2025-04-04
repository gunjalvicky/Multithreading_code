package Multithreading_Day5_24DEC;

public class PetrolPumpSimulation {

	public static void main(String[] args) throws InterruptedException 
	{
		PetrolPump pump=new PetrolPump();
		
	    Car [] cars= {(new Car("Maruti Suzuki",pump)),(new Car("bmw",pump)),(new Car("Tata",pump))};
		
		Thread threads[]=new Thread[cars.length];
		for(int i=0;i<cars.length;i++)
		{
			threads[i]=new Thread (cars[i]);
			
			
		}
		for(Thread thread:threads)
		{
			thread.start();
			thread.join();
		}
		try
		{
//			threads[threads.length-1].join();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		Thread.sleep(2000);
		System.out.println("All cars are refilling Completed ");
	}

}
