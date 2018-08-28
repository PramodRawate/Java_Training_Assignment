
public class Employee {
	private String name;
	private String dept;
	private String design;
	private double salary;
	private double allowance;
	private double tax;	
	
	public Employee(String name, String dept, String design,double  salary) {
		this.name = name;
		this.dept = dept;
		this.design = design;
		this.salary=salary;
	}

	public void calculateAllowance()
	{
		if(this.design=="PL")
			System.out.println("Allowance for "+this.name+" = "+(this.allowance=1600));
		else if(this.design=="PM")
			System.out.println("Allowance for "+this.name+" = "+(this.allowance=1300));
		else if(this.design=="TL")
			System.out.println("Allowance for "+this.name+" = "+(this.allowance=1270));
		else if(this.design=="Admin")
			System.out.println("Allowance for "+this.name+" = "+(this.allowance=1500));
		else
			System.out.println("Allowance for "+this.name+" = "+(this.allowance=1100));
	}

	public void calculateTax()
	{
		if(this.salary>20000)
			System.out.println("Tax for "+this.name+" = "+(this.tax=(this.salary*13)/100));
		else if (this.salary>15000 && this.salary <20000)
			System.out.println("Tax for "+this.name+" = "+(this.tax=(this.salary*12.5)/100));
		else if (this.salary>12500&& this.salary <14999)
			System.out.println("Tax for "+this.name+" = "+(this.tax=(this.salary*11.25)/100));
		else if (this.salary>7500 && this.salary <12499)
			System.out.println("Tax for "+this.name+" = "+(this.tax=(this.salary*9.6)/100));
		else
			System.out.println("No tax for "+this.name);
	}
	
	public void calculateGrossSalary()
	{
		System.out.println("Gross Salary for "+this.name+" = "+this.salary+this.allowance);
	}
	public void calculateNetSalary()
	{
		System.out.println("Gross Salary for "+this.name+" = "+((this.salary-this.tax)+this.allowance));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Employee e[]=new Employee[5];
		
		e[0]=new Employee("Pramod", "Tech", "Admin",30000);
		e[1]=new Employee("Shubham", "Admin", "PL",18000);
		e[2]=new Employee("Akhilesh", "Admin", "Admin",11222);
		e[3]=new Employee("Aditya", "Tech", "BSG",6500);
		e[4]=new Employee("Abhishek", "Tech", "TL",13525);
/*		Employee e1=new Employee("Pramod", "Tech", "Admin",30000);
		Employee e2=new Employee("Shubham", "Admin", "PL",18000);
		Employee e3=new Employee("Abhishek", "Tech", "TL",13525);
		Employee e4=new Employee("Akhilesh", "Admin", "Admin",11222);
		Employee e5=new Employee("Aditya", "Tech", "BSG",6500);  */
		System.out.println("\n*********Allowance********************");
		for(int i=0;i<5;i++)
		{
			e[i].calculateAllowance();
		}
		System.out.println("\n*********Monthly Tax********************");
		for(int i=0;i<5;i++)
		{
			e[i].calculateTax();
		}
		System.out.println("\n*********Gross Salary********************");
		for(int i=0;i<5;i++)
		{
			e[i].calculateGrossSalary();
		}
		
		System.out.println("\n*********Net Salary********************");
		for(int i=0;i<5;i++)
		{
			e[i].calculateNetSalary();
		}

	}

}
