
public class Main {

	public static void main(String[] args) {
		
		ReadFile readfile = new ReadFile();
		
		readfile.openFile();
		readfile.readFile();
		readfile.closeFile();
	}
}
