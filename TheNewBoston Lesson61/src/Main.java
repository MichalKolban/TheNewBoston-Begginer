
public class Main {
	
	public static void main(String[] args) {
		
		
		Animal[] animalList = new Animal[2];
		
		Dog dog = new Dog();
		
		Fish fish = new Fish();
		
		animalList[0] = dog;
		animalList[1] = fish;
		
		for(Animal ani : animalList) {
			ani.noise();
		}
	}

}
