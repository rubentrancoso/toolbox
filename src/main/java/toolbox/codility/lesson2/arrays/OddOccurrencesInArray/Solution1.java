package toolbox.codility.lesson2.arrays.OddOccurrencesInArray;

public class Solution1 {
	// https://codility.com/demo/results/trainingJ2AGUF-FQR/
	public int solution(int[] a) {
		int number = 0;
		for(int i=0;i<a.length;i++) {
			number ^= a[i];
		}
		return number;
	}
}