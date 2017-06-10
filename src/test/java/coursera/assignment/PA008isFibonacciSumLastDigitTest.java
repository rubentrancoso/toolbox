package coursera.assignment;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PA008isFibonacciSumLastDigitTest {

	@Test
	public void test() {
		assertEquals(2, PA008isFibonacciSumLastDigit.getFibonacciHuge(2, 10));
		assertEquals(7, PA008isFibonacciSumLastDigit.getFibonacciHuge(4, 10));
		assertEquals(6, PA008isFibonacciSumLastDigit.getFibonacciHuge(15, 10));
		assertEquals(5, PA008isFibonacciSumLastDigit.getFibonacciHuge(100, 10));
		assertEquals(6, PA008isFibonacciSumLastDigit.getFibonacciHuge(613455, 10));
	}

}
