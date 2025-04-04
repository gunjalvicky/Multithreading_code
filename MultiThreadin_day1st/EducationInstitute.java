package MultiThreadin_day1st;

public class EducationInstitute 
{
	Course courses[];
	Offer offer[];
	public EducationInstitute(Course[] courses, Offer[] offer) {
		super();
		this.courses = courses;
		this.offer = offer;
	}
	
	public Course[] getCourses()
	{
		return courses;
	}
	public Offer[] getOffers()
	{
		return offer;
	}
	public void enrollStudentInCourse(int courseId,String StudentName)
	{
		for(Course c:courses)
		{
			if(c.getCourseId()==courseId)
			{
				System.out.println(StudentName+" Enrolled in the "+c.getCourseName());
			}
		}
	}

}
