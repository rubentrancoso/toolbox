package toolbox.codility.lesson4.countingelements.FrogRiverOne;

import java.util.HashSet;
import java.util.Set;

public class Solution {
	// https://codility.com/demo/results/trainingSK3UVU-5FM/
    public int solution(int X, int[] A) {
    	Set<Integer> pos = new HashSet<Integer>();
    	for(int i=1;i<=X;i++) {
    		pos.add(i);
    	}
    	int result = -1;
    	int size = A.length;
    	for(int second=0;second<size;second++) {
    		pos.remove(A[second]);
    		if(pos.size()==0)
    			return second;
    	}
		return result;
    }

}