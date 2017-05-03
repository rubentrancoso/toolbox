package assesment.codility.com.booking.y2017may3.task2;

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
		Point3D[] A = new Point3D[6];
		for(int i=0;i<6;i++) {
			A[i] = new Point3D();
		}
		A[0].x = 0;
		A[0].y = 5;
		A[0].z = 4;
		A[1].x = 0;
		A[1].y = 0;
		A[1].z = -3;
		A[2].x = -2;
		A[2].y = 1;
		A[2].z = -6;
		A[3].x = 1;
		A[3].y = -2;
		A[3].z = 2;
		A[4].x = 1;
		A[4].y = 1;
		A[4].z = 1;
		A[5].x = 4;
		A[5].y = -4;
		A[5].z = 3;
		int result = solution.solution(A);
		assertEquals(3, result);
	}

}
