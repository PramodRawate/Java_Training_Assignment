//Write a Java program to takes the user for a distance (in meters) 
//and the time was taken (as three numbers: hours, minutes, seconds), 
//and display the speed in meters per second, kilometers per hour and miles per hour (hint: 1 mile = 1609 meters)
// ds.vs

//distance=speed*time;
package java_assignements;
import java.util.*;

public class question3 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double meter;
		double hours;
		double minutes;
		double seconds;
		
		double totalSec;
		double totalHours;
		
		double totalKms;
		double totalMiles;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter distance in meters:");
		meter=sc.nextDouble();
		
		System.out.println("Enter time in Hours-Minutes-Seocnds");
		hours=sc.nextDouble();
		minutes=sc.nextDouble();
		seconds=sc.nextDouble();
	
		totalSec=(hours*3600)+(minutes*60)+seconds;
		totalHours=hours+(minutes*0.0166666667)+(seconds*0.000277777778);

		totalKms=meter*0.0001;
		totalMiles=meter*0.000621371192;
		
		System.out.print("Speed in M/s:- ");
		System.out.print(meter/totalSec);
		
		System.out.println("\n");
		System.out.print("Speed in Km/Hr:- ");
		System.out.print(totalKms/totalHours);

		System.out.println("\n");
		System.out.print("Speed in Miles/Hr:- ");
		System.out.print(totalMiles/totalHours);
		
	
	}

}
