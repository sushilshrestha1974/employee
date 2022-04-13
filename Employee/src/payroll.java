
import java.util.Scanner;

public class payroll {

	static Employee[] employees = new Employee[6];

	static String printMenu() {

		return "Employee types\n\t1. Full-time" + "\n\t2. Part-time\n\t3. Intern\n" + "\n\t4. Consultant"
				+ "\n\t0. Exit system";
	}

	public static void main(String[] args) {

		int index = 0;
		int userChoice;
		Scanner input = new Scanner(System.in);

		String name;
		String ssn;
		double salary;
		int hoursPerWeek;
		String university;
		boolean paid;
		int contractPeriod;
		
		Employee newEmployee;

		do {

			System.out.println(printMenu());

			userChoice = input.nextInt();
			input.nextLine();

			if (userChoice == 1) { // Full-time

				System.out.println("What is the name of the employee?");
				name = input.nextLine();

				System.out.println("What is employee's SSN?");
				ssn = input.nextLine();

				System.out.println("What is employee's salary?");
				salary = input.nextDouble();

				employees[index] = new Fulltime(name, salary, ssn);
				index++;

			}

			else if (userChoice == 2) { // Part-time

				System.out.println("What is the name of the employee?");
				name = input.nextLine();

				System.out.println("What is employee's SSN?");
				ssn = input.nextLine();

				System.out.println("What is employee's salary?");
				salary = input.nextDouble();

				System.out.println("How many hours per week does the employee work?");
				hoursPerWeek = input.nextInt();

				employees[index] = new Parttime(name, salary, ssn, hoursPerWeek);
				index++;

			}

			else if (userChoice == 3) { // Intern

				System.out.println("What is the name of the employee?");
				name = input.nextLine();

				System.out.println("What is employee's SSN?");
				ssn = input.nextLine();

				System.out.println("What is employee's salary?");
				salary = input.nextDouble();

				System.out.println("How many hours per week does the employee work?");
				hoursPerWeek = input.nextInt();
				
				input.nextLine();
				System.out.println("Which university does the intern study in?");
				university = input.nextLine();
				
				System.out.println("Is this internship paid? (true / false)");
				paid = input.nextBoolean();

				employees[index] = new Intern(name, salary, ssn, hoursPerWeek, university, paid);
				index++;

			}
			
			else if (userChoice == 4) { // Consultant

				System.out.println("What is the name of the employee?");
				name = input.nextLine();

				System.out.println("What is employee's SSN?");
				ssn = input.nextLine();

				System.out.println("What is employee's salary?");
				salary = input.nextDouble();

				System.out.println("How many months of contract?");
				contractPeriod = input.nextInt();

				employees[index] = new Consultant(name, salary, ssn, contractPeriod);
				index++;

			}

		} while (index != 6 && userChoice != 0);
		
		for(int i = 0; i < index; i++) {
			
			System.out.println(employees[i].getEmployeeID() + ":" + employees[i].getPay());
			
		}
		
		input.close();

	}

}

