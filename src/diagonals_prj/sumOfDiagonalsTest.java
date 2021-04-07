package diagonals_prj;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class sumOfDiagonalsTest {

	@Test
	public void testDeck() {

		sumOfDiagonals tester = new sumOfDiagonals(); 
		
		int arr[][] =
		     {
		         {1, 2, 1},
		         {4 ,1, 6},
		         {1, 8, 1}
		     };
        // assert statements
        assertEquals(true, tester.sum(arr, arr.length));
	}

}
