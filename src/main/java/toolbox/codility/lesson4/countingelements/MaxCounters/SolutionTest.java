package toolbox.codility.lesson4.countingelements.MaxCounters;

import static org.junit.Assert.assertArrayEquals;

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
		int N = 5;
		int M = 7;
		int[] A = new int[M];
		A[0] = 3;
		A[1] = 4;
		A[2] = 4;
		A[3] = 6;
		A[4] = 1;
		A[5] = 4;
		A[6] = 4;
		int[] B = { 3, 2, 2, 4, 2 };
		int[] result = solution.solution(N, A);
		assertArrayEquals(B, result);
	}

}
