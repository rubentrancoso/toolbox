package assesment.pivotal;

import java.util.Arrays;

public class XSet {
	
	protected int maxCapacity;
	private int[] values = null;
	private int counter = 0;

	/**
	 * 
	 * @param maxCapacity - max set capacity
	 */
	public XSet(int maxCapacity) {
		if(maxCapacity <= 0)
			this.maxCapacity = 3;
		else
			this.maxCapacity = maxCapacity;
		values = new int[maxCapacity];
	}

	public void add(int i) {
		// use Java libraries as much as possible -- only if you master them
		boolean found = Arrays.asList(values).contains(i);
		// the conversion -> Object[]
		// obj.equals();
		if(!found)
			this.values[counter++] = i;
	}

	public int getSize() {
		return this.counter;
	}
	
	// why thhis method - what it brings to class API ?
	private boolean findValue(int value) {
		for(int i=0;i<counter;i++) {
			if(this.values[i] == value) {
				return true;
			}
		}
		return false;
	}

	
	// option 1
	// protected maxCap
	
	// option 2
	// private maxCapacity
	// protected getMaxCapcity
}
