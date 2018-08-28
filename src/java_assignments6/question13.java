/*
 * 13.	We want make a package of goal kilos of chocolate. We have small bars (1 kilo each) and big bars (5 kilos each). Return the number of small bars to use, assuming we always use big bars before small bars. Return -1 if it can't be done.
 * makeChocolate(4, 1, 9) -> 4
 * maeChocolate(4, 1, 10) -> -1
 * makeChocolate(4, 1, 7) -> 2
 * 
 */
package java_assignments6;
import java.util.Scanner;
public class question13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int goal,smallbars,largebars;
		boolean stop=false;

		System.out.println("Enter number of small choco bars:(1 bar:= 1 Kg)");
		smallbars=sc.nextInt();
		
		System.out.println("Enter number of large choco bars:(1 brick:= 5 Kg)");
		largebars=sc.nextInt();
		
		System.out.println("Enter the goal -Kilos of chocolate:");
		goal=sc.nextInt();
		
		System.out.println("MakeChocolate(smallb,largeba,goal)--->"+" Number of smallBars");
		System.out.println("******************************************************************");
		int temp=0,temp2=0;
		int i=0;
		
		do
		{
			temp+=5;	
			i++;
		}while(temp<=goal && i<largebars);
		
		if(largebars==goal)
			System.out.println("\t\tMakeChocolate("+smallbars+","+largebars+","+goal+")--->"+" 0");
		else
		{
			i=0;
			do
			{
				temp+=1;
				i++;
			}while(i<smallbars && temp<goal);
			
			if(temp==goal)
				System.out.println("\t\tMakeChocolate("+smallbars+","+largebars+","+goal+")--->"+ i);
			else
				System.out.println("\t\tMakeChocolate("+smallbars+","+largebars+","+goal+")--->"+" -1");
		}
	}
}
