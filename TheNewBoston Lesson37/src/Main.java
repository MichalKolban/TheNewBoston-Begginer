
public class Main {
	
	public static void main(String[] args) {
		
		Time timeObject = new Time();
		
		System.out.println(timeObject.toNormalTime()); // deafult time set !
		
		timeObject.setTime(13, 23, 2);
		
		System.out.println(timeObject.toNormalTime());
		
		System.out.println(timeObject.militaryTime());
		
	}

}
