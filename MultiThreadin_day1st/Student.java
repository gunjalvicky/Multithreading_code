package MultiThreadin_day1st;

public class Student 
{
	String name;
	EducationInstitute institute;
	
	public Student(String name, EducationInstitute institute) 
	{
		super();
		this.name = name;
		this.institute = institute;
	}
	
	public void viewCoursesAndFees()
	{
		for(Course course:institute.getCourses()) 
		{
			System.out.println(course.getCourseId()+"  "+course.getCourseName());
		}
		
	}
	public void viewOffers()
	{
		for(Offer offer:institute.getOffers()) 
		{
			System.out.println(offer.getOfferText());		
			}
	}
	
	public void enrollInCourse(int courseId)
	{
		institute.enrollStudentInCourse(courseId, name);
		
	}
	

}
