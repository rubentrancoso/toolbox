package coursera.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PA015isMaximizeSalary {

	public static String findOptimal(List<Integer> values) {
		String answer = "";
		int maxDigit;
		int maxIndex;
		while (!values.isEmpty()) {
			maxDigit = -1;
			maxIndex = -1;
			for (int i = 0; i < values.size(); i++) {
				if (isGreaterOrEqual(values.get(i), maxDigit)) {
					maxDigit = values.get(i);
					maxIndex = i;
				}
			}
			if (maxIndex > -1) {
				answer += maxDigit;
				values.remove(maxIndex);
			}
		}
		return answer;
	}

	private static boolean isGreaterOrEqual(int digit, int maxDigit) {
		if (maxDigit < 0)
			return true;
		String a = Integer.toString(digit);
		String b = Integer.toString(maxDigit);
		Integer c = Integer.parseInt(a + b);
		Integer d = Integer.parseInt(b + a);
		if (c >= d)
			return true;
		return false;
	}

	public static int firstDigit(int n) {
		while (n < -9 || n > 9)
			n /= 10;
		return n;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		List<Integer> values = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			values.add(scanner.nextInt());
		}
		String output = findOptimal(values);
		scanner.close();
		System.out.println(output);
	}
}
