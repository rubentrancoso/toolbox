package toolbox.codility.lesson4.countingelements.MissingInteger;

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
		int N = 6;
		int[] A = new int[N];
		A[0] = 1;
		A[1] = 3;
		A[2] = 6;
		A[3] = 4;
		A[4] = 1;
		A[5] = 2;
		int result = solution.solution(A);
		assertEquals(5, result);
	}
	
	@Test
	public void testSolution1() {
		int N = 1;
		int[] A = new int[N];
		A[0] = 1;
		int result = solution.solution(A);
		assertEquals(2, result);
	}	

	@Test
	public void testSolution2() {
		int N = 1;
		int[] A = new int[N];
		A[0] = 2;
		int result = solution.solution(A);
		assertEquals(1, result);
	}	

}
