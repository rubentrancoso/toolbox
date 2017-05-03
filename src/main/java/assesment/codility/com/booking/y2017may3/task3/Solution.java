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
			// (usedCapacity + 1) <= capacity : there's space for one person
			// (usedWeight + A[i]) <= maxWeigh : the persons weight is ok to sum
			if ((usedCapacity + 1) <= capacity && (usedWeight + A[i]) <= maxWeight) {
				usedCapacity++;
				usedWeight += A[i];
				if(stops[B[i]]==0) {
					stops[B[i]] = 1;
					totalStops++;
				}

				// look ahead
				// i == lineSize-1 : this person is inside and is the last one, so we lift it
				// !((usedCapacity + 1) <= capacity && (usedWeight + A[i + 1]) <= maxWeight) : no left space or weight
				if (i == lineSize-1 || !((usedCapacity + 1) <= capacity && (usedWeight + A[i + 1]) <= maxWeight)) {
					// free elevator
					usedCapacity = 0;
					usedWeight = 0;
					// floor stop
					totalStops += 1;
					for (int j = 0; j < floors; j++) {
						stops[j] = 0;
					}
					//stops = new int[floors];
				}
			}
		}
		return totalStops;
	}
}