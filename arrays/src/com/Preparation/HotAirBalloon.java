package com.Preparation;

import java.util.Arrays;
import java.util.Scanner;

public class HotAirBalloon {

	public static void main(String[] agrs) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] array = new int[n];

		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}

		int w = sc.nextInt();
		
		Arrays.sort(array);
	}

}
