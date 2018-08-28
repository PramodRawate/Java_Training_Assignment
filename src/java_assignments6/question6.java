/*
 * Write an application that returns a new String[] array containing the string form of these ibers, 
 * except for multiples of 3, use "Fizz" instead of the iber, 
 * for multiples of 5 use "Buzz", 
 * and for multiples of both 3 and 5 use "FizzBuzz". 
 * fizzBuzz(1, 6) :- ["1", "2", "Fizz", "4", "Buzz"]
 * fizzBuzz(1, 8) :- ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7"]
 * fizzBuzz(1, 11) :- ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"]
 * 
 */

package java_assignments6;
import java.util.Scanner;
public class question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		
		int start,end;
		String[] result;
		System.out.println("Enter start and end for-fizzBuzz(start,end):-");
		
		start=sc.nextInt();
		end=sc.nextInt();
		result=new String[end];

		int result_count=0;
		

		for(int i=start;i<end;i++)
		{
			if(i%3==0 && i%5==0)
				result[result_count++]="Fizzbuzz";
			else if(i%3==0)
				result[result_count++]="Fizz";
			else if(i%5==0)
				result[result_count++]="Buzz";
			else
				result[result_count++]=String.valueOf(i);
		}
		
		System.out.print("fizzBuzz("+start+","+end+") --> [ ");		
		for(int i=0;i<result_count;i++)
		{
			System.out.print("\""+result[i]+"\",");
		}
		System.out.print(" ]");
		

	}
	

}
