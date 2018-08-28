/*
 *  8. Write a Java program to get the difference between the 
 *  largest and smallest values in an array of integers.
 *  The length of the array must be 1 and above 
 */

package java_assignements;
import java.util.*;
public class question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr[];
		int length;
		int smallest=99999,largest=-1;
		
		System.out.println("Enter number of elements in array:");
		length=sc.nextInt();
		
		arr=new int[length];
		
		System.out.println("Enter array elements:-");
		for(int i=0;i<length;i++)
		{
			arr[i]=sc.nextInt();
			if(arr[i]>largest)
				largest=arr[i];
			if(arr[i]<smallest)
				smallest=arr[i];
		}
		
		System.out.println("Dofference between largest and smallest is:="+(largest-smallest));
	}

}
