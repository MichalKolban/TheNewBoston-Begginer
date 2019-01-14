
public class Main {

	public static void main(String[] args) {
		
		String a = "Apples";
		String b = "peaches";
		String c = "PEACHES";
		
		if(a.equals("Apples")) {
			System.out.println("it equals apples");
		}
		
		if(b.equals(c)) {
			System.out.println("it's a match !");
		}else {
			System.out.println("Sorry dude it's wrong !");
		}
		
		if(b.equalsIgnoreCase(c)) {
			System.out.println("It's a match!");
		}else {
			System.out.println("Sorry dude y are wrong!");
		}
	}
}
