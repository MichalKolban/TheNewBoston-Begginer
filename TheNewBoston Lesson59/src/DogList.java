
public class DogList {
	
	private Dog[] theList = new Dog[5];
	
	private int i=0;
	
 
	public void add(Dog dog) {
		if(i<theList.length) {
			theList[i] = dog;
			System.out.println("Dog added at index " + i);
			i++;
		}
	}
}
