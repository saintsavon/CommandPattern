public class PatientRoom1TV {
	String location;

	public PatientRoom1TV(String location) {
		this.location = location;
	}

	public void on() {
		System.out.println(location + "'s TV is: On");
	}

	public void off() {
		System.out.println(location + "'s TV is: Off");
	}

}