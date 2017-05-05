package toolbox.codility.lesson4.countingelements.PermCheck;

import java.util.Arrays;

public class Solution {
	// https://codility.com/demo/results/trainingQ8RCQZ-BRT/
    public int solution(int[] A) {
    	double N = A.length;
    	Arrays.sort(A);
    	for(int i=0;i<N;i++) {
    		if(A[i] != i+1)
    			return 0;
    	}
    	return 1;
    }
}