package casestudy;

//Login System With Limited Attempts By using Do while 
import java.util.Scanner;

public class PassDoWhile {

	public static void main(String[] args) {
		System.out.println("Main Method Started..!");
		int c = 0;
		do {
			c++;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Password:");
			String s2 = sc.next();

			String s1 = "Java123";
			if (s1.equalsIgnoreCase(s2)) {
				System.out.println("Access Granted");
				break;
			} else {
				for (int i = 0; i <= 3; i++) {
					if (i >= c) {
						System.out.println("Account Locked");
						System.out.println("Try Again ..");
						System.out.println(i + "  Chance Completed ..!");
						// System.out.println("You Have only few Chances left");
						break;
					}
				}
			}

		} while (c <= 2);

		System.out.println("Main method Ended ..!");

	}

}
