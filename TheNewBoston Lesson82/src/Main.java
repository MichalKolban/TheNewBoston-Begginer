import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int x = 1;
		do {
		try {
		System.out.println("Enter first number");
		
		int number1 = scanner.nextInt();
		
		System.out.println("Enter second number");
		
		int number2 = scanner.nextInt();
		
		int sum = number1 / number2;
		
		System.out.println(sum);
		
		x = 2;
		}
		catch (Exception e) {
			System.out.println("ERROR ERROR");
		}
			
		}while(x == 1);								// int x = 1 do while (x == 1) = infinity loop !
	}
}
