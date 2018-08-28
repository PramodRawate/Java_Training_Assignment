
public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Person("Pramod",22);
//		p.setName();
//		p.setAge(22);
		System.out.println("Name :-"+p.getName());
		System.out.println("Age :-"+p.getAge());
		
		Person p2=new Person("Akhilesh",60);
//		p2.setName();
//		p2.setAge();
		System.out.println("Name :-"+p2.getName());
		System.out.println("Age :-"+p2.getAge());
	}
}

