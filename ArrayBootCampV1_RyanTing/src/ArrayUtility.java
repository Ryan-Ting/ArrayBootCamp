/**
 * AP CmpSci 2019-2020
 * ArrayBootCamp
 * Various arrays that play with orders of elements in an array.
 * 
 * @author Ryan Ting
 * @version September 11, 2019
 * @see ArrayDriver
 * @see ArrayDriver2D
 */
public class ArrayUtility {

	/**The names method assigns a string value to each array element, and prints it in reverse order. */
	public static void names()
	{
		String[] array1 = new String[7];
		array1[0] = "Isaac Newton";
		array1[1] = "Albert Einstein";
		array1[2] = "Galileo Galilei";
		array1[3] = "Nicolaus Copernicus";
		array1[4] = "Johannes Kepler";
		array1[5] = "Archimedes of Syracuse";
		array1[6] = "Tricia Flynn";

		for (int q = 6; q >= 0; q--)
		{
			System.out.println(array1[q]);
		}
	}

//\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/
	/**
	 * The init method instantiates an array using the variable it takes in.
	 * @param input The length of the array.
	 * @return The array created using the length.
	 */
	public static int[] init(int input)
	{
		int[] array = new int[input];

		return array;
	}

//\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/
	/**
	 * The init method instantiates a 2D array using two variables that it takes in.
	 * @param row The number of rows in the array.
	 * @param col The number of columns in the array.
	 * @return The array created by the method.
	 */
	public static int[][] init(int row, int col)
	{
		int[][] array2 = new int[row][col];
		
		return array2;
	}
	
//\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/
/**
 * The zeroInit method sets every element in an array to 0.
 * @param arrayC The array that will have its values set to 0.
 */
	public static void zeroInit(int[] arrayC)
	{
		for (int j = 0; j <= arrayC.length - 1; j++)
		{
			arrayC[j] = 0;
		}
	}
//\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/
	/**
	 * The zeroInit method sets every element in an array to 0.
	 * @param arrayC2 The array that will have its values set to 0.
	 */
	public static void zeroInit(int[][] arrayC2)
	{
		for (int r = 0; r <= arrayC2.length - 1; r++)
		{
			for (int c = 0; c <= arrayC2[r].length - 1; c++)
			{
				arrayC2[r][c] = 0;
			}
		}
	}

//\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/
/**
 * The orderedInit method assigns numbers in order from 0 to the last element in the 1D array.
 * @param arrayD The array that will be ordered.
 */
	public static void orderedInit(int[] arrayD)
	{
		for (int z = 0; z <= arrayD.length - 1; z++)
		{
			arrayD[z] = z;
		}
	}
	
//\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/
/**
 * The orderedInit method assign numbers in order from 0 to the last element in the 2D array.
 * @param array2D The array that will be ordered.
 */
	public static void orderedInit(int[][] array2D)
	{
		int count = 0;
		
		for (int r = 0; r <= array2D.length - 1; r++)
		{
			for (int c = 0; c <= array2D[r].length - 1; c++)
			{
				array2D[r][c] = count;
				count++;
			}
		}
	}
	
//\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/
/**
 * The randomInit method randomly generates and assigns a number to every element in the array.
 * @param arrayE The array that will have its element values randomized.
 */
	public static void randomInit(int[] arrayE)
	{
		for (int a = 0; a < arrayE.length; a++)
		{
			arrayE[a] = (int) (Math.random() * 100) + 1;
		}
	}
	
//\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/
	/**
	 * The randomInit method randomly generates and assigns a number to every element in the array.
	 * @param arrayE2 The array that will have its element values randomized.
	 */
	public static void randomInit(int[][] arrayE2)
	{
		for (int r = 0; r < arrayE2.length; r++)
		{
			for (int c = 0; c < arrayE2[r].length; c++)
			{
				arrayE2[r][c] = (int) (Math.random() * 100) + 1;
			}
		}
	}	
	
//\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/
	/**
	 * The displayArray method displays each element in a 1D array.
	 * @param arrayF The array that will be displayed.
	 */
	public static void displayArray(int[] arrayF)
	{
		System.out.print("[");
		
		for (int x = 0; x < arrayF.length; x++)
		{
			System.out.printf("%3d ", arrayF[x]);
		}
		
		System.out.println("]");
	}

//\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/
/**
 * The displayArray method displays each element in a 2D array.
 * @param arrayF2 The array that will be displayed.
 */
	public static void displayArray(int[][] arrayF2)
	{
		for (int r = 0; r <= arrayF2.length - 1; r++)
		{
			displayArray(arrayF2[r]);
		}
		System.out.print("\n");
	}
//\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/
	/**
	 * The swapElements method swaps two elements in the same array.
	 * @param arrayG The array that will have its elements swapped.
	 * @param swap1 The index of the first element to have its value swapped.
	 * @param swap2 The index of the second element to have its value swapped.
	 */
	public static void swapElements(int[] arrayG, int swap1, int swap2)
	{
		int swapA = arrayG[swap1];		// Temporary holding variable
		
		arrayG[swap1] = arrayG[swap2];		// Assigns the contents of one into the other,
		arrayG[swap2] = swapA;			// And takes the contents of the overwritten element and assigns it to the other using the temporary variable 
	}

//\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/
	/**
	 * The removeElement method moves an element to the end of the array and moves the subsequent elements down an index.
	 * @param arrayH The array that will have one of its elements moved.
	 * @param remove The index of the element that will receive the described action.
	 */
	public static void removeElement(int[] arrayH, int remove)
	{
		int temp = arrayH[remove];		// Temporary holding variable
		
		if (remove != arrayH.length - 1)
		{
			for (int t = 1; t + remove <= arrayH.length - 1; t++)		// Assigns the contents of the second element to the first, the third to the second, etc.
			{
				arrayH[remove + (t - 1)] = arrayH[remove + (t)];
			}
			arrayH[arrayH.length - 1] = temp;		// Assigns the contents of the first element to the last using the temporary variable
		}
	}

//\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/
/**
 * The reverseArray method flips the order in which the values are displayed.
 * @param arrayI The array that will be flipped.
 */
	public static void reverseArray(int[] arrayI)
	{
		for (int k = 0; k <= (arrayI.length - 1) / 2; k++)
		{
			swapElements(arrayI, k, arrayI.length - (k + 1));		// Swaps the elements starting from the outside going in
		}
	}

//\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/
/**
 * The searchArray method will search for a given value and return its index.
 * @param arrayJ THe array that will be searched.
 * @param value The value that will be searched for.
 * @return The index of the desired value, will return "-1" if not found.
 */
	public static int searchArray(int[] arrayJ, int value)
	{
		int ifFound = -1, counterr = 0;
		do {
			if (arrayJ[counterr] == value)		// Goes through the array and compares the user inputted value to the contents of each element
			{
				ifFound = counterr;		// If an element was the same as the input, it stops the loop
				counterr = arrayJ.length - 1;
			}
			counterr++;
		} while (arrayJ.length > counterr);
		
		return ifFound;
	}

//\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/
/**
 * The findLowest method searches for the lowest value element in an array and returns its index.
 * @param arrayK The array that will be searched.
 * @return The index of the lowest value element.
 */
	public static int findLowest(int[] arrayK)
	{
		int compare = 0;

		for (int k = 0; k < arrayK.length - 1; k++)
		{
			if (arrayK[compare] > arrayK[k + 1])		// Compares the first element to the others until it finds one that is lower, then repeats
			{											// that process for that number
				compare = k + 1;
			}
		}
		return compare;
	}

//\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/
/**
 * The findHighest method searches for the highest value element in an array and returns its index.
 * @param arrayL The array that will be searched.
 * @return The index of the highest value element.
 */
	public static int findHighest(int[] arrayL)
	{
		int compare2 = 0;

		for (int i = 0; i < arrayL.length - 1; i++)
		{
			if (arrayL[compare2] < arrayL[i + 1])		// Opposite logic of findLowest
			{
				compare2 = i + 1;
			}
		}			
		return compare2;
	}
	
//\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/
	/**
	 * The sortArrayAscending method sorts the array's elements in ascending order.
	 * @param arrayM The method that will be sorted.
	 */
	public static void sortArrayAscending(int[] arrayM)
	{
		for (int t = 0; t < arrayM.length - 1; t++)
		{
			for (int r = 0; r < arrayM.length - 1; r++)		// Similar logic to findLowest, but flips it instead of repeating the process of finding the lowest
			{
				if (arrayM[r] > arrayM[r + 1])
				{
					swapElements(arrayM, r, r + 1);
				}
			}
		}
	}

//\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/
/**
 * The sortArrayDescending method sorts the array's elements in descending order.
 * @param arrayN The method that will be sorted.
 */
	public static void sortArrayDescending(int[] arrayN)
	{
		sortArrayAscending(arrayN);		// Reverses sortArrayAscending
		reverseArray(arrayN);
	}

//\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/
/**
 * The calcSum method adds the contents of each element in the array and returns it.
 * @param arrayO The array that will have its elements added.
 * @return The sum of each element.
 */
	public static int calcSum(int[] arrayO)
	{
		int sum = 0;
		
		for (int o = 0; o <= arrayO.length - 1; o++)
		{
			sum += arrayO[o];
		}
		return sum;
	}
	
//\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/
	/**
	 * The calcSum method adds the contents of each element in a column of the array and returns each sum in a 1D array.
	 * @param arrayO2 The array that will have its elements added.
	 * @return The sum of each element.
	 */
	public static int[][] calcSum(int[][] arrayO2)
	{
		int sum = 0;
		int[][] sumArray = new int[1][arrayO2[0].length];		// Array to hold the sums

		for (int c = 0; c <= arrayO2[0].length - 1; c++)
		{
			for (int r = 0; r <= arrayO2.length - 1; r++)
			{
				sum += arrayO2[r][c];
			}
			sumArray[0][c] = sum;		// Assigns the sum to an element in the holding array
			sum = 0;		// Resets the sum variable so it can be used again
		}
		return sumArray;
	}

//\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/
	/**
	 * The calcAverage method calculates the average of each element in an array.
	 * @param arrayP The array that will have its elements averaged.
	 * @return The average of each element.
	 */
	public static double calcAverage(int[] arrayP)
	{
		double average = calcSum(arrayP) / (double) (arrayP.length);		// Calls calcSum and divides it by the number of elements
		
		return average;
	}
	
//\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/
	/**
	 * The calcAverage method calculates the average of each element in an array.
	 * @param arrayP2 The array that will have its elements averaged.
	 * @return The average of each element.
	 */
	public static double calcAverage(int[][] arrayP2)
	{
		double sum = 0;
		double average = 0;

		for (int o = 0; o <= arrayP2.length - 1; o++)
		{
			for (int r = 0; r <= arrayP2[o].length - 1; r++)
			{
				sum += arrayP2[o][r];
			}
		}
		average = sum / (arrayP2.length * arrayP2[0].length);		// Finds the number of elements to divide by by multiplying the row by the columns
		
		return average;
	}
	
//\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/
	/**
	 * The flipHorizontal method flips the elements horizontally.
	 * @param arrayQ2 The array being flipped.
	 */
	public static void flipHorizontal(int[][] arrayQ2)
	{
		for (int r = 0; r <= arrayQ2.length - 1; r++)
		{
			reverseArray(arrayQ2[r]);		// Calls reverseArray for each row in the 2D array
		}
	}

//\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/
	/**
	 * The flipVertical method flips the elements vertically.
	 * @param arrayR2 The array being flipped.
	 */
	public static void flipVertical(int[][] arrayR2)
	{
		for (int c = 0; c <= arrayR2[0].length - 1; c++)
		{
			for (int r = 0; r <= (arrayR2.length - 1) / 2; r++)
			{
				swapElements(arrayR2, r, c, arrayR2.length - r - 1, c);		// Calls swapElements for each column in the array
			}
		}
	}
	
//\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/
	/**
	 * The swapElements method swaps two elements in a a 2D array.
	 * @param arrayFlip  The array being flipped.
	 * @param r The row number of the first element.
	 * @param c The column number of the first element.
	 * @param i The row number of the second element.
	 * @param j The column number of the second element.
	 */
	public static void swapElements(int[][]arrayFlip, int r, int c, int i, int j)
	{
		int swap2D = arrayFlip[r][c];		// Temporary holding variable
		
		arrayFlip[r][c] = arrayFlip[i][j];		// Assigns the second element into the first,
		arrayFlip[i][j] = swap2D;				// Then assigns the first to the second using the temporary variable
	}
	
//\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/
	/**
	 * The flipDiagonalLR method flips the method's elements across a diagonal from the top right to the bottom left of the array.
	 * @param arrayS2 The array that will be flipped.
	 */
	public static void flipDiagonalLR(int[][] arrayS2)
	{
		if (arrayS2.length == arrayS2[0].length)
		{
			int reverseCount = arrayS2.length - 1;		// Reverse counter based on the number of rows so that the inner loop loops 1 less time per outer loop

			for (int r = 0; r < (arrayS2.length - 1); r++)
			{
				for (int c = 0; c < reverseCount; c++)
				{
					swapElements(arrayS2, r, c, arrayS2.length - c - 1, arrayS2[0].length - r - 1);		// Swaps the elements moving from the top left and bottom right corner
																										// to the top right corner in an "L" shape
				}
				reverseCount--;
			}
		}
		else
		{
			System.out.println("Error: array not a square\n");
		}
	}
	
//\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/
	/**
	 * The flipDiagonalRL method flips the method's elements across a diagonal from the top left to the bottom right of the array.
	 * @param arrayT2 The array that will be flipped.
	 */
	public static void flipDiagonalRL(int[][] arrayT2)
	{
		flipDiagonalLR(arrayT2);		// Calls flipDiagonalLR and then flips the array horizontally and vertically
		flipVertical(arrayT2);
		flipHorizontal(arrayT2);
	}
	
//\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/\(^-^)/
	/**
	 * The rotate90 method rotates the elements of an array clockwise.
	 * @param arrayU2 The array that will be rotated.
	 */
	public static void rotate90(int[][] arrayU2)
	{
		flipHorizontal(arrayU2);		// Flips the array horizontally then calls flipDiagonalLR
		flipDiagonalLR(arrayU2);
	
	}
}
