package Multithreading_day2nd;

public class VaccineEligibility 
{
	private int age ;
	private boolean hasHealthCondition;
	public VaccineEligibility(int age, boolean hasHealthCondition) {
		super();
		this.age = age;
//		this.hasHealthCondition = hasHealthCondition;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
		
	}
	public boolean isHasHealthCondition() {
		return hasHealthCondition;
	}
	public void setHasHealthCondition(boolean hasHealthCondition) {
		this.hasHealthCondition = hasHealthCondition;
	}
	
	public boolean isEligible() {
		if(age >= 18 && age <60 && hasHealthCondition) {
			return true;
		}
		return false;
	}
	
	
	
}
