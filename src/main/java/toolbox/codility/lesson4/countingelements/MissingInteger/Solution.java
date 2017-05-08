package toolbox.codility.lesson4.countingelements.MissingInteger;

import java.util.HashSet;
import java.util.Set;

public class Solution {

	// https://codility.com/demo/results/trainingR6WUNS-DUG/
    public int solution(int[] A) {
    	Set<Integer> values = new HashSet<Integer>();
    	for(int i=0;i<A.length;i++) {
    		if(A[i]>0)
    			values.add(A[i]);
    	}
    	int min = 1;
    	while(values.contains(min)) {
    		min++;
    	}
    	return min;
    }
}