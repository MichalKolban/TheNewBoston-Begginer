import java.io.File;

public class Main {
	
	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\Micha³\\Desktop\\TheNewBoston.txt");
		
		if(file.exists()) {
			System.out.println(file.getName() + " file exists !");
		}else {
			System.out.println("File doesn't exist");
		}
		
	}

}
