package infoPractice;

import java.util.Scanner;

public class PerfectSquareSumPairs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		int a[] = new int[size];

		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}
		int count = 0;
//		for (int i = 0; i < size; i++) {
//			for (int j = i + 1; j < size; j++) {
//				long add = (long) a[i] + a[j];
//				long sqrt = (long) Math.sqrt(add);
//				if (sqrt * sqrt == add) {
//					count++;
//				}
//			}
//		}
//		System.out.println(count);

		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				int k = 0;
				long sum = (long) a[i] + a[j];
				while (k * k <= sum) {
					if (k * k == sum) {
						count++;
						break;
					}
					k++;

				}

			}

		}
		System.out.println(count);

	}

}
