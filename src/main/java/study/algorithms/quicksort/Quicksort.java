package study.algorithms.quicksort;

import java.util.ArrayList;
import java.util.List;

public class Quicksort {
	
	public static int[] sort(int[]_array) {
		List<Integer> input = array2list(_array);
		List<Integer> result = quicksort(input);
		return list2array(result);
	}
	
	private static List<Integer> quicksort(List<Integer> _array) {
		if(_array.size()<2)
			return _array;
		Integer pivot = getPivot(_array);
		List<Integer> leftarray = new ArrayList<Integer>();
		List<Integer> rightarray = new ArrayList<Integer>();
		List<Integer> sortedarray = new ArrayList<Integer>();
		for(int i=0;i<_array.size()-1;i++) {
			if(_array.get(i)<=pivot) {
				leftarray.add(_array.get(i));
			} else {
				rightarray.add(_array.get(i));
			}
		}
		leftarray = quicksort(leftarray);
		rightarray = quicksort(rightarray);
		sortedarray.addAll(0, leftarray);
		sortedarray.add(pivot);
		sortedarray.addAll(sortedarray.size(), rightarray);
		return sortedarray;
	}

	private static int[] list2array(List<Integer> sortedarray) {
		int[] array = new int[sortedarray.size()];
		for(int i=0;i<sortedarray.size();i++) {
			array[i] = sortedarray.get(i).intValue();
		}
		return array;
	}
	
	private static List<Integer> array2list(int[] somearray) {
		ArrayList<Integer> resultarray = new ArrayList<Integer>();
		for(int i=0;i<somearray.length;i++) {
			resultarray.add(new Integer(somearray[i]));
		}
		return resultarray;
	}

	private static int getPivot(List<Integer> _array) {
		return _array.get(_array.size()/2);
	}
	
}
