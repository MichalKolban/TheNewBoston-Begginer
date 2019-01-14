
public class Box {

	
	private String name;
	private MonthDayYear birthday;
	
	public Box(String theName, MonthDayYear theBirthday) {
		name = theName;
		birthday = theBirthday;
	}
	
	public String toString() {
		return String.format("My name is %s, my birthday is %s", name, birthday);
	}
}
