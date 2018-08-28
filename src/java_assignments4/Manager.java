package java_assignments4;

public class Manager extends Employee {
	private double incentive;

	public Manager(String name, int age, double salary, double incentive) {
		super(name, age, salary);
		this.incentive = incentive;
	}

	public double getIncentive() {
		return incentive;
	}

	public void setIncentive(double incentive) {
		this.incentive = incentive;
	}
	
	public void calculateSalary() {
		System.out.println("Salary of "+this.getName()+" is :-"+(this.getSalary()+this.getIncentive()) );
	}
}
