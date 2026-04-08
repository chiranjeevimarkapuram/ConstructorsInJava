package com.Preparation;

import java.util.Scanner;

public class OxygenLevel {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] traineeLevels = new int[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (sc.hasNextInt()) {
					traineeLevels[i][j] = sc.nextInt();
				}
			}
		}

		// --- WRITE YOUR LOGIC HERE ---
		// 1. Calculate average for each trainee (row).
		// 2. Identify the maximum average.
		// 3. Print "Trainee Number: [X]".
		// 4. Handle "All trainees are unfit" if max average < 70.
		
		
	}

}
