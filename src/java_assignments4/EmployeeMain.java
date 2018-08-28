package java_assignments4;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee employee =new Employee("abc",30,25000);
		Manager manager=new Manager("Pramod",25,90000,40000);
		Labour labour=new Labour("Shubham",23,80000,30000);

		employee.calculateSalary();
		manager.calculateSalary();
		labour.calculateSalary();
	}

}
