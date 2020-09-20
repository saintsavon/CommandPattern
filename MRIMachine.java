public class MRIMachine {
	String location = "";
	int level;
	public static final int HIGH = 2;
	public static final int MEDIUM = 1;
	public static final int LOW = 0;
 
	public MRIMachine(String location) {
		this.location = location;
	}
  
	public void high() {
		level = HIGH;
		System.out.println(location + " MRI Machine imaging is set to: high");
 
	} 

	public void medium() {
		level = MEDIUM;
		System.out.println(location + " MRI Machine imaging is set to: medium");
	}

	public void low() {
		level = LOW;
		System.out.println(location + " MRI Machine imaging is set to: low");
	}
 
	public void off() {
		level = 0;
		System.out.println(location + " MRI Machine is off");
	}

}