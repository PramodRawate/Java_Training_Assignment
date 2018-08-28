/* 4.	Write a program that accepts three numbers from the user and prints "increasing" if the numbers are in increasing order, 
 * "decreasing" if the numbers are in decreasing order, 
 * and "Neither increasing or decreasing order" otherwise.
 */

package java_assignements;
import java.util.*;

public class quesiton4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num=new int[3];
		boolean increasing=false,decreasing=false;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 3 numbers");
		num[0]=sc.nextInt();
		num[1]=sc.nextInt();		
		num[2]=sc.nextInt();
		
		if(num[1]>num[0] && num[2]>num[1])
			System.out.println(num[0]+"  "+num[1]+"  "+num[2]+" are in Incerasing Order");
		else if(num[1]>num[2] && num[1]<num[0])
			System.out.println(num[0]+"  "+num[1]+"  "+num[2]+" are in Decreasing Order");
		else
			System.out.println(num[0]+"  "+num[1]+"  "+num[2]+" neither in Increasing order nor Decreasing order");
	}
}
