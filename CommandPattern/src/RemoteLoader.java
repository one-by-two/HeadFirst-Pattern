
public class RemoteLoader {
	public static void main(String[] args) {
		RemoteControlWithUndo remote = new RemoteControlWithUndo();
		Light light = new Light("Living Room");
		Stereo stereo = new Stereo("Living Room");
		CeilingFan ceilingFan = new CeilingFan("Living Room");
		
		LightOnCommand lightOn = new LightOnCommand(light);
		StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo);
		CeilingFanHighCommand fanHigh = new CeilingFanHighCommand(ceilingFan);
		
		LightOffCommand lightOff = new LightOffCommand(light);
		StereoOffCommand stereoOff = new StereoOffCommand(stereo);
		CeilingFanOffCommand fanOff = new CeilingFanOffCommand(ceilingFan);

		Command[] partyOn = { lightOn, stereoOn, fanHigh };
		Command[] partyOff = { lightOff, stereoOff, fanOff };
		
		MacroCommand partyOnMacro = new MacroCommand(partyOn);
		MacroCommand partyOffMacro = new MacroCommand(partyOff);
		
		remote.setCommand(0, partyOnMacro, partyOffMacro);
		
		System.out.println(remote);
		System.out.println("--- Pushing Macro On ---");
		remote.onButtonWasPushed(0);
		System.out.println("--- Pushing Macro Off ---");
		remote.offButtonWasPushed(0);
		System.out.println("--- Pushing Macro Undo ---");
		remote.undoButtonWasPushed();
	}
}
