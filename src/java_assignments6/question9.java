/*
 * Given 2 int values greater than 0,
 *  return whichever value is nearest to 21 without going over.
 *  Return 0 if they both go over.
 * 
 */
package java_assignments6;
import java.util.Scanner;

public class question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int num1,num2;
		
		System.out.println("Enter 2 numbers:");
		num1=sc.nextInt();
		num2=sc.nextInt();
		
		if(num1 > 21 && num2 > 21)
			System.out.println("FALSE(0).....Either number is greater than 21.");
		else if(num1>21)
			System.out.println(num2+".....Since "+num1+" is greater than 21.");
		else if(num2>21)
			System.out.println(num1+".....Since "+num2+" is greater than 21.");
		else
		{
			if(21-num1 < 21-num2)
				System.out.println(num1+" is nearest to 21 than "+num2);
			else if(21-num2 < 21-num1)
				System.out.println(num2+" is nearest to 21 than "+num1);
			else
				System.out.println("num1:="+num2+" and num2:="+num1+" are same.Have same distance from 21");
		}
	}
}
