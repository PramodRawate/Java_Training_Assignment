/*
 * 1.	You are driving a little too fast, and a police officer stops you. 
 * Write code to compute the result, encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket. 
 * If speed is 60 or less, the result is 0. 
 * If speed is between 61 and 80 inclusive, the result is 1. 
 * If speed is 81 or more, the result is 2. 
 * Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.
 */

package java_assignments6;

import java.util.Scanner;
public class question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter yur speed:");
		int speed=sc.nextInt();
		int result=0;
		
		System.out.println("Is today your bday");
		String bday=sc.next();
		
		if(bday=="yes"||bday=="YES")
		{
			if(speed<=60)
				result=0;
			else if(speed>60 && speed<80)
				result=1;
			else if(speed>=81)
				result=2;
		}
		else
		{
			speed=speed+5;
			if(speed<=60)
				result=0;
			else if(speed>60 && speed<80)
				result=1;
			else if(speed>=81)
				result=2;
		}	
		switch(result) 
		{		
			case 0:System.out.println("Speed:= "+speed+"\t Ticket:= "+result+"-No ticket");
					break;
			case 1:System.out.println("Speed:= "+speed+"\t Ticket:= "+result+"-Small Ticket");
					break;
			case 2:System.out.println("Speed:= "+speed+"\t Ticket:= "+result+"-Big Ticket");
					break;
			default:System.out.println("Error...Somethings wrong");
					break;
		}	
	}

}
