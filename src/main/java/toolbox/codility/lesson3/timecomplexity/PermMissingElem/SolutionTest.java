package toolbox.codility.lesson3.timecomplexity.PermMissingElem;

import static org.junit.Assert.assertEquals;

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
		int[] input = {2,3,1,5};
		int answer = 4;
		int result = solution.solution(input);
		assertEquals(answer, result);
	}

	@Test
	public void testSolution1() {
		int[] input = {5,3,4,2};
		int answer = 1;
		int result = solution.solution(input);
		assertEquals(answer, result);
	}
	
}
