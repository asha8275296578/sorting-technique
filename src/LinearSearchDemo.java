
public class LinearSearchDemo {
	public static void main(String[] args) {
		int[] intArray = new int[] {12, 45, 67, 78, 34, 90};
		int index;
		// search if 34 is available in the array
		for(index=0; index<intArray.length; index++) {
			if(intArray[index] == 10) {
				System.out.println("10 is found at " + index);
				break;
			}
		}
		if(index == intArray.length) {
			System.out.println("Element not found");
		}
	}
}

