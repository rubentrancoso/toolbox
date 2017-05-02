package toolbox.lesson2.arrays.CyclicRotation;

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
	public void testSolution0() {
		int[] a = { 1, 2, 3 };
		int k = 1;
		int[] answer = { 3, 1, 2 };
		int[] result = solution.solution(a, k);
		assertArrayEquals(answer, result);
	}

	@Test
	public void testSolution1() {
		int[] a = { 1, 2, 3, 4, 5 };
		int k = 5;
		int[] answer = { 1, 2, 3, 4, 5 };
		int[] result = solution.solution(a, k);
		assertArrayEquals(answer, result);
	}
}
