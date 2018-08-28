/*
 * Given a non-empty array, return true if there is a place to split the array 
 * so that the sum of the numbers on one side is equal to the sum of the numbers on the other side.
 */
package java_assignments6;
import java.util.Scanner;
public class question14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		int[] arr,sum_till_point;
		int length;

		System.out.println("Enter the lenght of array:");
		length=sc.nextInt();

		arr=new int[length];
		sum_till_point=new int[length];
		int sum1=0,sum2=0;

		System.out.println("Enter array elements:");
		for (int i = 0; i < length; i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<length;i++)
		{
			sum2=0;
			sum1=sum1+arr[i];
			for(int j=i+1;j<length;j++)
			{
				sum2+=arr[j];
			}
			
			if(sum1==sum2) {
				System.out.println("Split point index ="+i);
				System.out.print("[");
				for(int j=0;j<=i;j++)
				{
					System.out.print(arr[j]+"+");
				}
				System.out.print("="+sum1+"    ");
				for(int j=i+1;j<length;j++)
				{
					System.out.print(arr[j]+"+");
				}
				System.out.print("="+sum2+"]");
				return;
			}
		}
		System.out.println("Array cannot be splited...");
	}
}



/*	System.out.println("Array elemnts and sum array is:");
for (int i = 0; i < length; i++) {
	System.out.println("arr["+i+"]="+arr[i]+"\t sum["+i+"]="+sum_till_point[i]);
}*/


