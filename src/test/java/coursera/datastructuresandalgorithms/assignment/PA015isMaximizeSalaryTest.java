package coursera.datastructuresandalgorithms.assignment;

import org.junit.Test;

import coursera.datastructuresandalgorithms.assignment.PA015isMaximizeSalary;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class PA015isMaximizeSalaryTest {

	@Test
	public void salary0() {

		List<Integer> list = new LinkedList<Integer>(Arrays.asList(2, 21));
		assertEquals("221", PA015isMaximizeSalary.findOptimal(list));
	}

	@Test
	public void salary1() {
		List<Integer> list = new LinkedList<Integer>(Arrays.asList(9, 4, 6, 1, 9));
		assertEquals("99641", PA015isMaximizeSalary.findOptimal(list));
	}

	@Test
	public void salary2() {
		List<Integer> list = new LinkedList<Integer>(Arrays.asList(23, 39, 92));
		assertEquals("923923", PA015isMaximizeSalary.findOptimal(list));
	}

}
