import java.util.Scanner;

public class Employee2 {
	private int empId;
	private String empName;
	private String empAddress;
	private String empEmail;
	private String Empdesignation;
	private String[] certifications;
	private static int empcount;
	static int count;
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee2 e2[]=new Employee2[15];
			System.out.println("How many employess data you want to add");
			empcount=sc.nextInt();
			sc.nextLine();
		for (int i = 0; i < empcount; i++) {
			e2[i]=new Employee2();
			e2[i].addEmpDetails();
		}

		for (int i = 0; i < empcount; i++) {
			e2[i].modifyEmpDetails();
		}
	}
	public void getEmpDetails()	{
		
		System.out.println("Employee Details are as folows:-");
		System.out.println("Name :-"+this.empName);
		System.out.println("ID:- "+this.empId);
		System.out.println("Address:- "+this.empAddress);
		System.out.println("Email:- "+this.empEmail);
		System.out.println("Designation:- "+this.Empdesignation);
		System.out.print("Employee Certifications are:- [");
		for (String string : certifications) {
			System.out.print(string+",");
		}
		System.out.print("]\n");
	}
	public  void addEmpDetails() {
		
		System.out.println("Enter employee name:");
		this.empName=sc.nextLine();
		System.out.println("Enter employee ID:");
		this.empId=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Address:");
		this.empAddress=sc.nextLine();
		System.out.println("Enter mailid:");
		this.empEmail=sc.nextLine();
		System.out.println("Enter Desgination:");
		this.Empdesignation=sc.nextLine();
		System.out.println("How many certifications you have did ? ");
		count=sc.nextInt();
		this.certifications=new String[count];
		sc.nextLine();
		for (int i = 0; i < count; i++) {
			System.out.println("Enter "+i+" Certification :");
			this.certifications[i]=sc.nextLine();
		}
		this.getEmpDetails();
	}
	public void modifyEmpDetails() {
		int check;
		System.out.println("\n\nEnter 1 to modify Address,else 0:");
		check=sc.nextInt();
		if(check==1)
		{
			System.out.println("Enter new Address");
			this.empAddress=sc.next();	
		}
		
		System.out.println("Enter 1 to modify email,else 0:");
		check=sc.nextInt();
		if(check==1)
		{
			System.out.println("Enter new mail id");
			this.empEmail=sc.next();	
		}
		
		System.out.println("Enter 1 to modify designation,else 0:");
		check=sc.nextInt();
		if(check==1)
		{
			System.out.println("Enter new designation");
			this.Empdesignation=sc.next();	
		}
		System.out.println("Updated Details:-\n");
		this.getEmpDetails();
	}
	
}
