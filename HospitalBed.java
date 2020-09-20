public class HospitalBed {
	String location;

	public HospitalBed(String location) {
		this.location = location;
	}

	public void up() {
		System.out.println(location + "'s bed is: Up");
	}

	public void down() {
		System.out.println(location + "'s bed is: Down");
	}

	public void tilt() {
		System.out.println(location + "'s bed is: Tilting");
	}

	public void lock() {
		System.out.println(location + "'s bed is: Locked");
	}

}