package assignmentblock;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int num = sc.nextInt();
int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
            System.out.println(i);
        }
        
	}

}
