package infoPractice;

public class StringAscOrder {
	int countDigit(int num) {
		int count = 0;
		while (num != 0) {
			num = num / 10;
			count++;
		}
		return count;
	}

	void main() {
		int num = 987645123;
		int[] arr = new int[countDigit(num)];
		int add;
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			if (num != 0) {
				add = num % 10;
				arr[i] = add;
				num = num / 10;
			}
		}
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					arr[j] = arr[j] + arr[j + 1];
					arr[j + 1] = arr[j] - arr[j + 1];
					arr[j] = arr[j] - arr[j + 1];
				}
			}
		}
		for (int value : arr) {
			result = result * 10;
			result = result + value;
		}
		System.out.println(result);
	}
}