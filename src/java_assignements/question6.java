//6.Write a Java program to find all pairs of elements in an array whose sum is equal to a specified number.
package java_assignements;

import java.util.*;

public class question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a;
		int[][] pairs;
		int length,num,var,count=0;
		int[] numinarr1;
		int[] numinarr2;
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter number of array elements");
		length=sc.nextInt();
		a=new int[length];
		
		numinarr1=new int[length];
		numinarr2=new int[length];
		
		System.out.println("Enter array elements");
		pairs=new int[length][length];
		for (int i = 0; i < length; i++) {
			a[i]=sc.nextInt();
		}
		
		
		System.out.println("Enter a numbmer");
		num=sc.nextInt();
		
		System.out.print("Array elements are:- ");
		for (int i = 0; i < a.length; i++) {
			System.out.print("\t"+a[i]);
		}
		System.out.println("\n");

		for(int i=0;i<length;i++)
		{
			var=a[i];
			for(int j=i+1;j<length-1;j++)
			{
				if(var+a[j]==num)
				{
					numinarr1[count]=var;
					numinarr2[count]=a[j];
					count++;
				}
			}
		}
		
		System.out.println("Count of pairs having sum="+num+" is "+count);
		System.out.print("The pairs are:-");
		for (int i = 0; i < count; i++) {
			System.out.print("[ "+numinarr1[i]+" , "+numinarr2[i]+" ]");
		}
	}
}
