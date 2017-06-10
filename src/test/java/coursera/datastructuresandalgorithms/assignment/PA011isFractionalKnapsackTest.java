package coursera.datastructuresandalgorithms.assignment;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import coursera.datastructuresandalgorithms.assignment.PA011isFractionalKnapsack;

public class PA011isFractionalKnapsackTest {

	@Test
	public void test() {
		int[] values = { 60, 100, 120 };
		int[] weights = { 20, 50, 30 };
		assertEquals(180.000, PA011isFractionalKnapsack.getOptimalValue(50, values, weights), 0.0001);
	}

	@Test
	public void test2() {
		int[] values = { 500 };
		int[] weights = { 30 };
		assertEquals(166.6667, PA011isFractionalKnapsack.getOptimalValue(10, values, weights), 0.0001);
	}

	@Test
	public void test5() {
		int[] values = { 0, 50 };
		int[] weights = { 100, 1 };
		assertEquals(50.0, PA011isFractionalKnapsack.getOptimalValue(15, values, weights), 0.0001);
	}

}
