package Multithreading_day2nd;

public class User 
{
	private String name;
	private VaccineEligibility eligibility;
	private DoseBooking doseBooking;
	
	public User(String name, int age) {
		super();
		this.name = name;
		this.eligibility = new VaccineEligibility(age,true);
		this.doseBooking = new DoseBooking(true);
	}
	public boolean isEligible()
	{
		return eligibility.isEligible();

	}
	public void bookDose()
	{
		 try {
			
			 if(eligibility.isEligible()) {
				 
				 String msg = doseBooking.bookDose(false);
				 
				 System.out.println(msg + name);
			 }
			 else {
				 System.out.println(name+" is not eligible for vaccine");
			 }
		 }
		 catch(Exception e)
		 {
			 System.err.println(e.getMessage());
		 }
	}
	
	public void isDoseBooked() {
		
		doseBooking.isDoseBooked();
	}
}
