import java.util.Random;

public class Main {
	
	public static void main (String[] args) {
		
		Random dice = new Random();
		
		int number;
		
		for(int counter=1; counter <=10; counter++) {
			
			number = 1 + dice.nextInt(6);  // w innym wypadku mielibyœmy wyniki od 0 - 5 a nie 1 - 6
			
			System.out.println(number + " ");
		}
		
	}

}
