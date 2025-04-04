package Multithreading_day2nd;

public class DoseBooking 
{
	 boolean booked;
	 
	
	public DoseBooking(boolean booked) {
		super();
		this.booked = booked;
	}
	public String bookDose(boolean booked) throws RuntimeException
	{
		if(booked==true)
		{

				throw new RuntimeException("Your Dose already booked.");
			
		}
        
		booked=false;
		return "Dose booked successfully for ";
			
	}
	public void  isDoseBooked()
	{
		  if(booked==true)	{
			  System.out.println("Dose is already booked...");
		  }
		  else {
			 System.out.println("Dose is not booked...");
		  }
	}
}

