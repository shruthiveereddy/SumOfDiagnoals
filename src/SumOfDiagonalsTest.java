package smartinterviews;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumOfDiagonalsTest {

	@Test
	public void testDeck() {

		SumOfDiagonals tester = new SumOfDiagonals(); 
		
		int arr[][] =
		     {
		         {1, 2, 1},
		         {4 ,1, 6},
		         {1, 8, 1}
		     };
        // assert statements
        assertEquals(true, tester.sum(arr, arr.length));
	}
	
	@Test(Expected(RuntimeException.class))
	public void testDeck() {

		SumOfDiagonals tester = new SumOfDiagonals(); 
		
		int arr[][] =
		     {
		         {1, 2, 1},
		         {4 ,1, 6}
		     };
	}

}
