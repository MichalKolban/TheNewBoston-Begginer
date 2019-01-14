
public class DogName {
	
	private String dogName;
	
	
	public void setName(String name) {
		dogName = name;
	}
	
	public String getName() {
		return dogName;
	}
	
	public void message() {
		System.out.println("Your dog name is : " + getName());
	}

}
