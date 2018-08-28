/*
 * 9.Write a Java program to check if the sum of all the 10's in the array is 
 * exactly 30.
 *  Return false if the condition does not satisfy, otherwise true.
 * 
 */

package java_assignements;
import java.util.*;
public class question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr[];
		int length;
		int count=0;
		
		System.out.println("Enter number of elements in array:");
		length=sc.nextInt();
		
		arr=new int[length];
		
		System.out.println("Enter array elements:-");
		for(int i=0;i<length;i++)
		{
			
			arr[i]=sc.nextInt();
			if(arr[i]==10)
				count+=10;
		}
		System.out.println("Count exactly=30 or not");
		if(count==30)
			System.out.println("TRUE.....\n Numbers of 10's in array="+count%10+" and count="+count+"\n\n");
		else
			System.out.println("FALSE.....\nNumbers of 10's in array="+count%10+" and count="+count+"\n\n");			
	}

}
