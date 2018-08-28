
public class Variable_Arguments {

	public void print(int... intVarags)
	{
		for(int i:intVarags)
		{
			System.out.print(" "+i);
		}
		System.out.println("\n");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Variable_Arguments demo=new Variable_Arguments();
		demo.print(1,2,3);
		demo.print(1,2,3,4,5,6,7,8,9);
		demo.print(1);
	}

}
