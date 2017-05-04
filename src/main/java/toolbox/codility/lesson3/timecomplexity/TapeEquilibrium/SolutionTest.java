package toolbox.codility.lesson3.timecomplexity.TapeEquilibrium;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SolutionTest {

	private Solution solution;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		solution = new Solution();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSolution() {
		int[] A = new int[5];
		A[0] = 3;
		A[1] = 1;
		A[2] = 2;
		A[3] = 4;
		A[4] = 3;
		int result = solution.solution(A);
		assertEquals(1, result);
	}
	
	@Test
	public void testSolution1() {
		int[] A = new int[2];
		A[0] =-1000;
		A[1] = 1000;
		int result = solution.solution(A);
		assertEquals(2000, result);
	}	

}
