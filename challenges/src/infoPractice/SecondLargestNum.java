package infoPractice;

public class SecondLargestNum {
	public static void main(String[] args) {
		int[] a = { 0, 45, 23, 45, 8, 12 };
//		int max = -1;
//		int secmax = -1;

		int max = Integer.MIN_VALUE;
		int secmax = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				secmax = max; // using after integer Intailization
				max = a[i];
			} else if (a[i] > secmax && a[i] != max) {
				secmax = a[i];
			}
		}
		System.out.println(secmax);
	}
}
