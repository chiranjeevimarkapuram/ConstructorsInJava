package com.miniConsoleBasedProjects;

import java.util.Scanner;

public class Tic_Tac_Toe {
	static Scanner sc = new Scanner(System.in);
	static char[][] c = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };
	static char player = 'X';

	static void displayBoard() {
		System.out.println("-----------");
		for (int i = 0; i <= 2; i++) {
			System.out.print("| ");
			for (int j = 0; j <= 2; j++) {
				System.out.print(c[i][j] + " | ");
			}
			System.out.println();
			System.out.println("-----------");
		}
	}

	static boolean isdraw() {
		for (char[] a : c) {
			for (char a1 : a) {
				if (a1 == ' ') {
					return false;
				}
			}
		}
		return true;
	}

	static boolean isWin() {
		// Condition For Rows
		for (int i = 0; i <= 2; i++) {
			if (c[i][0] == player && c[i][1] == player && c[i][2] == player) {
				return true;
			}
		}

		// Condition For Cols
		for (int i = 0; i <= 2; i++) {
			if (c[0][i] == player && c[1][i] == player && c[2][i] == player) {
				return true;
			}
		}

		if (c[0][0] == player && c[1][1] == player && c[2][3] == player) {
			return true;
		}

		if (c[0][2] == player && c[1][1] == player && c[2][0] == player) {
			return true;
		}

		return false;

	}

	public static void main(String[] args) {
		boolean flag = true;
		while (flag) {
			displayBoard();
			System.out.println("Enter Row  Value:");
			int row = sc.nextInt();
			System.out.println("Enter Col Value : ");
			int col = sc.nextInt();
//			displayBoard();
			if (row < 0 || row > 2 || col < 0 || col > 2 || c[row][col] != ' ') {
				System.out.println(" Invalid Move..!");
				System.out.println("Select Again ..!");
				continue;
			} else {
				c[row][col] = player;
			}
			if (isWin()) {
				System.out.println("=====================================================");
				displayBoard();
				System.out.println(player + " you won the game !!!");
				break;
			}
			if (isdraw()) {
				displayBoard();
				System.out.println("Draw  match !!!!");
				break;
			}
			player = player == 'X' ? 'O' : 'X';
		}
	}

}
