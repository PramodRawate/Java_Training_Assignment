package java_assignements;
import java.util.*;
public class question5 {

/*	static void bubbleSort(int arr[])
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
	*/

	static void display(int arr[],int length)
	{
		for (int i = 0; i < length; i++) {
			System.out.print(arr[i]+"\t");
		}		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int[] a1;
		int[] a2;

		int[] common;
		int num1,num2;
		
		int count=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number of elements in Array-1");
		num1=sc.nextInt();
		a1=new int[num1];
		common=new int[num1];
		
		System.out.println("Enter elements in Array 1");
		for (int i = 0; i < num1; i++) {
			a1[i]=sc.nextInt();
		}
		
		System.out.println("Enter number of elements in Array-2");
		num2=sc.nextInt();
		a2=new int[num2];

		System.out.println("Enter elements in Array 2");
		for (int i = 0; i < num1; i++) {
			a2[i]=sc.nextInt();
		}
		
//		bubbleSort(a1);
		System.out.println("Array 1");
		display(a1, num1);
		System.out.println("\n");
		
//		bubbleSort(a2);
		System.out.println("Array 2");
		display(a2, num2);
		System.out.println("\n");
	
		int greater;		
		for(int i=0;i<num1;i++)
		{
			int var=a1[i];
			for(int j=0;j<num2;j++)
			{
				if(var==a2[j])
				{
					common[count]=var;
					count++;
					break;
				}
			}
		}
		System.out.println("Total common elements in both arrays:- "+count);
		System.out.print("Common elements are:-");
		display(common, count);
	}
	
/*	
  	a  as m ms t | ms m  as  a  as | m   ms  t  
	1  2  3  4 5 | 6  7  8   9  10 |11  12  13
	*/

	
	


}
