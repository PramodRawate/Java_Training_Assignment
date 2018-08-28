/*
 * 4.	Write a Java program to find and print the first 10 happy numbers.
 * Happy number: Starting with any positive integer, 
 * replace the number by the sum of the squares of its digits, 
 * and repeat the process until the number equals 1, 
 * or it loops endlessly in a cycle which does not include 1.
Example: 19 is a happy number
12 + 92=82
82 + 22=68
62 + 82=100
12 + 02 + 02=1

Example: 19 is a happy number
1 + 81=82
64 + 4=68
36 + 64=100
1 + 0 + 0=1


 */

package java_assignments2;


import java.util.Scanner;
public class question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=7895389,count=0,result=0,start=0;
		int i,temp;
		int remainder=0;
		boolean done=true;
	
		while(num/10!=0)
		{			
			System.out.println("num:="+num);
			System.out.println("op num%10:="+num%10);
		//	System.out.println("op Num/10:="+num/10);
			num=num/10;
			System.out.println("num/10:="+num);
			System.out.println("\n");
		}
		
		
/*		while(count!=10)
		{
			num=start;
			while(num/10!=0)
			{
				temp=num%10;
				result=result+(temp*temp);
				num=num/10;
			}
			result+=(num*num);
			if(result==1)
			{
				System.out.println(start+" is a happy Number.");
				count++;
				start++;
			}
			else
			{
				start++;
			}
		}
		*/
	}
}
