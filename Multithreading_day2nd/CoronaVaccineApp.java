package Multithreading_day2nd;

public class CoronaVaccineApp {

	public static void main(String[] args)
	{
		
          User u1=new User("Suresh",52);
          User u2=new User("Ramesh",15);
          
          Thread t1 = new Thread()
          {
        	  @Override
        	  public void run()
        	  {
        		
            	  u1.bookDose();
            	    
        	  }
        	  
          };
          Thread t2 = new Thread()
          {
        	  @Override
        	  public void run()
        	  {
        		  u2.bookDose();  
            	 
        		  
        	  }
        	  
          };
          t1.start();
          t2.start();
        		  
	}

}
