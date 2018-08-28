import java.util.Iterator;

public class cmd_Args {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int int1=Integer.parseInt(args[0]);
		int int2=Integer.parseInt(args[1]);
		int result=int1+int2;
		System.out.println("Integer Addition:="+result);
		
		float float1=Float.parseFloat(args[2]);
		float float2=Float.parseFloat(args[3]);
		float result2=float1+float2;
		System.out.println("Float Addition:="+result2);
		
//		char a=Character.valueOf(args[4]);
//		System.out.println("Character from CMD:="+a);
//		System.out.println(Integer.parseInt(args[0])+Integer.parseInt(args[1]));
	}

}
