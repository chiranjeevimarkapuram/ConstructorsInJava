package casestudy;

public class Hotel_Encaps {
	private int roomNumber;
	private String guestName;
	private String roomType;
	private double roomPrice;
	private boolean isBooked;

	// getter for room number
	public int getRoomNumber() {
		return roomNumber;
	}

	// setter for room number
	public boolean setRoomNumber(int roomNumber) {
		if (roomNumber > 0) {
			this.roomNumber = roomNumber;
			return true;
		}
		System.out.println("Room number must be greater than zero.");
		return false;
	}

	public String getGuestName() {
		return guestName;
	}

	public void setGuestName(String guestName) {
		if (guestName != null) {
			this.guestName = guestName;
		} else {
			System.out.println("Guest Cannot be Empty..!");
		}
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		if (roomType.equalsIgnoreCase("Standard")) {
			this.roomType = "Standard";
			this.roomPrice = 2000;
		} else if (roomType.equalsIgnoreCase("Deluxe")) {
			this.roomType = "Deluxe";
			this.roomPrice = 3500;
		} else {
			System.out.println("Invalid Room Type");
		}
	}

	public double getRoomPrice() {
		return roomPrice;
	}

	public void setRoomPrice(double roomPrice) {
		this.roomPrice = roomPrice;
	}

	public boolean isBooked() {
		return isBooked;
	}

	public void setBooked(boolean isBooked) {
		this.isBooked = isBooked;
	}

	public void roomBookStatus() {
		if (!isBooked) {
			isBooked = true;
			System.out.println("Room Booked Successfully");
		} else {
			System.out.println("Room Not Booked");
		}
	}
}
