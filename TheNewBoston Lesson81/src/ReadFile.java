import java.io.File;
import java.util.Scanner;

public class ReadFile {
	
	private Scanner scanner;
	
	public void openFile() {
		
		try {
			scanner = new Scanner(new File("C:\\Users\\Micha³\\Desktop\\Names.txt"));
		}
		catch (Exception e) {
			System.out.println("Wrong file dude!");
		}
	}
	
	public void readFile() {
		while(scanner.hasNext()) {
			String line1 = scanner.next();
			String line2 = scanner.next();
			String line3 = scanner.next();
			
			System.out.printf("%s %s %s\n", line1,line2,line3);
		}
	}
	
	public void closeFile() {
		scanner.close();
	}

}
