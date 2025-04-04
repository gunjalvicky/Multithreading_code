package Multithreading_day4_23DEC;

public class Baker implements  Runnable
{
	public final Bakery bakery;
	public Baker(Bakery bakery) {
		super();
		this.bakery = bakery;
	}
	@Override
	public void run()
	{
			while(!bakery.isProductionFinished())
			{
				bakery.bakeGood();
			}
			System.out.println("Baker finished production for thr day");
		}	
	}

