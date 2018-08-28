package java_assignments4;

public class Labour extends Employee{

	private double over_time;


	public Labour(String name, int age, double salary, double over_time) {
		super(name, age, salary);
		this.over_time = over_time;
	}

	public double getOver_time() {
		return over_time;
	}

	public void setOver_time(double over_time) {
		this.over_time = over_time;
	}
	
	public void calculateSalary()
	{
		System.out.println("Salary of "+this.getName()+" is :-"+(this.getSalary()+this.getOver_time()));
	}
	
}
