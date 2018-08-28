/*
 * 3.	Write a Java program to check whether a given number is an ugly number. 
 * In number system, ugly numbers are positive numbers whose only prime factors are 2, 3 or 5.
 * First 10 ugly numbers are 1, 2, 3, 4, 5, 6, 8, 9, 10, 12. 
 * By convention, 1 is included.
 */

package java_assignments2;

import java.util.Scanner;

public class question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num;
		
		System.out.println("Enter a number");
		num=sc.nextInt();
		
		
		if(num%2==0 ||  num%3==0 || num%5==0 || num==1)
			System.out.println(num+" is a UGLY Number.");
		else
			System.out.println(num+" is not a UGLY number.");
			
	}
}
