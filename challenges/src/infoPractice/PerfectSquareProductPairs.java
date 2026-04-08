package infoPractice;

import java.util.Scanner;

public class PerfectSquareProductPairs {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int a[] = new int[size];
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}
		int count = 0;
		for (int j = 0; j < size; j++) {
			for (int k = j + 1; k < size; k++) {
				long product = (long) a[j] * a[k];
				long sqrt = (long) Math.sqrt(product);
				if (sqrt * sqrt == product) {
					count++;
				}
			}
		}
		System.out.println(count);
		sc.close();

	}
}
