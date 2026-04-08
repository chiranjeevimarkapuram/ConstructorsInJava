package infoPractice;

import java.util.Scanner;

public class CountPairswithProductEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] a = new int[size];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] * a[j] % 2 == 0) {
					count++;
//					System.out.println(a[i] + "<----");
//					break;
				} 
			}
		}
		System.out.println(count);
	}

}
