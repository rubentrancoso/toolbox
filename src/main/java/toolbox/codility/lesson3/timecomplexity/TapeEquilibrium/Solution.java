package toolbox.codility.lesson3.timecomplexity.TapeEquilibrium;

public class Solution {
	// https://codility.com/demo/results/training57YN3Y-U8A/
	public int solution(int[] A) {
		int total = 0;
		int size = A.length;
		for (int i = 0; i < size; i++) {
			total += A[i];
		}
		int firstPart = 0; 
		int secondPart = total;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < size-1; i++) {
			firstPart += A[i];
			secondPart -= A[i];
			int diff = Math.abs(firstPart - secondPart);
			if (diff < min)
				min = diff;
		}
		return min;
	}
}