import java.util.Formatter;

public class Create {
	
	private Formatter file;
	
	public void openFile() {
		
		try {
			
			file = new Formatter("french.txt");
		}
		catch(Exception e) {
			System.out.println("U re wrong dude");
		}
	}
	
	public void addRecords() {
		file.format("%s%s%s", "20 ", "bucky ", "roberts ");
	}
	
	public void closeFile() {
		file.close();
	}

}
