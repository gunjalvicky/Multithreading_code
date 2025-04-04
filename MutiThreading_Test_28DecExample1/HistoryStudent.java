package MutiThreading_Test_28DecExample1;

public class HistoryStudent extends Student
{
	private int historyMarks;
	private int civicsMarks;
	private int percentage;
	private boolean percentageCalculated=false;
	
	
	public HistoryStudent(String studentName,String studentClass,int   historyMarks, int civicsMarks) {
		super(studentName,studentClass);
		this.historyMarks = historyMarks;
		this.civicsMarks = civicsMarks;
		
	}
	@Override
	public synchronized int getPercentage()
	{
		percentage=(historyMarks+civicsMarks)/2;
		percentageCalculated=true;
		notify();
		return percentage;
	}
	public synchronized boolean isPromoted()
	{
		while(!percentageCalculated)
		{
			try
			{
				wait();	
			}catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		int failedStudent=0;
		if(historyMarks <40) failedStudent++;
		if(civicsMarks < 40) failedStudent++;
		 
		return failedStudent <2 && percentage>=60;
		
	}


	
}
