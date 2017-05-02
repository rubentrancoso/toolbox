package toolbox.lesson2.arrays.OddOccurrencesInArray;

import java.util.Arrays;

public class Solution {
	// https://codility.com/demo/results/trainingVGGAHW-MX6/
	public int solution(int[] a) {
		Arrays.sort(a);
		int pos = 0;
		boolean found = false;
		while (!found) {
			if ((pos + 1) == a.length || a[pos] != a[pos + 1]) {
				found = true;
				break;
			}
			pos += 2;
		}
		return a[pos];
	}
}