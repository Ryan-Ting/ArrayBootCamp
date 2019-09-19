/**
 * AP CmpSci 2019-2020
 * ArrayBootCamp
 * Various arrays that play with orders of elements in an array.
 * 
 * @author Ryan Ting
 * @version September 11, 2019
 * @see ArrayUtility
 * @see ArrayDriver2D
 */
public class ArrayDriver {

	/** ArrayX is the array that will be used for every method run. **/
	private static int[] arrayX;		// Declares an array

	/**
	 * Main method exercises the ArrayUtility class.
	 * @param args Command line arguments (not used)
	 */
	public static void main(String[] args) {
		
		arrayX = ArrayUtility.init(15);		// Gives the array a length
		
		separator("names");
		ArrayUtility.names();		// Calls the names method
		separator("*****");
		
//\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/
		
		separator("zeroInit");
		ArrayUtility.zeroInit(arrayX);		// Calls and displays zeroInit
		ArrayUtility.displayArray(arrayX);
		separator("********");
		
//\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/
		
		separator("orderedInit");
		ArrayUtility.orderedInit(arrayX);		// Calls and displays orderedInit
		ArrayUtility.displayArray(arrayX);
		separator("***********");
		
//\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/
		
		separator("randomInit");
		ArrayUtility.randomInit(arrayX);		// Calls and displays randomInit
		ArrayUtility.displayArray(arrayX);
		separator("**********");
		
//\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/
		
		int input1 = Input.readNum("\nEnter first index to switch: " , 0, arrayX.length - 1);
		int input2 = Input.readNum("\nEnter second index to switch: " , 0, arrayX.length - 1);		// Normal test case (length of 15)
		separator("swapElements");
		ArrayUtility.randomInit(arrayX);
		ArrayUtility.displayArray(arrayX);
		ArrayUtility.swapElements(arrayX, input1, input2);
		ArrayUtility.displayArray(arrayX);
		
		arrayX = ArrayUtility.init(2);		// Test case with a length of 2
		System.out.print("\n");
		ArrayUtility.randomInit(arrayX);
		ArrayUtility.displayArray(arrayX);
		ArrayUtility.swapElements(arrayX, 0, 1);
		ArrayUtility.displayArray(arrayX);
		separator("************");
		
//\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/
		
		arrayX = ArrayUtility.init(15);
		int input3 = Input.readNum("\nEnter index of desired number to move to the end: " , 0, arrayX.length - 1);		// Normal test case
		ArrayUtility.randomInit(arrayX);
		ArrayUtility.displayArray(arrayX);
		ArrayUtility.removeElement(arrayX, input3);
		ArrayUtility.displayArray(arrayX);
		
		arrayX = ArrayUtility.init(2);		// Test case with a length of 2
		System.out.print("\n");
		ArrayUtility.randomInit(arrayX);
		ArrayUtility.displayArray(arrayX);
		ArrayUtility.removeElement(arrayX, 0);
		ArrayUtility.displayArray(arrayX);
		
		arrayX = ArrayUtility.init(1);		// Test case with a length of 1
		System.out.print("\n");
		ArrayUtility.randomInit(arrayX);
		ArrayUtility.displayArray(arrayX);
		ArrayUtility.removeElement(arrayX, 0);
		ArrayUtility.displayArray(arrayX);
		separator("*************");
		
//\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/
		
		arrayX = ArrayUtility.init(15);		// Test case with an odd length
		separator("reverseArray");
		ArrayUtility.randomInit(arrayX);
		ArrayUtility.displayArray(arrayX);
		ArrayUtility.reverseArray(arrayX);
		ArrayUtility.displayArray(arrayX);
		
		arrayX = ArrayUtility.init(16);		// Test case with an even length
		System.out.print("\n");
		ArrayUtility.randomInit(arrayX);
		ArrayUtility.displayArray(arrayX);
		ArrayUtility.reverseArray(arrayX);
		ArrayUtility.displayArray(arrayX);
		
		arrayX = ArrayUtility.init(2);		// Test case with a length of 2
		System.out.print("\n");
		ArrayUtility.randomInit(arrayX);
		ArrayUtility.displayArray(arrayX);
		ArrayUtility.reverseArray(arrayX);
		ArrayUtility.displayArray(arrayX);
		
		arrayX = ArrayUtility.init(1);		// Test case with a length of 1
		System.out.print("\n");
		ArrayUtility.randomInit(arrayX);
		ArrayUtility.displayArray(arrayX);
		ArrayUtility.reverseArray(arrayX);
		ArrayUtility.displayArray(arrayX);
		separator("************");
		
//\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/

		arrayX = new int[] {1, 4, 2, 1, 5, 1, 2};		// Test case with 3 found numbers
		separator("searchArray");
		int found = ArrayUtility.searchArray(arrayX, 1);
		ArrayUtility.displayArray(arrayX);
		System.out.printf("1 was found at %d\n", found);
		
		arrayX = new int[] {1, 4, 2, 3, 5, 6, 2};		// Test case with 1 found number
		System.out.print("\n");
		int found2 = ArrayUtility.searchArray(arrayX, 1);
		ArrayUtility.displayArray(arrayX);
		System.out.printf("1 was found at %d\n", found2);
		
		arrayX = new int[] {5, 4, 2, 3, 5, 6, 2};		// Test case with no found numbers
		System.out.print("\n");
		int found3 = ArrayUtility.searchArray(arrayX, 1);
		ArrayUtility.displayArray(arrayX);
		System.out.printf("searchArray returned a %d\n", found3);
		separator("************");
		
//\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/

		arrayX = ArrayUtility.init(15);		// Normal test case
		separator("calcSum");
		ArrayUtility.randomInit(arrayX);
		int summ = ArrayUtility.calcSum(arrayX);
		ArrayUtility.displayArray(arrayX);
		System.out.println("The sum of the numbers is " + summ);

		arrayX = ArrayUtility.init(1);		// Test case with a length of 1
		System.out.print("\n");
		ArrayUtility.randomInit(arrayX);
		int sum = ArrayUtility.calcSum(arrayX);
		ArrayUtility.displayArray(arrayX);
		System.out.println("The sum of the numbers is " + sum);
		separator("*******");
		
//\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/

		arrayX = ArrayUtility.init(15);
		separator("calcAverage");
		ArrayUtility.randomInit(arrayX);
		double avg = ArrayUtility.calcAverage(arrayX);
		ArrayUtility.displayArray(arrayX);
		System.out.printf("The average of the numbers is %.1f\n", avg);
		
		arrayX = ArrayUtility.init(2);		// Test case with a length of 2
		System.out.print("\n");
		ArrayUtility.randomInit(arrayX);
		double avg2 = ArrayUtility.calcAverage(arrayX);
		ArrayUtility.displayArray(arrayX);
		System.out.printf("The average of the numbers is %.1f\n", avg2);
		
		arrayX = ArrayUtility.init(1);		// Test case with a length of 1
		System.out.print("\n");
		ArrayUtility.randomInit(arrayX);
		double avg3 = ArrayUtility.calcAverage(arrayX);
		ArrayUtility.displayArray(arrayX);
		System.out.printf("The average of the numbers is %.1f\n", avg3);
		separator("***********");
		
//\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/

		arrayX = ArrayUtility.init(15);
		separator("findLowest");
		ArrayUtility.randomInit(arrayX);
		ArrayUtility.displayArray(arrayX);
		int low = ArrayUtility.findLowest(arrayX);
		System.out.printf("The lowest number was found at %d\n", low);
		
		arrayX = ArrayUtility.init(2);		// Test case with a length of 2
		System.out.print("\n");
		ArrayUtility.randomInit(arrayX);
		ArrayUtility.displayArray(arrayX);
		int low2 = ArrayUtility.findLowest(arrayX);
		System.out.printf("The lowest number was found at %d\n", low2);
		
		arrayX = ArrayUtility.init(1);		// Test case with a length of 1
		System.out.print("\n");
		ArrayUtility.randomInit(arrayX);
		ArrayUtility.displayArray(arrayX);
		int low3 = ArrayUtility.findLowest(arrayX);
		System.out.printf("The lowest number was found at %d\n", low3);
		
		
		arrayX = new int[] {6, 4, 4, 5, 23, 42};		// Test case with 2 lowest numbers
		System.out.print("\n");
		ArrayUtility.displayArray(arrayX);
		int low4 = ArrayUtility.findLowest(arrayX);
		System.out.printf("The lowest number was found at %d\n", low4);
		separator("**********");
		
//\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/

		arrayX = ArrayUtility.init(15);
		separator("findHighest");
		ArrayUtility.randomInit(arrayX);
		ArrayUtility.displayArray(arrayX);
		int high = ArrayUtility.findHighest(arrayX);
		System.out.printf("The highest number was found at %d\n", high);
		
		arrayX = ArrayUtility.init(2);		// Test case with a length of 2
		System.out.print("\n");
		ArrayUtility.randomInit(arrayX);
		ArrayUtility.displayArray(arrayX);
		int high2 = ArrayUtility.findHighest(arrayX);
		System.out.printf("The highest number was found at %d\n", high2);
		
		arrayX = ArrayUtility.init(1);		// Test case with a length of 1
		System.out.print("\n");
		ArrayUtility.randomInit(arrayX);
		ArrayUtility.displayArray(arrayX);
		int high3 = ArrayUtility.findHighest(arrayX);
		System.out.printf("The highest number was found at %d\n", high3);
		
		
		arrayX = new int[] {1, 4, 42, 1, 23, 42};		// Test case with 2 highest numbers
		System.out.print("\n");
		ArrayUtility.displayArray(arrayX);
		int high4 = ArrayUtility.findHighest(arrayX);
		System.out.printf("The highest number was found at %d\n", high4);
		separator("***********");
		
//\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/

		arrayX = ArrayUtility.init(15);
		separator("sortArrayAscending");
		ArrayUtility.randomInit(arrayX);
		ArrayUtility.displayArray(arrayX);
		ArrayUtility.sortArrayAscending(arrayX);
		ArrayUtility.displayArray(arrayX);
			
		ArrayUtility.orderedInit(arrayX);		// Test case that is already ordered
		System.out.print("\n");
		ArrayUtility.displayArray(arrayX);
		ArrayUtility.sortArrayAscending(arrayX);
		ArrayUtility.displayArray(arrayX);
		
		arrayX = ArrayUtility.init(1);		// Test case with a length of 1
		System.out.print("\n");
		ArrayUtility.randomInit(arrayX);
		ArrayUtility.displayArray(arrayX);
		ArrayUtility.sortArrayAscending(arrayX);
		ArrayUtility.displayArray(arrayX);
		
		arrayX = ArrayUtility.init(2);		// Test case with a length of 2
		System.out.print("\n");
		ArrayUtility.randomInit(arrayX);
		ArrayUtility.displayArray(arrayX);
		ArrayUtility.sortArrayAscending(arrayX);
		ArrayUtility.displayArray(arrayX);
		separator("*******************");
		
//\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/
		
		arrayX = ArrayUtility.init(15);
		separator("sortArrayDescending");
		ArrayUtility.randomInit(arrayX);
		ArrayUtility.displayArray(arrayX);
		ArrayUtility.sortArrayDescending(arrayX);
		ArrayUtility.displayArray(arrayX);
					
		ArrayUtility.orderedInit(arrayX);		// Test case that is already ordered	
		ArrayUtility.reverseArray(arrayX);
		System.out.print("\n");
		ArrayUtility.displayArray(arrayX);
		ArrayUtility.sortArrayDescending(arrayX);
		ArrayUtility.displayArray(arrayX);
		
		arrayX = ArrayUtility.init(1);		// Test case with a length of 1
		System.out.print("\n");
		ArrayUtility.randomInit(arrayX);
		ArrayUtility.displayArray(arrayX);
		ArrayUtility.sortArrayDescending(arrayX);
		ArrayUtility.displayArray(arrayX);
		
		arrayX = ArrayUtility.init(2);		// Test case with a length of 2
		System.out.print("\n");
		ArrayUtility.randomInit(arrayX);
		ArrayUtility.displayArray(arrayX);
		ArrayUtility.sortArrayDescending(arrayX);
		ArrayUtility.displayArray(arrayX);
		separator("*******************");
	}

//\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/
	/**
	 * The separator method prints out a star separator line.
	 * @param s A string of stars to make sure each separator line is the same.
	 */
	public static void separator(String s)
	{
		System.out.printf("\n%s**************************************************************************************\n\n", s);
	}
}