/*
 * 2.	We are having a party with amounts of tea and candy.
 *  Return the int outcome of the party encoded as 0=bad, 1=good, or 2=great.
 *  A party is good (1) if both tea and candy are at least 5.
 *  However, if either tea or candy is at least double the amount of the other one, the party is great (2).
 *  However, in all cases, if either tea or candy is less than 5, the party is always bad (0).
 *  teaParty(6,8) :- 1
 *	teaParty(3, 8) :- 0
 *	teaParty(20, 6) :- 2
 */



package java_assignments6;
import java.util.Scanner;
public class question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);

		
		int tea,candy;
		System.out.println("Enter the amount of TEA for the party:");
		tea=sc.nextInt();
		
		System.out.println("Enter the amount of CANDY for the party:");
		candy=sc.nextInt();

		System.out.println("Party(Tea,Candy)\t Party Rating");
		System.out.println("***************************************");
		if(tea<5 || candy<5)
			System.out.println("Party("+tea+","+candy+")\t\t 0");
		else if(tea>(candy*2) || candy>(tea*2))
			System.out.println("Party("+tea+","+candy+")\t\t 2");
		else
			System.out.println("Party("+tea+","+candy+")\t\t 1");
	}
	

}
