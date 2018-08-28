import java.lang.management.MemoryNotificationInfo;
import java.util.Scanner;
public class Dictionary {

	Scanner sc=new Scanner(System.in);
	private String name;
	private String[] meaning;

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dictionary dict[]=new Dictionary[2];
		
		for (int i = 0; i < dict.length; i++) {
			dict[i]=new Dictionary();
		}
		for (int i = 0; i < dict.length; i++) {
			dict[i].addWord();
		}
		for (Dictionary dictionary : dict) {
			dictionary.displayDictionary();
		}
	}

	public void addWord() {
		int meaningcount;
		System.out.println("Enter word:");
		this.name=sc.nextLine();
		System.out.println("How many meaning does "+this.name+" have ?");
		meaningcount=sc.nextInt();
		sc.nextLine();
		this.meaning=new String[meaningcount];
		for (int i = 0; i < meaningcount; i++) {
			System.out.println("Enter meaning of word:");
			this.meaning[i]=sc.nextLine();
		}
	}
	

	private void displayDictionary() {
		// TODO Auto-generated method stub
		System.out.print("\nWord:- "+this.name+"\t"+"Meaning:-[");
		for (String string : meaning) {
			System.out.print(string+",");
		}
		System.out.print("]");
	}
}
