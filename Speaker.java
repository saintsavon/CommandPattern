public class Speaker {
	String location;

	public Speaker(String location) {
		this.location = location;
	}

	public void on() {
		System.out.println(location + " speaker is on");
	}

	public void off() {
		System.out.println(location + " speaker is off");
	}

	public void setConfig(String config) {
		System.out.println(location + " speaker config set to " + config + " mode");
	}

	public void setVolume(int volume) {
		System.out.println(location + " speaker volume set to " + volume);
	}
}