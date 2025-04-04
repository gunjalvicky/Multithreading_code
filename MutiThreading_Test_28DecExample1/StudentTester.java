package MutiThreading_Test_28DecExample1;

public class StudentTester {

	public static void main(String[] args) throws InterruptedException {
	   ScienceStudent  scienceStudent=new  ScienceStudent("Virat", "12th", 85, 40, 35);
	   HistoryStudent historyStudent=new HistoryStudent("Dhoni", "11th", 70, 35);
	   
	   Thread scienceStudent1 =new Thread(() ->{
		   int percentage=scienceStudent.getPercentage();
		   System.out.println("Sceince Student Name:"+scienceStudent.StudentName);
		   System.out.println("Percetage:"+percentage);
		   System.out.println("Promoted Status:"+(scienceStudent.isPromoted()?"Yes":"No"));
	   });
	   Thread historyStudent1=new Thread(()-> {
		   int percentage=historyStudent.getPercentage();
		   System.out.println("History Student Name :"+historyStudent.StudentName);
		   System.out.println("Percentage:"+percentage);
		   System.out.println("Promoted Status:"+(historyStudent.isPromoted()? "yes":"No"));
	   });
	   scienceStudent1.start();
	   scienceStudent1.join();
	   historyStudent1.start();
	   historyStudent1.join();
	  
	   
	  
	   System.out.println("Total Number of Students: " + Student.getTotalNoOfStudents());
	   
	}

}
