public class RemoteLoader{

	public static void main(String[] args){
		RemoteControl remoteControl = new RemoteControl();

		Light livingRoomLight = new Light("Living Room");
		Light kitchenRoomLight = new Light("Kitchen Room");

		Stereo stereo = new Stereo();

		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
		LightOnCommand kitchenRoomLightOn = new LightOnCommand(kitchenRoomLight);
		LightOffCommand kitchenRoomLightOff = new LightOffCommand(kitchenRoomLight);
		StereoOnWithCDCommand stereoOnCommand = new StereoOnWithCDCommand(stereo);
		StereoOffCommand stereoOffCommand =  new StereoOffCommand(stereo);

		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remoteControl.setCommand(1, kitchenRoomLightOn, kitchenRoomLightOff);
		remoteControl.setCommand(4, stereoOnCommand, stereoOffCommand);


		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		remoteControl.onButtonWasPushed(1);
		remoteControl.offButtonWasPushed(1);
		remoteControl.onButtonWasPushed(4);
		remoteControl.offButtonWasPushed(4);
	}

}
