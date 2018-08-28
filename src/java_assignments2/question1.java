/*
 * Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and". 
 * The string length will be at least 3.
 */

package java_assignments2;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;
public class question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String input;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		input=sc.next();
		if(input.length()%2==0)
			System.out.println("String lenght is even...Enter an odd length string");
		else
		{
			System.out.println(input.substring(((input.length()/2)-1),(((input.length()/2)-1)+3)));
		}
	}

}
