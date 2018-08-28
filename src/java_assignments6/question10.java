/*
 * Given 3 int values, a b c, return their sum. However, 
 * if one of the values is the same as another of the values, 
 * it does not count towards the sum.
 * 
 */
package java_assignments6;
import java.util.Scanner;
public class question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int num1, num2,num3,total=0;
		
		System.out.println("Enter 3 numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();
		
		if(num1==num2 || num1==num3)
		{
			total=num2+num3;
			System.out.println("Total := "+num2+" + "+num3+" := "+total+"...."+num2+" occured twice,hence eliminated in addition");
		}
		else if(num2==num1 || num2==num3)
		{
			total=num1+num3;
			System.out.println("Total := "+num1+" + "+num3+" := "+total+"...."+num2+" occured twice,hence 0eliminated in addition");
		}
		else
		{
			total=num1+num2+num3;
			System.out.println("Total := "+num1+" + "+num2+" + "+num3+" := "+total);
			
		}
	}

}
