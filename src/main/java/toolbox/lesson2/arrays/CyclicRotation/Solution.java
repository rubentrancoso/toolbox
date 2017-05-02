package toolbox.lesson2.arrays.CyclicRotation;

public class Solution {
	
	// https://codility.com/demo/results/training53KKZB-3KX/
	public int[] solution(int[] A, int K) {
		int size = A.length;
		int[] b = new int[size];
		for(int i=0;i<size;i++) {
			b[(i+K)%size] = A[i];
		}
		return b;
    }
}
