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
        assertEquals(true, sumOfIntDiag.sumInt(arr, arr.length));
	}
	
	@Test
	public void sumDoubleTest() {

		SumOfDiagonals sumOfDoubDiag = new SumOfDiagonals(); 
		
		double arr[][] =
		     {
		         {10.5, 2.4, 10.5},
		         {4.9 ,10.5, 6.0},
		         {10.5, 8.5, 10.5}
		     };
        // assert statements
        assertEquals(true, sumOfDoubDiag.sumDouble(arr, arr.length));
	}
	
	
	@Test
	public void sumStringTest() {

		SumOfDiagonals sumOfStrDiag = new SumOfDiagonals(); 
		
		String arr[][] =
		     {
		         {"ab", "ab", "ab"},
		         {"ab" ,"ab", "ab"},
		         {"ab", "ab", "ab"}
		     };
       // assert statements
       assertEquals(true, sumOfStrDiag.sumString(arr, arr.length));
	}
	
	

	

}
