/*
 * We want to make a row of bricks that is goal inches long. 
 * We have a number of small bricks (1 inch each) and big bricks (5 inches each). 
 * Return true if it is possible to make the goal by choosing from the given bricks. 
 * makeBricks(3, 1, 8) :- true
 * makeBricks(3, 1, 9) :- false
 * makeBricks(3, 2, 10) :- true
 * 
 */

package java_assignments6;
import java.util.Scanner;
public class question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int goal,smallbricks,largebricks;
		
		boolean stop=false;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of small bricks:(1 brick:= 1 inch long)");
		smallbricks=sc.nextInt();
		
		System.out.println("Enter number of large bricks:(1 brick:= 5 inch long)");
		largebricks=sc.nextInt();
		
		System.out.println("Enter the inch length of goal row of bricks:");
		goal=sc.nextInt();
		int temp1=0,temp2=0;
		int i=0	;
		do
		{
			temp1+=1;
			i++;
		}while(i<smallbricks);
		
		i=0;
		do
		{
			temp2+=5;	
			i++;
		}while(i<largebricks);

		if(temp1==goal || temp2==goal ||temp1+temp2==goal)
			System.out.println("MagicBricks("+smallbricks+","+largebricks+","+goal+")--->TRUE");
		else
		{
			System.out.println("MagicBricks("+smallbricks+","+largebricks+","+goal+")--->FALSE");		
		}
	}
}
