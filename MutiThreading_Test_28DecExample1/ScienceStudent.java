package MutiThreading_Test_28DecExample1;

public class ScienceStudent extends Student 
{
	private int physicsMarks;
	private int chemistryMarks;
	private int mathMarks;
	private int percentage;
	private boolean  percentageCalculated=false;
	
	
	
	public ScienceStudent(String StudentName,String StudentClass,int  physicsMarks, int chemistryMarks, int mathMarksntage) {
		super(StudentName,StudentClass);
		this.physicsMarks = physicsMarks;
		this.chemistryMarks = chemistryMarks;
		this.mathMarks = mathMarks;
		
	}
	@Override
	public synchronized int getPercentage() {
		percentage=(physicsMarks+chemistryMarks+mathMarks)/3;
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
		int failedSubject=0;
		if(physicsMarks <40) failedSubject++;
		if(chemistryMarks < 40) failedSubject++;
		if(mathMarks <40 ) failedSubject++;
		return failedSubject < 2 && percentage >=60;
	}
	
	
	
}
