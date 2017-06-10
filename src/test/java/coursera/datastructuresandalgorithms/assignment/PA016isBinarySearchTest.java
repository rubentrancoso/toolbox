package coursera.datastructuresandalgorithms.assignment;
import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import coursera.datastructuresandalgorithms.assignment.PA016isBinarySearch;

public class PA016isBinarySearchTest {

	@Test
	public void search() {
		int[] a =  {1, 5, 8, 12, 13};
		int[] keys = {8, 1, 23, 1, 11};
		int[] result = {2, 0, -1, 0, -1};
		int[] output = new int[keys.length];
		for(int i=0;i<keys.length;i++) {
			output[i] = PA016isBinarySearch.binarySearch(a, keys[i]);
		}
		assertArrayEquals(output, result);
	}
	
	@Test
	public void search1() {
		int[] a =  {2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
		int[] keys = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		int[] result = {-1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, -1};
		int[] output = new int[keys.length];
		for(int i=0;i<keys.length;i++) {
			output[i] = PA016isBinarySearch.binarySearch(a, keys[i]);
		}
		assertArrayEquals(output, result);
	} 

}