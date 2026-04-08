package infoPractice;

public class SecongMinimunNum {

	public static void main(String[] args) {
		int[] a = { 10, 45, 23, 45, 8, 12 };
		int min = Integer.MAX_VALUE;
		int secmin = Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				secmin = min;
				min = a[i];
			} else if (a[i] > min && a[i] < secmin) {
				secmin = a[i];
			}
		}

//		if (secmin == Integer.MAX_VALUE) {
//			System.out.println(" ");
//		} else {
		System.out.println(secmin);
//		}
	}

}
