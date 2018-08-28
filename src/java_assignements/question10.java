/*
 * 10.	Write a Java program to remove the duplicate elements of a given array 
 * and return the new length of the array.
 */
package java_assignements;

import java.util.Scanner;

public class question10 {

	static void bubbleSort(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n-1; i++)
			for (int j = 0; j < n-i-1; j++)
				if (arr[j] > arr[j+1])
				{
					// swap temp and arr[i]
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int arr[];
		int temp[];
		int length;
		
		System.out.println("Enter number of elements in array:");
		length=sc.nextInt();
		
		arr=new int[length];
		
		System.out.println("Enter array elements:-");
		for(int i=0;i<length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.print("Array Before Sorting");
		for(int i=0;i<length;i++)
		{
			System.out.print("\t"+arr[i]);
		}
		System.out.println("\n");
		bubbleSort(arr);
		System.out.print("Array Before Sorting");
		for(int i=0;i<length;i++)
		{
			System.out.print("\t"+arr[i]);
		}
		
	}

}
