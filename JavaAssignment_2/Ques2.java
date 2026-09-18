import java.util.Scanner;

class Employees{
	private String firstName;
	private String lastName;
	private double salary;
	
	public  Employees() {
		
	}
	
	public Employees(String firstName, String lastName, double salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setSalary(double salary) {
		if(salary < 0) {
			this.salary = 0;
		}
		else {
			this.salary = salary;
		}
	}
		
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public double getSalary() {
		return salary;
	}
	
	public double yearlySalary() {
		return salary*12;
	}
	
	public double increment() {
		return salary*1.1;
	}
	
	
	
}
public class Ques2 {

	public static void main(String[] args) {
		
	

		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Enter details of Employee 1:");
		
		System.out.print("Enter the first name :");
		String firstName1 = sc.nextLine();
		
		System.out.print("Enter the last name :");
		String lastName1 = sc.nextLine();
		
		System.out.print("Enter the salary :");
		double salary1 = sc.nextDouble();
		
		Employees emp1 = new Employees(firstName1, lastName1, salary1);
		
		
		

		
		
		System.out.println("Enter details of Employee 2:");
		
		System.out.print("Enter the first name :");
		String firstName2 = sc.nextLine();
		
		System.out.print("Enter the last name :");
		String lastName2 = sc.nextLine();
		
		System.out.print("Enter the salary :");
		double salary2 = sc.nextDouble();
		
		Employees emp2 = new Employees(firstName2, lastName2, salary2);
		
		System.out.println("Employee 1: "
	                + emp1.getFirstName() + " "
	                + emp1.getLastName());

	    System.out.println("Monthly Salary: " + emp1.getSalary());
	    System.out.println("Yearly Salary: "
	                + (emp1.getSalary() * 12));
	    
	    System.out.println();

        System.out.println("Employee 2: "
                + emp2.getFirstName() + " "
                + emp2.getLastName());

        System.out.println("Monthly Salary: " + emp2.getSalary());
        System.out.println("Yearly Salary: "
                + (emp2.getSalary() * 12));
        
        
        emp1.setSalary(emp1.getSalary() * 1.10);
        emp2.setSalary(emp2.getSalary() * 1.10);
        
        System.out.println("Newly updated salary:");
        
        System.out.println("New Yearly Salary: "
                + (emp1.getSalary() * 12));
        
        System.out.println();
        
        System.out.println("New Yearly Salary: "
                + (emp2.getSalary() * 12));

	}

}
