package MutiThreading_Test_28DecExample1;

public abstract class Student 
{
	protected String StudentName;
	protected String StudentClass;
	protected static int totalNoOfStudent=0;
	
	
	public Student() {
		super();
		incrementTotalNoOfStudents();
	}
	public Student(String studentName, String studentClass) {
		super();
		StudentName = studentName;
		StudentClass = studentClass;
		incrementTotalNoOfStudents();
	}
	public  synchronized static void  incrementTotalNoOfStudents()
	{
		totalNoOfStudent++ ;
	
		
	}
	public static int  getTotalNoOfStudents()
	{
		return totalNoOfStudent;
  }
	public abstract int getPercentage();
}
