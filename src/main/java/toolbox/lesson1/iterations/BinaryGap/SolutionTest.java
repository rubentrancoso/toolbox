package toolbox.lesson1.iterations.BinaryGap;

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
		int N, result;
		N = Integer.parseInt("0", 2);
		result = solution.solution(N);
		assertEquals(result, 0);
		N = Integer.parseInt("1", 2);
		result = solution.solution(N);
		assertEquals(result, 0);
		N = Integer.parseInt("10", 2);
		result = solution.solution(N);
		assertEquals(result, 0);
		N = Integer.parseInt("11", 2);
		result = solution.solution(N);
		assertEquals(result, 0);
		N = Integer.parseInt("101", 2);
		result = solution.solution(N);
		assertEquals(result, 1);
		N = Integer.parseInt("1010", 2);
		result = solution.solution(N);
		assertEquals(result, 1);
		N = Integer.parseInt("10010", 2);
		result = solution.solution(N);
		assertEquals(result, 2);
		N = Integer.parseInt("10100", 2);
		result = solution.solution(N);
		assertEquals(result, 1);
		N = Integer.parseInt("1000100", 2);
		result = solution.solution(N);
		assertEquals(result, 3);
		N = Integer.parseInt("1001000", 2);
		result = solution.solution(N);
		assertEquals(result, 2);
	}

}
