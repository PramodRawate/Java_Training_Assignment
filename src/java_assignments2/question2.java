/*
 * Given 2 strings, a and b, 
 * return a new string made of the first char of a and the last char of b, 
 * so "yo" and "java" yields "ya". 
 * If either string is length 0, use '@' for its missing char.
 */

package java_assignments2;
import java.util.*;
public class question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1,s2;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st string:");
		s1=sc.nextLine();
		s2=sc.nextLine();
		if(s1.length()==0)
			System.out.println("Output:=\t"+("@"+s2.charAt(s2.length()-1)));
		else if(s2.length()==0)
			System.out.println("Output:=\t"+(s1.charAt(0))+"@");
		else
			System.out.println("Output:=\t"+s1.charAt(0)+s2.charAt(s2.length()-1));
	}

}
