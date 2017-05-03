package assesment.codility.com.booking.y2017may3.task3;

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
	public void testSolution0() {
		int[] A = new int[3];
		int[] B = new int[3];

		A[0] = 60;
		A[1] = 80;
		A[2] = 40;
		
		B[0] = 2;
		B[1] = 3;
		B[2] = 5;

		int M = 5;
		int X = 2;
		int Y = 200;

		int result = solution.solution(A, B, M, X, Y);
		assertEquals(5, result);
	}

	@Test
	public void testSolution1() {
		int[] A = new int[5];
		int[] B = new int[5];

		A[0] = 40;
		A[1] = 40;
		A[2] = 100;
		A[3] = 80;
		A[4] = 20;

		B[0] = 3;
		B[1] = 3;
		B[2] = 2;
		B[3] = 2;
		B[4] = 3;

		int M = 3;
		int X = 5;
		int Y = 200;

		int result = solution.solution(A, B, M, X, Y);
		assertEquals(6, result);
	}

}
