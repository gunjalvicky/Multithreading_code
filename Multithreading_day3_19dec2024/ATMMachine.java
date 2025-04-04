package Multithreading_day3_19dec2024;

public class ATMMachine 
{

	public static void main(String[] args) 
	{
		Account acoount=new Account();
		
		Drawer w=new Drawer(acoount);
		Depositor d=new Depositor(acoount);
		w.start();
		d.start();
	}

}
