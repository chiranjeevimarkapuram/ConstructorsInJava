package loops;

/*Java:
1. Write a Java program to perform the following tasks:
Print all upper case alphabets (A to Z) and lower case alphabets (a to z).
Print each upper case alphabet (A to Z) along with its corresponding position number (A 1, B 2, C 3, …, Z 26).
Output : 
Upper case Alphabets (A to Z):
A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
Lower case Alphabets (a to z):
a b c d e f g h i j k l m n o p q r s t u v w x y z
Alphabets with Numbers:
A -> 1
B ->2
C -> 3
...
Z -> 26*/

public class PosAlphabets {
	public static void main(String[] args) {
		int pos = 0;
		System.out.println("UpperCase");
		for (char A = 'A'; A <= 'Z'; A++) {
			System.out.print(A + " ");
		}
		System.out.println();
		System.out.println("LowerCase");
		for (char s = 'a'; s <= 'z'; s++) {
			System.out.print(s + " ");
		}
		System.out.println();
		System.out.println("Postioning UpperCase");
		for (char post = 'A'; post <= 'Z'; post++) {
			pos++;
			System.out.println(post + "->" + pos + " ");
		}
		System.out.println();
		System.out.println("Postioning LowerCase");
		int pos1 = 0;
		for (char post1 = 'a'; post1 <= 'z'; post1++) {
			pos1++;
			System.out.println(post1 + "->" + pos1 + " ");
		}
	}
}
