package infoPractice;

public class RevArray {

	public static void main(String[] args) {
		int a[] = { 1, 32, 54, 7, 9, 32, 97, -110 };
//		for (int i = a.length - 1; i >= 0; i--) {
//			System.out.print(a[i] + " ");
//
//		}

		int i = 0;
		int j = a.length - 1;
		int temp = 0;

		while (i < j) {
			temp = a[i];
			a[j] = a[i];
			a[i] = temp;
			j--;
			i++;
		}
		System.out.println();

	}

}
