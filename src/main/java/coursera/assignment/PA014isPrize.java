package coursera.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PA014isPrize {

	public static List<Integer> findOptimal(int n) {
		int k = n;
		int candidate = 0;
		List<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			candidate++;
			if (candidate < k - candidate) {
				result.add(candidate);
				k -= candidate;
			} else {
				candidate = k;
				result.add(candidate);
				break;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		List<Integer> output = findOptimal(n);
		scanner.close();
		System.out.println(output.size());
		output.forEach(e -> System.out.print(e + " "));
	}
}
