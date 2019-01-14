
public class Club {
	
	private String firstName;
	private String lastName;
	private static int members = 0;
	
	public Club(String firstN, String lastN) {
		firstName = firstN;
		lastName = lastN;
		members++;
		System.out.printf("Constructor for %s %s, members in the club : %d\n", firstN, lastN, members);
	}

	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public static int getMembers() {
		return members;
	}
	
}
