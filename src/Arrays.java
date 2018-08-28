import java.util.*;
public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int intArrays[];
		intArrays=new int[5];
		System.out.println("Enter Array values:-");
		for(int i=0;i<5;i++)
		{
			intArrays[i]=sc.nextInt();
		}
		System.out.println("\n\nArray values are :-");
		for (int i : intArrays) {
			System.out.println(i);
		}
		sc.close();
		
		
		
		Person persons[];
		persons=new Person[3];
		persons[0]=new Person();
		persons[1]=new Person();
		persons[2]=new Person();
		
		persons[0].setName("Shubham");
		persons[1].setName("Pramod");
		persons[2].setName("Akhilesh");
		persons[0].setAge(90);
		persons[1].setAge(22);
		persons[2].setAge(100);
		
		for(Person person:persons)
		{
			System.out.println("Name :- "+person.getName());
			System.out.println("Age :- "+person.getAge());
		}
	}

}
