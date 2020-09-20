public class PatientRoom1Blinds {
	String location;

	public PatientRoom1Blinds(String location) {
		this.location = location;
	}

	public void up() {
		System.out.println(location + "'s blinds are: Up");
	}

	public void down() {
		System.out.println(location + "'s blinds are: Down");
	}

}