package toolbox.codility.lesson4.countingelements.MaxCounters;

public class Solution {


	// https://codility.com/demo/results/trainingUHE6RG-USA/
	public int[] solution(int N, int[] A) {
		int[] B = new int[N];
		int max = 0;
		int localMax = 0;
		for (int counterRef : A) {
			int counterIndex = counterRef-1;
			if (counterIndex == N) {
				// set max to a pre-calculated value
				max = localMax;
			} else {
				// initial value is the current counter os max indicator
				int baseValue = Math.max(max, B[counterIndex]);
				// increment to the new value
				int newValue = baseValue + 1;
				// set the new incremented value
				B[counterIndex] = newValue;
				// keep track of the max value throught opcodes
				localMax = Math.max(newValue, localMax);
			}
		}
		for (int i = 0; i < B.length; i++) {
			B[i] = Math.max(max, B[i]);
		}
		return B;
	}

}