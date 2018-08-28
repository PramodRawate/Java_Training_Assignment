/*
 * 	Given an array of ints, return true if the array is length 1 or more,
 *  and the first element and the last element are equal.
 * 
 */
package java_assignments6;

import java.util.Scanner;

import sun.misc.Signal;
public class question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr;
		int length;

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array length");
		length=sc.nextInt();
			
		if(length<1)
			System.out.println("Oops...FALSE..Array length less than 1.");
		else
		{
			arr=new int[length];
			System.out.println("Enter array elements:");
			for(int i=0;i<length;i++)
			{
				arr[i]=sc.nextInt();
			}
			
			if(length>1 && arr[0]==arr[length-1])
				System.out.println("TRUE...Length:="+length+" and First element:="+arr[0]+"=="+arr[length-1]);
			else
				System.out.println("FALSE..Legnth less than 1 or First and last element not same");
		}
		
	}

}
