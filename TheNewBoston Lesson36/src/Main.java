

public class Main {
	
	public static void main(String[] args) {
		
		HelloTime timeObj = new HelloTime();
		
		System.out.println(timeObj.militaryTime());
		
		timeObj.setTime(12, 7, 12);

		System.out.println(timeObj.militaryTime());
		
	}

}
