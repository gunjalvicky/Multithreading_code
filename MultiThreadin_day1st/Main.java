package MultiThreadin_day1st;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws InterruptedException
	{
	     Course c1= new Course(101, "java-fullStack", 27000);
	     Course c2= new Course(102,".net FullStack", 24000);
	     Course c3= new Course(103, "Python- fullsatck", 25000);
	     
	     Offer o1= new Offer("10% discount for java");
	     Offer o2= new Offer("15% discount for.net ");
	     Offer o3= new Offer("10% discount for python");
	     
		Course course[]= {c1,c2,c3};
		Offer offer[]= {o1,o2,o3};
		
		
		EducationInstitute edu=new EducationInstitute(course,offer);
		Student s1= new Student("Virat", edu);
		Student s2= new Student("Dhoni", edu);
		Scanner sc=new Scanner(System.in);
		Thread t=new Thread()
				{
			public void run()
			{
				s1.viewCoursesAndFees();
				s1.viewOffers();
				System.out.println("Enter the course id: ");
				int id=sc.nextInt();
				s1.enrollInCourse(id);
			}
				};
				Thread t2=new Thread()
				{
			public void run()
			{
				s2.viewCoursesAndFees();
				s2.viewOffers();
				System.out.println("Enter the course id: ");
				int id=sc.nextInt();
				s2.enrollInCourse(id);
			}
				};
				
		t.start();
		t.join();
		t2.start();
		
		
		
	}

}
