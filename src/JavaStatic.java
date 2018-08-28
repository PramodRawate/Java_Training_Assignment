
public class JavaStatic {

	private int rollno;
	static int counter=1;
	private String name;
	private char grade;
	
	
	public JavaStatic(String name,char grade) {
		// TODO Auto-generated constructor stub
		this.rollno=counter++;
		this.name=name;
		this.grade=grade;
	}

	public void display1()
	{
		System.out.println("This is an nonstatic method...");
	}
	
	public static void display2(JavaStatic js2)
	{
		System.out.println("Roll number of student 2:="+js2.rollno);
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", grade=" + grade + "]";
	}
	
	
}
