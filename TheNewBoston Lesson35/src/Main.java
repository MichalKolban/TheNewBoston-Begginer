
public class Main {
	
	
	public static void main(String[] args) {
		
		System.out.println(avarage(45,64,23,21,2,2,2,2,2));
		
		System.out.println(avarage(2,3,4,45));
		
		System.out.println(avarage(34,645,3222222));
		
	}
	
	public static int avarage (int...numbers) { 		// ... - oznacza ¿e mo¿esz podaæ tyle argumentów ile chcesz
		int total = 0;
		for(int x : numbers)
			total += x;
		
		return total/numbers.length;
	}

}
