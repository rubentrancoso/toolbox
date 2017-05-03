package assesment.codility.com.booking.y2017may3.task2;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int solution(Point3D[] A) {
    	int count = A.length;
    	Set<Double> circles = new HashSet<Double>();
    	for(int i=0;i<count;i++) {
    		double R = Math.sqrt(Math.pow(A[i].x, 2) + Math.pow(A[i].y, 2) + Math.pow(A[i].z, 2));
    		circles.add(R);
    	}
    	return circles.size();
    }
}