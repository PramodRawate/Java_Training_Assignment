/*
 * 12.	Given 3 int values, a b c, return their sum. However, if one of the values is 13 then it does not count towards the sum and values to its right do not count. So for example, if b is 13, then both b and c do not count.
 * luckySum(1, 2, 3) :- 6
 * luckySum(1, 2, 13) :- 3
 * luckySum(1, 13, 3) :- 1
 * 
 */
package java_assignments6;
import java.util.Scanner;
public class question12 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int num1,num2,num3;
		
		System.out.println("Enter 3 numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();
		
		if(num1==13)
			System.out.println("luckSum("+num1+","+num2+","+num3+") ---> 0" );
		else if(num2==13)
			System.out.println("luckSum("+num1+","+num2+","+num3+") ---> "+num1);
		else if(num3==13)
			System.out.println("luckSum("+num1+","+num2+","+num3+") ---> "+(num1+num2));
		else
			System.out.println("luckSum("+num1+","+num2+","+num3+") ---> "+(num1+num2+num3));
	}
	
}
