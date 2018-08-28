/*
 * Given an int n, return the string form of the number followed by "!". 
 * So the int 6 yields "6!". 
 * Except if the number is divisible by 3 use "Fizz" instead of the number, 
 * and if the number is divisible by 5 use "Buzz", 
 * and if divisible by both 3 and 5, print "FizzBuzz". 
 * 
 */
package java_assignments6;

import java.util.Scanner;
public class question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int num;
		
		System.out.println("Enter a number:");
		num=sc.nextInt();
		
		if(num%3==0 && num%5==0)
			System.out.println("FizzBuzz!");
		else if(num%3==0)
			System.out.println("Fizz!");
		else if(num%5==0)
			System.out.println("Buzz!");
		else
			System.out.println(num+"!");
	}

}
