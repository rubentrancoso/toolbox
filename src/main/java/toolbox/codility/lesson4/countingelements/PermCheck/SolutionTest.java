package toolbox.codility.lesson4.countingelements.PermCheck;

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
		int[] A = {1,3,2};
		int result = solution.solution(A);
		assertEquals(1,result);
	}
	
	@Test
	public void testSolution0() {
		int[] A = {1,4,1};
		int result = solution.solution(A);
		assertEquals(0,result);
	}	

}
