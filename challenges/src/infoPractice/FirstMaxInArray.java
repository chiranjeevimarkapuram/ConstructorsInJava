package infoPractice;

public class FirstMaxInArray {

	public static void main(String[] args) {
		int a[] = { 1, 32, 54, 7, 9, 32, 97,-110 };
//		int max = a[0];
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}
		}
		System.out.println(max);
	}

}
