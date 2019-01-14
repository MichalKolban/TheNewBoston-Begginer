import java.util.Random;

public class Main {

	public static void main (String[] args) {
		
		// another dice roller game
		
		Random random = new Random();
		
		int frequency[] = new int[7];
		
		for(int roll = 1; roll < 100 ; roll++) {
			
			++frequency[1+random.nextInt(6)];        //1+random.nextInt(6) numbers 1-6
		}											// ++frequency dodaje 1 do ka¿dego indeksu
		
		System.out.println("Dice" + "\t" + "Frequency" );
		
		for(int dice=1; dice<frequency.length; dice++) {
			System.out.println(dice + "\t" + frequency[dice]);
		}
	}
	
}
