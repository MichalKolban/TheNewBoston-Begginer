
public class Main {
	
	public static void main(String[] args){
		
		
		Pack pack = new Pack(10);
		
		for(int i = 0; i<5; i++) {
			pack.add();
			System.out.printf("%s", pack);
		}
		
	}

}
