
public class Intern extends Employee {

	private int hoursPerWeek;
	private String university;
	private boolean ispaid=true;
	public Intern(String name, double salary, String ssn, int hoursPerWeek, String university, boolean ispaid) {
		super(name, salary, ssn);
		this.hoursPerWeek = hoursPerWeek;
		this.university = university;
		this.ispaid = ispaid;
	}
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
	@Override
	public double getPay() {
		if (ispaid==true) {
			double Pay=this.salary*hoursPerWeek*2;	
		return Pay;
				}
		
		else {
			return 0;
			
	}
	
	
	
	}

}
