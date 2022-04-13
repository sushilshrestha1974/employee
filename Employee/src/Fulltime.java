
public class Fulltime extends Employee {

	
	public Fulltime(String name, double salary, String ssn) {
		super(name, salary, ssn);
	
	}

	public double calculateBonus() {
	
		double Bonus=this.salary*(15/100);
		
		return Bonus;
		
	
	}

	@Override
	public double getPay() {
	double salary =this.salary/26;
	return salary;
	
		
	
	}
	
	
		
	}


