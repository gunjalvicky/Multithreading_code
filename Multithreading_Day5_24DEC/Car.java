package Multithreading_Day5_24DEC;

public class Car implements Runnable
{
	 String name;
	 PetrolPump petrolpump;
	
	public Car(String name, PetrolPump petrolpump) {
		super();
		this.name = name;
		this.petrolpump = petrolpump;
	}

	@Override
	public void run()
	{
		try {
			petrolpump.refillCar(name);
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
