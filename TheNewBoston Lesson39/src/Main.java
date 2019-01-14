
public class Main {
	
	public static void main(String[] args) {
		
		Hello helloObject1 = new Hello();
		Hello helloObject2 = new Hello(5);
		Hello helloObject3 = new Hello(5,13);
		Hello helloObject4 = new Hello(5,13,44);
		
		System.out.printf("%s\n", helloObject1.displayTime());
		System.out.printf("%s\n", helloObject2.displayTime());
		System.out.printf("%s\n", helloObject3.displayTime());
		System.out.printf("%s\n", helloObject4.displayTime());
	}

}
