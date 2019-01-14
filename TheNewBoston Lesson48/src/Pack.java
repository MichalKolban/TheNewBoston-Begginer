
public class Pack {

	private int sum;
	private final int NUMBER;
	
	public Pack(int num) {
		NUMBER = num;
	}
	
	public void add() {
		sum+=NUMBER;
	}
	
	public String toString() {
		return String.format("sum = %d\n", sum );
	}
	
}
