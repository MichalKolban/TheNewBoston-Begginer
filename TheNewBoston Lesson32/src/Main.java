
public class Main {
	
	public static void main(String[] args) {
		
		int[] numbers = {2,3,5,7,8,54};
		
		
		change(numbers);    									// + 5 kazdy element
		
		for(int counter : numbers) {
			System.out.println(counter);
		}
	}
	

	
	public static void change(int tableFive[]) {
		
		for(int count =0; count<tableFive.length; count++) {	// metoda dodaje +5 do ka¿dego elementu w tabeli
			tableFive[count] += 5;
		}
	}
}
