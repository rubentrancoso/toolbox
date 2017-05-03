package toolbox.codility.lesson2.arrays.OddOccurrencesInArray;

import java.util.Arrays;

public class Solution1 {
	// https://codility.com/demo/results/trainingHJEWDC-Y9H/
	public int solution(int[] a) {
		Arrays.sort(a);
		int number = 0;
		for(int i=0;i<a.length;i++) {
			number ^= a[i];
		}
		return number;
	}
}