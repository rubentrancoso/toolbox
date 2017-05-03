package toolbox.codility.lesson3.timecomplexity.FrogJmp;

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
		int X = 10;
		int Y = 85;
		int D = 30;
		int result = solution.solution(X,Y,D);
		assertEquals(3, result);
	}

}
