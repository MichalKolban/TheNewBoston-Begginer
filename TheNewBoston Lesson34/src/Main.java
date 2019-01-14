
public class Main {
	
	public static void main (String[] args) {
		
		int firstArray[][] = {{23,3,4,5,3},{1,2,3,5,6}};
		
		int secondArray [][] = {{30,31,32,33},{44},{4,5,6}};
		
		System.out.println("This is 1st array" );
		displayArray(firstArray);
		
		
		System.out.println("This is second array");
		displayArray(secondArray);
		
	}
		
		public static void displayArray(int arrayhere[][]) {
			
			for(int row = 0; row <arrayhere.length; row++) {
				for(int column = 0 ; column < arrayhere[row].length; column++) {
					System.out.print(arrayhere[row][column]+"\t");
				}
				System.out.println();
			}
		}
		
	

}
