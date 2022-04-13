
public class Consultant extends Employee {

	private int contractPeriodMonths;

	public Consultant(String name, double salary, String ssn, int contractPeriodMonths) {
		super(name, salary, ssn);
		this.contractPeriodMonths = contractPeriodMonths;
	}

	public int getContractPeriodMonths() {
		return contractPeriodMonths;
	}

	public void setContractPeriodMonths(int contractPeriodMonths) {
		this.contractPeriodMonths = contractPeriodMonths;
	}

	@Override
	public double getPay() {
		double pay=this.salary/contractPeriodMonths;
		return pay;
		
				
	
	}

	
	}
	
	
		
	

	
	
