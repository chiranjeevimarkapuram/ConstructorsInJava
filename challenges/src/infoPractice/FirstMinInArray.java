package infoPractice;

public class FirstMinInArray {

	public static void main(String[] args) {
		int a[] = { 1, 32, 54, 7, 9, 32, 97, -110 ,-100};
//		int min = a[0];
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (min > a[i]) {
				min = a[i];
			}
		}
		System.out.println(min);
	}

}
