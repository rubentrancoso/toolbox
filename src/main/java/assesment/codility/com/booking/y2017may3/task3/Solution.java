package assesment.codility.com.booking.y2017may3.task3;

public class Solution {

	// https://codility.com/c/feedback/UQYJ3J-R5D
	
	public int solution(int[] A, int[] B, int M, int X, int Y) {
		int lineSize = A.length;
		int capacity = X;
		int maxWeight = Y;
		int floors = M + 1;

		int[] stops = new int[floors];

		int usedCapacity = 0;
		int usedWeight = 0;
		int totalStops = 0;

		for (int i = 0; i < lineSize; i++) {
			// try to put people inside
			if ((usedCapacity + 1) <= capacity && (usedWeight + A[i]) <= maxWeight) {
				usedCapacity++;
				usedWeight += A[i];
				stops[B[i]] = 1;

				// look ahead
				if (i == lineSize-1 || !((usedCapacity + 1) <= capacity && (usedWeight + A[i + 1]) <= maxWeight)) {
					// free elevator
					usedCapacity = 0;
					usedWeight = 0;
					// floor stop
					totalStops += 1;
					for (int j = 0; j < stops.length; j++) {
						totalStops += stops[j];
					}
					stops = new int[floors];
				}
			}
		}
		return totalStops;
	}
}