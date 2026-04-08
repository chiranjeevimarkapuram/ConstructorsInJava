package casestudy;

import java.util.Scanner;

public class HotelRoom {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Hotel_Encaps he = new Hotel_Encaps();
		System.out.println("Welcome To Our Place Hotel..");
		System.out.println("please Enter Your Name : ");
		he.setGuestName(sc.next());
		boolean valid = true;
		do {
			System.out.print("Enter Room Number: ");
			valid = he.setRoomNumber(sc.nextInt());
		} while (!valid);

		System.out.println("Please Enter Room Type (Standard/Deluxe):");
		he.setRoomType(sc.next());

		System.out.println("**************************");
		he.roomBookStatus();
		if (he.isBooked()) {
			System.out.println("------Room Details------");
			System.out.println("Your Name: " + he.getGuestName());
			System.out.println("Your Room Number :" + he.getRoomNumber());
			System.out.println("Your Room Type : " + he.getRoomType());
			System.out.println("Your Room Is :" + he.getRoomPrice());
		}
		System.out.println();

	}

}
