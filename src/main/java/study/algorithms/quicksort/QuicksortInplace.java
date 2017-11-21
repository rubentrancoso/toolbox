package study.algorithms.quicksort;

public class QuicksortInplace {
	
	private static int[] array;

	public static int[] sort(int[]_array) {
		array = _array;
		if(_array.length>1)
			quicksort(0,array.length-1);
		return array;
	}
	
	private static void quicksort(int low, int high) {
		int i = low, j = high;
		int pivot = array[low + (high - low) / 2];
		while(i<=j) {
			while(array[i]<pivot) i++;
			while(array[j]>pivot) j--;
			if (i <= j) {
                exchange(i, j);
                i++;
                j--;
            }
		}
		if(low < j) quicksort(low,j);
		if(i < high) quicksort(i,high);
	}
	
	
	private static void exchange(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
