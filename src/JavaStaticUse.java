
public class JavaStaticUse {

	
	public JavaStaticUse() {
		// TODO Auto-generated constructor stub
		System.out.println("In constructor");
	}
	static {
		System.out.println("static block 1");
	}

	static {
		System.out.println("static block 2");
	}
	
	static {
		System.out.println("static block 3");
	}
	
	{
		System.out.println("Init block 1");
	}

	{
		System.out.println("Init block 2");
	}
	
	{
		System.out.println("Init block 3");
	}
	
	public static void main(String[] args) {
		JavaStatic js1=new JavaStatic( "Pramod", 'A');
		System.out.println(js1);
		JavaStatic js2=new JavaStatic( "Abhishek", 'B');
		System.out.println(js2);
		JavaStatic js3=new JavaStatic( "Shuham", 'C');
		System.out.println(js3);

		js1.display1();				//Call to Non-static method.
		JavaStatic.display2(js2);		//Call to Static method.

		System.out.println(JavaStatic.counter);
	
		
		JavaStaticUse jsu=new JavaStaticUse();
		
		JavaStaticUse jsu2=new JavaStaticUse();
	
	}

	
}
