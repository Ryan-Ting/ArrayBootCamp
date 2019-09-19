/**
 * AP CmpSci 2019-2020
 * ArrayBootCamp
 * Various arrays that play with orders of elements in an array.
 * 
 * @author Ryan Ting
 * @version September 11, 2019
 * @see ArrayDriver
 * @see ArrayUtility
 */
public class ArrayDriver2D {

	/** Array Y is the array that will be used for the methods. */
	private static int[][] arrayY;
	
	/**
	 * Main method exercises the ArrayUtility class.
	 * @param args Command line arguments (not used)
	 */
	public static void main(String[] args) {
		
		int[][]sumArr;		// Array to hold the sums in calcSum
		
		separator("orderedInit");							// Test cases for orderedInit
		arrayY = ArrayUtility.init(5, 5);
		ArrayUtility.orderedInit(arrayY);
		ArrayUtility.displayArray(arrayY);
		
		arrayY = ArrayUtility.init(2, 4);
		ArrayUtility.orderedInit(arrayY);
		ArrayUtility.displayArray(arrayY);
		separator("");
		
//010010010110010101011011001010100100101011101010101010010101010101010101010010101011010110101001001010101010100111010101010101010110101001010010101010111101010
	
		separator("zeroInit");					// Test cases for zeroInit
		arrayY = ArrayUtility.init(2, 2);
		ArrayUtility.zeroInit(arrayY);
		ArrayUtility.displayArray(arrayY);
		
		arrayY = ArrayUtility.init(4, 9);
		ArrayUtility.zeroInit(arrayY);
		ArrayUtility.displayArray(arrayY);
		separator("");
		
//010010010110010101011011001010100100101011101010101010010101010101010101010010101011010110101001001010101010100111010101010101010110101001010010101010111101010

		separator("randomInit");					// Test cases for randomInit
		arrayY = ArrayUtility.init(3, 3);
		ArrayUtility.randomInit(arrayY);
		ArrayUtility.displayArray(arrayY);
		
		arrayY = ArrayUtility.init(5, 6);
		ArrayUtility.randomInit(arrayY);
		ArrayUtility.displayArray(arrayY);
		separator("");
		
//010010010110010101011011001010100100101011101010101010010101010101010101010010101011010110101001001010101010100111010101010101010110101001010010101010111101010

		separator("calcSum");					// Test cases for calcSum
		arrayY = ArrayUtility.init(2, 5);
		sumArr = ArrayUtility.init(1, arrayY[0].length);
		ArrayUtility.displayArray(arrayY);
		System.out.println("Sum:");
		sumArr = ArrayUtility.calcSum(arrayY);
		ArrayUtility.displayArray(sumArr);
		System.out.print("\n");
		
		arrayY = ArrayUtility.init(7, 2);
		ArrayUtility.randomInit(arrayY);
		ArrayUtility.displayArray(arrayY);
		System.out.println("Sum:");
		sumArr = ArrayUtility.calcSum(arrayY);
		ArrayUtility.displayArray(sumArr);
		System.out.print("\n");
		
		arrayY = ArrayUtility.init(7, 7);
		ArrayUtility.orderedInit(arrayY);
		ArrayUtility.displayArray(arrayY);
		System.out.println("Sum:");
		sumArr = ArrayUtility.calcSum(arrayY);
		ArrayUtility.displayArray(sumArr);
		System.out.print("\n");
		
		arrayY = ArrayUtility.init(2, 10);
		ArrayUtility.orderedInit(arrayY);
		ArrayUtility.displayArray(arrayY);
		System.out.println("Sum:");
		sumArr = ArrayUtility.calcSum(arrayY);
		ArrayUtility.displayArray(sumArr);
		System.out.print("\n");
		separator("");
		
//010010010110010101011011001010100100101011101010101010010101010101010101010010101011010110101001001010101010100111010101010101010110101001010010101010111101010
		
		separator("calcAverage");					// Test cases for calcAverage
		arrayY = ArrayUtility.init(5, 10);
		ArrayUtility.orderedInit(arrayY);
		double avg = ArrayUtility.calcAverage(arrayY);
		ArrayUtility.displayArray(arrayY);
		System.out.println("Average: " + avg + "\n");
		
		arrayY = ArrayUtility.init(5, 5);
		ArrayUtility.orderedInit(arrayY);
		avg = ArrayUtility.calcAverage(arrayY);
		ArrayUtility.displayArray(arrayY);
		System.out.println("Average: " + avg + "\n");
		
		arrayY = ArrayUtility.init(1, 1);
		ArrayUtility.randomInit(arrayY);
		avg = ArrayUtility.calcAverage(arrayY);
		ArrayUtility.displayArray(arrayY);
		System.out.println("Average: " + avg + "\n");
		
		arrayY = ArrayUtility.init(2, 5);
		ArrayUtility.randomInit(arrayY);
		avg = ArrayUtility.calcAverage(arrayY);
		ArrayUtility.displayArray(arrayY);
		System.out.println("Average: " + avg + "\n");
		separator("");
		
//010010010110010101011011001010100100101011101010101010010101010101010101010010101011010110101001001010101010100111010101010101010110101001010010101010111101010

		separator("flipHorizontal");					// Test cases for flipHorizontal
		arrayY = ArrayUtility.init(3, 3);
		ArrayUtility.randomInit(arrayY);
		ArrayUtility.displayArray(arrayY);
		ArrayUtility.flipHorizontal(arrayY);
		ArrayUtility.displayArray(arrayY);
		
		arrayY = ArrayUtility.init(5, 6);
		ArrayUtility.randomInit(arrayY);
		ArrayUtility.displayArray(arrayY);
		ArrayUtility.flipHorizontal(arrayY);
		ArrayUtility.displayArray(arrayY);
		
		arrayY = ArrayUtility.init(1, 3);
		ArrayUtility.orderedInit(arrayY);
		ArrayUtility.displayArray(arrayY);
		ArrayUtility.flipHorizontal(arrayY);
		ArrayUtility.displayArray(arrayY);
		
		arrayY = ArrayUtility.init(4, 7);
		ArrayUtility.orderedInit(arrayY);
		ArrayUtility.displayArray(arrayY);
		ArrayUtility.flipHorizontal(arrayY);
		ArrayUtility.displayArray(arrayY);
		separator("");

//010010010110010101011011001010100100101011101010101010010101010101010101010010101011010110101001001010101010100111010101010101010110101001010010101010111101010

		separator("flipVertical");					// Test cases for flipVertical
		arrayY = ArrayUtility.init(4, 4);
		ArrayUtility.orderedInit(arrayY);
		ArrayUtility.displayArray(arrayY);
		ArrayUtility.flipVertical(arrayY);
		ArrayUtility.displayArray(arrayY);
		
		arrayY = ArrayUtility.init(8, 3);
		ArrayUtility.orderedInit(arrayY);
		ArrayUtility.displayArray(arrayY);
		ArrayUtility.flipVertical(arrayY);
		ArrayUtility.displayArray(arrayY);
		
		arrayY = ArrayUtility.init(4, 10);
		ArrayUtility.randomInit(arrayY);
		ArrayUtility.displayArray(arrayY);
		ArrayUtility.flipVertical(arrayY);
		ArrayUtility.displayArray(arrayY);
		
		arrayY = ArrayUtility.init(2, 3);
		ArrayUtility.randomInit(arrayY);
		ArrayUtility.displayArray(arrayY);
		ArrayUtility.flipVertical(arrayY);
		ArrayUtility.displayArray(arrayY);
		separator("");
		
//010010010110010101011011001010100100101011101010101010010101010101010101010010101011010110101001001010101010100111010101010101010110101001010010101010111101010

		separator("flipDiagonalLR");					// Test cases for flipDiagonalLR
		arrayY = ArrayUtility.init(2, 2);
		ArrayUtility.orderedInit(arrayY);
		ArrayUtility.displayArray(arrayY);
		ArrayUtility.flipDiagonalLR(arrayY);
		ArrayUtility.displayArray(arrayY);
		
		arrayY = ArrayUtility.init(5, 5);
		ArrayUtility.orderedInit(arrayY);
		ArrayUtility.displayArray(arrayY);
		ArrayUtility.flipDiagonalLR(arrayY);
		ArrayUtility.displayArray(arrayY);
		
		arrayY = ArrayUtility.init(7, 7);
		ArrayUtility.randomInit(arrayY);
		ArrayUtility.displayArray(arrayY);
		ArrayUtility.flipDiagonalLR(arrayY);
		ArrayUtility.displayArray(arrayY);
		
		arrayY = ArrayUtility.init(4, 2);
		ArrayUtility.orderedInit(arrayY);
		ArrayUtility.displayArray(arrayY);
		ArrayUtility.flipDiagonalLR(arrayY);
		ArrayUtility.displayArray(arrayY);
		separator("");

//010010010110010101011011001010100100101011101010101010010101010101010101010010101011010110101001001010101010100111010101010101010110101001010010101010111101010

		separator("flipDiagonalRL");					// Test cases for flipDiagonalRL
		arrayY = ArrayUtility.init(4, 4);
		ArrayUtility.orderedInit(arrayY);
		ArrayUtility.displayArray(arrayY);
		ArrayUtility.flipDiagonalRL(arrayY);
		ArrayUtility.displayArray(arrayY);
		
		arrayY = ArrayUtility.init(7, 7);
		ArrayUtility.orderedInit(arrayY);
		ArrayUtility.displayArray(arrayY);
		ArrayUtility.flipDiagonalRL(arrayY);
		ArrayUtility.displayArray(arrayY);
		
		arrayY = ArrayUtility.init(10, 10);
		ArrayUtility.orderedInit(arrayY);
		ArrayUtility.displayArray(arrayY);
		ArrayUtility.flipDiagonalRL(arrayY);
		ArrayUtility.displayArray(arrayY);
		
		arrayY = ArrayUtility.init(1, 4);
		ArrayUtility.orderedInit(arrayY);
		ArrayUtility.displayArray(arrayY);
		ArrayUtility.flipDiagonalRL(arrayY);
		ArrayUtility.displayArray(arrayY);
		separator("");
		
//010010010110010101011011001010100100101011101010101010010101010101010101010010101011010110101001001010101010100111010101010101010110101001010010101010111101010
	
		separator("rotate90");					// Test cases for rotate90
		arrayY = ArrayUtility.init(10, 10);
		ArrayUtility.orderedInit(arrayY);
		ArrayUtility.displayArray(arrayY);
		ArrayUtility.rotate90(arrayY);
		ArrayUtility.displayArray(arrayY);
		
		arrayY = ArrayUtility.init(5, 5);
		ArrayUtility.orderedInit(arrayY);
		ArrayUtility.displayArray(arrayY);
		ArrayUtility.rotate90(arrayY);
		ArrayUtility.displayArray(arrayY);
		
		arrayY = ArrayUtility.init(3, 3);
		ArrayUtility.orderedInit(arrayY);
		ArrayUtility.displayArray(arrayY);
		ArrayUtility.rotate90(arrayY);
		ArrayUtility.displayArray(arrayY);
		
		arrayY = ArrayUtility.init(6, 3);
		ArrayUtility.orderedInit(arrayY);
		ArrayUtility.displayArray(arrayY);
		ArrayUtility.rotate90(arrayY);
		ArrayUtility.displayArray(arrayY);
		separator("");
	}
	
//010010010110010101011011001010100100101011101010101010010101010101010101010010101011010110101001001010101010100111010101010101010110101001010010101010111101010
	/**
	 * The separator method prints out a separator line of stars.
	 * @param methodName The name of the method that will follow the separator.
	 */
	public static void separator(String methodName)
	{
		System.out.print(methodName);
		
		for (int a = 0; a <= 60 - methodName.length(); a++)		// Loops the print statement (60 - the length of the method name) times
		{
			System.out.print("*");
		}
		
		System.out.print("\n\n");
	}

}