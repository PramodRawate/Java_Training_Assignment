/*
 * Given three ints, a b c, return true if b is greater than a, and c is greater than b. 
 * However, with the exception that if "bOk" is true, b does not need to be greater than a.
 * inOrder(1, 2, 4, false) :- true
 * inOrder(1, 2, 1, false) :- false
 * inOrder(1, 1, 2, true) :- true
 * 
 */

package java_assignments6;

import java.util.Scanner;

public class question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1,num2,num3,bOk;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 3 numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();
		
		System.out.println("Enter 1 for :-bOk=TRUE or 0 for :-bOk:FLASE");
		bOk=sc.nextInt();
		
		if(bOk==1)
		{
			if(num3>num2)
				System.out.println("TRUE..."+num2+">"+num1+"and "+num3+">"+num2+" with bOk:=TRUE");
			else
				System.out.println("FALSE..."+num2+"!>"+num1+"and "+num3+"!>"+num2+" with bOk:=TRUE");
		}	
		else
		{
			if(num2>num1 && num3>num2)
				System.out.println("TRUE..."+num2+">"+num1+"and "+num3+">"+num2+" with bOk:=FALSE");
			else
				System.out.println("FALSE..."+num2+"!>"+num1+"and "+num3+"!>"+num2+" with bOk:=FALSE");
				
		}
		
	}		
}
