import java.util.Formatter;

public class Main {

	public static void main(String[] args) {
		
		final Formatter file;
		
		try {
			
			file = new Formatter("hello.txt");
			System.out.println("You created the file!");
		}
		catch(Exception e) {
			System.out.println("Error dude");
		}
	}
}
