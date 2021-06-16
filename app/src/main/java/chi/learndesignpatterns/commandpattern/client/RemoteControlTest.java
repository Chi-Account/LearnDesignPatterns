package chi.learndesignpatterns.commandpattern.client;

import chi.learndesignpatterns.commandpattern.command.Command;
import chi.learndesignpatterns.commandpattern.command.HotTubOffCommand;
import chi.learndesignpatterns.commandpattern.command.HotTubOnCommand;
import chi.learndesignpatterns.commandpattern.command.LightOffCommand;
import chi.learndesignpatterns.commandpattern.command.LightOnCommand;
import chi.learndesignpatterns.commandpattern.command.MacroCommand;
import chi.learndesignpatterns.commandpattern.command.StereoOffCommand;
import chi.learndesignpatterns.commandpattern.command.StereoOnCommand;
import chi.learndesignpatterns.commandpattern.command.TVOffCommand;
import chi.learndesignpatterns.commandpattern.command.TVOnCommand;
import chi.learndesignpatterns.commandpattern.invoker.RemoteControl;
import chi.learndesignpatterns.commandpattern.receiver.HotTub;
import chi.learndesignpatterns.commandpattern.receiver.Light;
import chi.learndesignpatterns.commandpattern.receiver.Stereo;
import chi.learndesignpatterns.commandpattern.receiver.TV;

public class RemoteControlTest {

    public static void main(String[] args) {
        // Receiver
        Light light = new Light("Living Room");
        TV tv = new TV("Living Room");
        Stereo stereo = new Stereo("Living Room");
        HotTub hotTub = new HotTub();

        // Command
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        TVOnCommand tvOnCommand = new TVOnCommand(tv);
        StereoOnCommand stereoOnCommand = new StereoOnCommand(stereo);
        HotTubOnCommand hotTubOnCommand = new HotTubOnCommand(hotTub);
        Command[] onCommands = {
                lightOnCommand,
                tvOnCommand,
                stereoOnCommand,
                hotTubOnCommand
        };
        // Macro Command
        MacroCommand onMacroCommand = new MacroCommand(onCommands);

        LightOffCommand lightOffCommand = new LightOffCommand(light);
        TVOffCommand tvOffCommand = new TVOffCommand(tv);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);
        HotTubOffCommand hotTubOffCommand = new HotTubOffCommand(hotTub);
        Command[] offCommands = {
                lightOffCommand,
                tvOffCommand,
                stereoOffCommand,
                hotTubOffCommand
        };
        MacroCommand offMacroCommand = new MacroCommand(offCommands);

        // Invoker
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(0, onMacroCommand, offMacroCommand);

        System.out.println(remoteControl.toString());
        System.out.println("\n----- On -----");
        remoteControl.onButtonWasPushed(0);
        System.out.println("\n----- Undo -----");
        remoteControl.undoButtonWasPushed();
        System.out.println("\n----- On -----");
        remoteControl.onButtonWasPushed(0);
        System.out.println("\n----- Off -----");
        remoteControl.offButtonWasPushed(0);
    }
}
