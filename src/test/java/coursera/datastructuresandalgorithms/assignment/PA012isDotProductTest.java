package coursera.datastructuresandalgorithms.assignment;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import coursera.datastructuresandalgorithms.assignment.PA012isDotProduct;

public class PA012isDotProductTest {

	@Test
	public void test() {
		Long[] a = { new Long(1), new Long(3), new Long(-5) };
		Long[] b = { new Long(-2), new Long(4), new Long(1) };
		assertEquals(new Long(23), PA012isDotProduct.maxDotProduct(a, b));
	}

}
