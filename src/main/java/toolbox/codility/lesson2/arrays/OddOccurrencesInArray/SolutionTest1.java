package toolbox.codility.lesson2.arrays.OddOccurrencesInArray;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SolutionTest1 {

	private Solution1 solution;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		solution = new Solution1();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSolution0() {
		int[] a = {1,2,1};
		int answer = 2;
		int result = solution.solution(a);
		assertEquals(answer, result);
	}
	
	@Test
	public void testSolution1() {
		int[] a = {9, 3, 9, 3, 9, 7, 9};
		int answer = 7;
		int result = solution.solution(a);
		assertEquals(answer, result);
	}	

}
