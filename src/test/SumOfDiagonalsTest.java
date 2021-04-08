package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.SumOfDiagonals;

class SumOfDiagonalsTest {

	@Test
	public void sumIntTest() {

		SumOfDiagonals sumOfIntDiag = new SumOfDiagonals(); 
		
		int arr[][] =
		     {
		         {1, 2, 1},
		         {4 ,1, 6},
		         {1, 8, 1}
		     };
        // assert statements
        assertEquals(true, sumOfIntDiag.areDiagonalsEquals(arr, arr.length));
	}


}
