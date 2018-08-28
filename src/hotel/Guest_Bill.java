package hotel;

import java.util.Scanner;
public class Guest_Bill {

	private String guestName;
	private String month;
	private double roomRent;
	private double foodCost;
	private double DiscountedRoomPrice;
	private double DiscountFoodPrice;

	Scanner sc=new Scanner(System.in);
	
	public void getGuestDetails() {
		System.out.println("Guest Name:-"+this.guestName);
		System.out.println("Month of Registration:-"+this.month);
		System.out.println("Room Rent:-"+this.roomRent);
		System.out.println("Food Cost:-"+this.foodCost);
		if(this.month=="Nov" || this.month=="Dec" || this.month=="Jan" || this.month=="Feb" || this.month=="Mar")
		{	
			this.DiscountedRoomPrice=(roomRent*50)/100;
			this.DiscountFoodPrice=(foodCost*20)/100;
		}
		else if(this.month=="Apr" || this.month=="May" || this.month=="Jun" || this.month=="July" || this.month=="Aug")
		{
			this.DiscountedRoomPrice=(roomRent*20)/100;
			this.DiscountFoodPrice=(foodCost*10)/100;
		}
		else 
		{
			this.DiscountedRoomPrice=(roomRent*10)/100;
			this.DiscountFoodPrice=(foodCost*5)/100;
		} 
		System.out.println("Discounted Room Rent:-"+(this.roomRent-this.DiscountedRoomPrice));
		System.out.println("Discounted Food Cost:-"+(this.foodCost-this.DiscountFoodPrice));
	}
	
	public void setGuestDetails() {
		System.out.println("Enter guest Name:");
		this.guestName=sc.nextLine();
		System.out.println("Enter Month of Booking:");
		this.month=sc.nextLine();
		System.out.println("Enter Room rent:");
		this.roomRent=sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter Food cost:");
		this.foodCost=sc.nextDouble();
		sc.nextLine();
	}
	
	public void generateBill() {
		// TODO Auto-generated method stub
		System.out.print(this.guestName);
		System.out.println("\n");
		System.out.println("\t\tRoom Rent:-"+this.roomRent);
		System.out.println("\t\tFood Cost:-"+this.foodCost);
		System.out.println("\t\tDiscount");
		System.out.println("\t\tFood:-"+this.DiscountFoodPrice);
		System.out.println("\t\tRoom:-"+this.DiscountedRoomPrice);
		System.out.println("\t\t---------------------------------");
		System.out.println("\t\tTotal:-"+(this.DiscountedRoomPrice+this.DiscountFoodPrice));
		System.out.println("\t\t---------------------------------");
		System.out.println("\n");
	}

	
}
