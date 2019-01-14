
public class Main {
	
	public static void main(String[] args) {
		
		// Check computer to find french.txt
		
		
		Create createFile = new Create();
		
		createFile.openFile();
		createFile.addRecords();
		createFile.closeFile();
	}

}
