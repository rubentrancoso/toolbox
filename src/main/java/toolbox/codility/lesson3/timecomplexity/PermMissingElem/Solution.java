package toolbox.codility.lesson3.timecomplexity.PermMissingElem;

import java.util.Arrays;

// https://codility.com/programmers/lessons/3-time_complexity/perm_missing_elem/
	
//Complexity:

// expected worst-case time complexity is O(N);
// expected worst-case space complexity is O(1), 
// beyond input storage (not counting the storage required for input arguments).
// Elements of input arrays can be modified.



public class Solution {
	// https://codility.com/demo/results/training5264F7-S2W/
	public int solution(int[] A) {
		Arrays.sort(A);
		int result = 0;
		for(int i=0;i<A.length;i++) {
			if(A[i] != i+1) {
				if(i==0) {
					result = 1;
					break;
				} else {
					result = i+1;
					break;
				}
			}
		}
		return result;
    }
}