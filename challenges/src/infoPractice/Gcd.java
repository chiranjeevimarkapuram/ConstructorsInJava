package infoPractice;

import java.util.Scanner;

 class Gcd {

	static int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int[] a = new int[s];

		for (int i = 0; i < s; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Enter K value");
		int k = sc.nextInt();

		int count = 0;
		for (int i = 0; i < a.length; i++) {
			int g = 0;
			for (int j = i; j < a.length; j++) {
				g = gcd(g, a[j]);
				if (g == k) {
//					System.out.println(a[i] + "," + a[j]);
					count++;
				}
				if (g < k) {
					break;
				}

			}
		}
		System.out.println(count);
		sc.close();
	}

}
