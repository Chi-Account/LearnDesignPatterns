package chi.learndesignpatterns.commandpattern.invoker;

import chi.learndesignpatterns.commandpattern.command.Command;
import chi.learndesignpatterns.commandpattern.command.NoCommand;

public class RemoteControl {

    private static final int SLOT_COUNT = 7;

    private Command[] onCommands;

    private Command[] offCommands;

    private Command undoCommand;

    public RemoteControl() {
        onCommands = new Command[SLOT_COUNT];
        offCommands = new Command[SLOT_COUNT];

        NoCommand noCommand = new NoCommand();
        for (int i = 0; i < SLOT_COUNT; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("----- Remote Control -----\n");
        for (int i = 0; i < SLOT_COUNT; i++) {
            stringBuilder.append("[slot ").append(i).append("] ")
                    .append(onCommands[i].getClass().getName())
                    .append("    ")
                    .append(offCommands[i].getClass().getName())
                    .append("\n");
        }
        stringBuilder.append("[undo] ")
                .append(undoCommand.getClass().getName());
        return stringBuilder.toString();
    }
}
