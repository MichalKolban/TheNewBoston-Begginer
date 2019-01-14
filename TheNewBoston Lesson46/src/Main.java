
public class Main {
	
	public static void main(String[] args) {
	
	Club member1 = new Club("Rick", "Ross");
	Club member2 = new Club("Michael", "Scott");
	Club member3 = new Club("Jim","Halpert");

	System.out.println();
	System.out.println(member2.getFirstName());
	System.out.println(member2.getLastName());
	System.out.println(member2.getMembers());
	
	}
}
