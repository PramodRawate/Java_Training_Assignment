/*
 * Given three ints, a b c, 
 * return true if it is possible to add two of the ints to get the third. 
 */
package java_assignments6;

import java.util.Scanner;
public class question3 {

	public static void main(String[] args) {
		int num1,num2,num3;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 integer numbers:");
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();
		
		if(num1*num2==num3 || num1*num3==num2 || num2*num3==num1)
			System.out.println(num1+" * "+num2+" = "+num3+"\tTRUE...");
		else
			System.out.println("FALSE");
	}
}
