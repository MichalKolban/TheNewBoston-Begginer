
public class Main {
	
	public static void main(String[] args) {
		
		int[] numbers = {2,5,6,7,88,12};
		int sum = 0;
		
		for(int count : numbers) {
			sum += count;
		}
		
		System.out.println(sum);
		
		System.out.println(sum / numbers.length);
	}

}
