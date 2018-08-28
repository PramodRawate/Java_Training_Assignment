package java_assignements;

public class question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i < 100; i++) {
			if(i%3==0 && i%5==0)
				System.out.println(i+"\tDivisble by both 3 and 5");
			else if(i%3==0)
				System.out.println(i+"\t Divisible by 3");
			else if(i%5==0)
				System.out.println(i+"\t Divisible by 5");

		}
	}

}
