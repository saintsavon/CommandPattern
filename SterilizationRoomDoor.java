public class SterilizationRoomDoor {
	String location;

	public SterilizationRoomDoor(String location) {
		this.location = location;
	}

	public void open() {
		System.out.println(location + " door is: Open");
	}

	public void close() {
		System.out.println(location + " door is: Closed");
	}

	public void lock() {
		System.out.println(location + " door is: Locked");
	}

}