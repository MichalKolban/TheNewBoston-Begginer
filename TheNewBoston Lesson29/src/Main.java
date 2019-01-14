
public class Main {
	
	public static void main(String[] args) {
		
		int[] numbers = {23,56,544,5678,33,23};
		
		int sum = 0;
		
		for(int count = 0; count < numbers.length ; count++) {
			
			sum += numbers[count];
	
		}
		
		System.out.println(sum);
		
		int avarage = sum / numbers.length;
		
		System.out.println(avarage);
		
		
		
	}
	
	

}
