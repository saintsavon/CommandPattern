public class RemoteLoader {
 
	public static void main(String[] args) {
		RemoteControl remoteControl = new RemoteControl();
 
		Light waitingRoomLight = new Light("Waiting Room");
		Light operatingRoomLight = new Light("Operating Room");
		MRIMachine mriMachine= new MRIMachine("Radiation Room");
        SterilizationRoomDoor sterilizationRoomDoor = new SterilizationRoomDoor("Sterilization Room");
        HospitalBed hospitalBed = new HospitalBed("Patient Room: 1");
        Speaker speaker = new Speaker("Operating room");
        PatientRoom1Blinds patientRoom1Blinds = new PatientRoom1Blinds("Patient Room: 1");
        PatientRoom1TV patientRoom1TV = new PatientRoom1TV("Patient Room: 1");
        
        		
		Command speakerOnWithBluetooth = () -> { 
			speaker.on(); speaker.setConfig("Surround Sound"); speaker.setVolume(5);
        };

		remoteControl.setCommand(0, waitingRoomLight::on, waitingRoomLight::off);
        remoteControl.setCommand(1, operatingRoomLight::on, operatingRoomLight::off);
        
		remoteControl.setCommand(2, mriMachine::high, mriMachine::off);
        remoteControl.setCommand(3, speakerOnWithBluetooth, speaker::off);
        
        remoteControl.setCommand(4, sterilizationRoomDoor::close, sterilizationRoomDoor::lock);
        remoteControl.setCommand(5, hospitalBed::tilt, hospitalBed::lock);

        remoteControl.setCommand(6, patientRoom1Blinds::up, patientRoom1Blinds::down);
        remoteControl.setCommand(7, patientRoom1TV::on, patientRoom1TV::off);
  
		System.out.println(remoteControl);
 
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		remoteControl.onButtonWasPushed(1);
		remoteControl.offButtonWasPushed(1);
		remoteControl.onButtonWasPushed(2);
		remoteControl.offButtonWasPushed(2);
		remoteControl.onButtonWasPushed(3);
		remoteControl.offButtonWasPushed(3);
		remoteControl.onButtonWasPushed(4);  
		remoteControl.offButtonWasPushed(4);
        remoteControl.onButtonWasPushed(5);
        remoteControl.offButtonWasPushed(5);
        remoteControl.onButtonWasPushed(6);
        remoteControl.offButtonWasPushed(6);
        remoteControl.onButtonWasPushed(7);
        remoteControl.offButtonWasPushed(7);
	}
}