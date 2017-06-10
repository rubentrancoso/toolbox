package coursera.assignment;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PA009isFibonacciPartialSumTest {

	@Test
	public void test() {
		assertEquals(2, PA009isFibonacciPartialSum.getFibonacciPartialSum(1, 2));
		assertEquals(5, PA009isFibonacciPartialSum.getFibonacciPartialSum(10, 10));
		assertEquals(1, PA009isFibonacciPartialSum.getFibonacciPartialSum(3, 7));
		assertEquals(2, PA009isFibonacciPartialSum.getFibonacciPartialSum(10, 200));
		assertEquals(5, PA009isFibonacciPartialSum.getFibonacciPartialSum(1, 10000000000l));
	}

}
