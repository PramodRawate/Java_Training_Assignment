/*
 * 11.	Given three ints, a b c, one of them is small, one is medium and one is large.
 *  Return true if the three values are evenly spaced, 
 * so the difference between small and medium is the same as the difference between medium and large.
 * 
 */
package java_assignments6;
import java.util.Scanner;

public class question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Scanner sc=new Scanner(System.in);
		int small,medium,large;
		int difference;
		
		System.out.println("Enter 3 numbers (small,medium,large):");
		small=sc.nextInt();
		medium=sc.nextInt();
		large=sc.nextInt();
		
		if(medium-small==large-medium)
		{
			System.out.println(small+" , "+large+" , "+medium+" are evenly placed...");
			System.out.println(medium+"-"+small+" = "+large+"-"+medium+" :="+(large-medium));
		}
		else
		{
			System.out.println(small+" , "+large+" , "+medium+" are not evenly placed...");
			System.out.println(medium+" - "+small+" != "+large+" - "+medium);
		}
	}

}
