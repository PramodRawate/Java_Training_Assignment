package hotel;

public class GenerateBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Guest_Bill gb[]=new Guest_Bill[3];
		for(int i=0;i<gb.length;i++)
		{
			gb[i]=new Guest_Bill();
		}
		for (Guest_Bill guest_Bill : gb) {
			guest_Bill.setGuestDetails();
			System.out.println("\n");
			guest_Bill.getGuestDetails();
			System.out.println("\n");
		}
		System.out.println("\n\n\n");
		System.out.println("**************************************************************");
		System.out.println("\t\t\tHotel Paradise\t\t\t");
		System.out.println("**************************************************************");
		for (Guest_Bill guest_Bill : gb) {
			guest_Bill.generateBill();
		}
	}

}
