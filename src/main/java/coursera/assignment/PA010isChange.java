package coursera.assignment;

import java.util.Scanner;

public class PA010isChange {

	// 1, 5, 10

	public static int getChange(int m) {
		int dez = m / 10;
		int resto10 = m % 10;
		int cinco = resto10 / 5;
		int resto5 = resto10 % 5;
		int um = resto5 / 1;
		int restoUm = resto5 % 1;

		// write your code here
		return dez + cinco + um;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		System.out.println(getChange(m));
	}
}
