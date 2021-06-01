package main;

//This Class determines if the Diagonals in the matrix are equal or not.
public class SumOfDiagonals {
// this is the added comment
	public static boolean areDiagonalsEquals(int arr[][], int n) {
		if(arr[0].length!=arr.length) {
			throw new RuntimeException("Since n is the length of the Array, Please provide valid length.");
		}

		// Initialize sums of diagonals
		int d1 = 0, d2 = 0;

		for (int i = 0; i < n; i++) {
			d1 += arr[i][i];
			d2 += arr[i][n - i - 1];
		}

		return d1==d2;
	}
	

	// Driver program to test above method.
	public static void main(String[] args) {
		int n = 4;

		int arr[][] = { { 1, 2, 1, 1 }, 
				           { 4, 1, 1, 3 }, 
				           { 1, 1, 1, 4 }, 
				           { 1, 8, 1, 1 } 
				           };

	   System.out.println(areDiagonalsEquals(arr, n));
	

	}
}
