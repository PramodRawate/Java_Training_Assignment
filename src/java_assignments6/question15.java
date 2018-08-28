/*
 * Return an array that contains exactly the same numbers as the given array, 
 * but rearranged so that every 3 is immediately followed by a 4. Do not move the 3's, but every other number may move.
 *  The array contains the same number of 3's and 4's, every 3 has a number after it that is not a 3, and a 3 appears in the array before any 4.
 */

package java_assignments6;
import java.util.Scanner;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;
public class question15 {

	
	static void rearrange(int arr[]){
		
		int temp;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"  ");
		}
		
		
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==3)
			{
				for (int j = i+1; j < arr.length-1; j++) {
						if(arr[j]==4)
						{
							temp=arr[i-1];
							arr[i-1]=arr[j];
							arr[j]=temp;
						}
				}
			}
		}
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"  ");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int arr[];
		int length,count3=0,count4=-1;
		
		System.out.println("Enter array length:");
		length=sc.nextInt();
		
		arr=new int[length];
		
		System.out.println("Enter array elements:");
		for (int i = 0; i < length; i++) {
			arr[i]=sc.nextInt();
			if(arr[i]==3)
				count3++;
			if(arr[i]==4)
				count4++;
		}
		
		if(count3!=count4)
		{
			System.out.println("OOPS...Count of 3 and 4 not equl to 4 !!!");
			return;
		}
		else
			rearrange(arr);
	}

}
