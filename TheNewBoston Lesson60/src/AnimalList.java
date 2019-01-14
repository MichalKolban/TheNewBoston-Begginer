
public class AnimalList {
	
	private Animal[] theList = new Animal[5];

	private int count = 0;
	
	public void add(Animal animal) {
		if(count<theList.length) {
			theList[count] = animal;
			System.out.println("Animal added at index " + count);
			count++;
		}
	}
}
