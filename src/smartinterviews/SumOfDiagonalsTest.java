package smartinterviews;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumOfDiagonalsTest {

	@Test
	public void testcase1() {

		SumOfDiagonals tester = new SumOfDiagonals(); 
		
		int arr[][] =
		     {
		         {1, 2, 1},
		         {4 ,1, 6},
		         {1, 8, 1}
		     };
        // assert statements
        assertEquals(true, tester.sumInt(arr, arr.length));
	}
	
	@Test
	public void testcase2() {

		SumOfDiagonals doubleTester = new SumOfDiagonals(); 
		
		double arr[][] =
		     {
		         {10.5, 2.4, 10.5},
		         {4.9 ,10.5, 6.0},
		         {10.5, 8.5, 10.5}
		     };
        // assert statements
        assertEquals(true, doubleTester.sumDouble(arr, arr.length));
	}
	
	
	@Test
	public void testcase3() {

		SumOfDiagonals stringTester = new SumOfDiagonals(); 
		
		String arr[][] =
		     {
		         {"ab", "ab", "ab"},
		         {"ab" ,"ab", "ab"},
		         {"ab", "ab", "ab"}
		     };
       // assert statements
       assertEquals(true, stringTester.sumString(arr, arr.length));
	}
	
	

	

}
