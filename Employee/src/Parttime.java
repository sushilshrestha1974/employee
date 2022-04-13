
public class Parttime extends Employee {

			private int hoursPerWeek;

			public Parttime(String name, double salary, String ssn, int hoursPerWeek) {
				super(name, salary, ssn);
				this.hoursPerWeek = hoursPerWeek;
			}

			@Override
			public double getPay() {
				double getPay =this.salary*hoursPerWeek*2;
				return getPay;
				
				
			}
		
		
	}


