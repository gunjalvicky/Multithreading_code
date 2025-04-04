package Multithreading_day4_23DEC;

public class Customer implements Runnable
{
	private final Bakery bakery;
	private final String CustomerName;
	

	public Customer(Bakery bakery, String customerName) {
		super();
		this.bakery = bakery;
		this.CustomerName = customerName;
	}

	@Override
	public void run()
	{
		while(!bakery.isProductionFinished())
		{
			bakery.buyGoods(CustomerName);
		}
		System.out.println(CustomerName +"finished shopping");
		
	}
}

