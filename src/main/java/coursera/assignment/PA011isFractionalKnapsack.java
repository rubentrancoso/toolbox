package coursera.assignment;

import java.util.Scanner;

public class PA011isFractionalKnapsack {

	public static double getOptimalValue(int capacity, int[] values, int[] weights) {
		int n = values.length;
		// value in the knapsack
		double value = 0;
		// remaining capacity
		int W = capacity;
		// all densities
		double[] density = new double[values.length];
		// prepare densities
		for (int i = 0; i < n; i++) {
			if (weights[i] > 0)
				density[i] = values[i] / (weights[i] * 1.0);
		}

		// for each item
		for (int i = 0; i < n; i++) {
			// return the total value when capacity reaches zero
			if (W == 0)
				return value;

			// reset pointer the me greatest density
			int maxDensityIndex = -1;
			double currentMaxDensity = 0;

			// find de greatest density
			for (int j = 0; j < n; j++) {

				if (density[j] != 0 & density[j] > currentMaxDensity) {
					currentMaxDensity = density[j];
					maxDensityIndex = j;
				}
			}
			// remove already used density just if theres a maxDensity available
			if (maxDensityIndex > -1) {
				density[maxDensityIndex] = 0;

				double wTaken = 0;
				if (weights[maxDensityIndex] > W) {
					wTaken = W;
				} else {
					wTaken = weights[maxDensityIndex];
				}
				value += (wTaken * currentMaxDensity);
				W -= wTaken;
			}
		}
		return value;
	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int capacity = scanner.nextInt();
		int[] values = new int[n];
		int[] weights = new int[n];
		for (int i = 0; i < n; i++) {
			values[i] = scanner.nextInt();
			weights[i] = scanner.nextInt();
		}
		System.out.printf("%.3f\n", getOptimalValue(capacity, values, weights));
	}
}
