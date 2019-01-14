import java.util.Scanner;

public class Main {
	
	
	public static void main (String[] args ) {
		
		
		
		Scanner scanner = new Scanner(System.in);
		
		DogName dogSanta = new DogName();
		
		System.out.println("Enter your dog name: ");
		
		String dogName = scanner.nextLine();
		
		dogSanta.setName(dogName);
		
		dogSanta.message();
		
		
	}

}
