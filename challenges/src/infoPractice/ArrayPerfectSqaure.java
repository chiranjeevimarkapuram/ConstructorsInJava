package infoPractice;

public abstract class ArrayPerfectSqaure {

	public static void main(String[] args) {
		int[] a = { 1, 4, 2, 6, 8, 9, 81, 16, 49, 63 };
		for (int i = 0; i < a.length; i++) {
			int j = 1;
			while (j * j <= a[i]) {
				if (j * j == a[i]) {
					System.out.println(a[i] + "<---" + "is perfect square");
					break;
				}
				j++;
			}
		}

	}

}
