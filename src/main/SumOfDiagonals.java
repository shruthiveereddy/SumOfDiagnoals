package main;

public class SumOfDiagonals {

	public static boolean sumInt(int arr[][], int n) {
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
	
	public static boolean sumDouble(double arr[][], int n) {
		if(arr[0].length!=arr.length) {
			throw new RuntimeException("Since n is the length of the Array, Please provide valid length.");
		}

		// Initialize sums of diagonals
		double d1 = 0, d2 = 0;

		for (int i = 0; i < n; i++) {
			d1 += arr[i][i];
			d2 += arr[i][n - i - 1];
		}

		return d1==d2;
	}
	
	public static boolean sumString(String arr[][], int n) {
		if(arr[0].length!=arr.length) {
			throw new RuntimeException("Since n is the length of the Array, Please provide valid length.");
		}

		// Initialize sums of diagonals
		String d1 = "", d2 = "";

		for (int i = 0; i < n; i++) {
			d1 += arr[i][i];
			d2 += arr[i][n - i - 1];
		}

		return d1.equals(d2);
	}

	/* Driver program to test above function */
	public static void main(String[] args) {
		int n = 4;

		double arr[][] = { { 1, 2, 1, 1 }, 
				           { 4, 1, 1, 3 }, 
				           { 1, 1, 1, 4 }, 
				           { 1, 8, 1, 1 } };
		if(arr[0][0] != Math.ceil(arr[0][0])) {
			//System.out.println(sumInt(arr, n));
		} else {
			System.out.println(sumDouble(arr, n));
		}

	}
}
