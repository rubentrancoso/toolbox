package assesment.pivotal;

import static org.junit.Assert.*;

import org.junit.Test;

public class XSetTest /*extends TestCase */{
	
	@Test
	public void newInstanceTest() {
		XSet xset = new XSet(3);
		assertTrue(xset != null);
	}
	
	@Test
	public void maxCapacityExistis() {  // positive use case
		XSet xset = new XSet(3);
		assertTrue(xset.maxCapacity == 3);
	}
	
	@Test
	public void negativeInTheConstructor() {
		XSet xset = new XSet(-1);
		assertTrue(xset.maxCapacity == 3);
	}
	
	@Test
	public void addAValue() {
		XSet xset = new XSet(3);
		// Integer.MIN_VAL -> MAX_VAL
		xset.add(1);
		// ? what should we test?
		assertTrue(xset.getSize() == 1);
	}
	
	// add - just make sure that you write the tests that demonstrates the data structure
	
	// case1 - add(1), add(1) -> 1
	// case2 - add(1), add(2) -> 2
	@Test
	public void addSameValueTwice() {
		XSet xset = new XSet(3);
		xset.add(1);
		xset.add(1);
		assertTrue(xset.getSize() == 1);
	}
	
	@Test
	public void addTwoDistinctValues() {
		XSet xset = new XSet(3);
		xset.add(1);
		xset.add(2);
		assertTrue(xset.getSize() == 2);
	}

	// ok...xset constructor will set the max capacity passed in 
	// if max cap is less than 3 then xset max capacity will be 3
	
	// XSet(5) -> maxXCap - 5
	// xSet(-1) / XSet(0) -> maxCap - 3
}
