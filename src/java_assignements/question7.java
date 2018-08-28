/*
 * 7.	Write a Java program to move all 0's to the end of an array. Maintain the relative order of the other (non-zero) array elements. 
 */

package java_assignements;

import java.util.*;
public class question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);

		int arr[];
		int temparr[];
		int length,count=0,num,i=0,j=0;

		System.out.println("Enter number of array elements:");
		length=sc.nextInt();

		arr=new int[length];
		temparr=new int[length];
		
		System.out.println("Enter array elements with Zero's(0):");
		for (i = 0; i < length; i++) {
			num=sc.nextInt();
			if(num==0)
			{
				count++;
			}
			else
			{
				arr[j]=num;
				j++;
			}
		}

		System.out.print("Iput");
		for (i = 0; i < length; i++) {
			System.out.print("\t"+arr[i]);
		}
		
		System.out.println("\n");
		System.out.println("Value of i ="+i);
		i=0;
		while(count>0)
		{
			arr[i+count]=0;
			i++;
			count--;
		}
		
		System.out.print("Array with zeros appended at last");
		for (i = 0; i < length; i++) {
			System.out.print("\t"+arr[i]);
		}

		

	}

}
