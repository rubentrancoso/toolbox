package toolbox.codility.lesson4.countingelements.PermCheck;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
	// https://codility.com/demo/results/trainingQ8RCQZ-BRT/
    public int solution0(int[] A) {
    	double N = A.length;
    	Arrays.sort(A);
    	for(int i=0;i<N;i++) {
    		if(A[i] != i+1)
    			return 0;
    	}
    	return 1;
    }
    
    // https://codility.com/demo/results/trainingEMH3BH-8UX/
    public int solution(int[] A) {
    	double N = A.length;
    	Set<Integer> bag = new HashSet<Integer>();
    	int max = 0;
    	for(int i=0;i<N;i++) {
    		bag.add(A[i]);
    		if(A[i]>max)
    			max = A[i];
    	}
    	if(bag.size() == N && max == N)
    		return 1;
    	return 0;
    }    
}