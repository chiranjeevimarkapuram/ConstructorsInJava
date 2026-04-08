package infoPractice;

import java.util.Scanner;

public class CubesInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] a = new int[size];
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}
		int count = 0;
		for (int i = 0; i < size; i++) {
			int num = a[i];
			int k = 0;
			while (k * k * k <= num) {
				if (k * k * k == num) {
					count++;
					System.out.println(a[i]+"<---");
					break;
				}
				k++;
			}

		}
		System.out.println(count);
		sc.close();
	}

}
