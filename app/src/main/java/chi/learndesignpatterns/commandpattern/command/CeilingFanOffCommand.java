package chi.learndesignpatterns.commandpattern.command;

import chi.learndesignpatterns.commandpattern.receiver.CeilingFan;

public class CeilingFanOffCommand implements Command {

    private CeilingFan ceilingFan;

    private int previousSpeed;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        previousSpeed = ceilingFan.getSpeed();
        ceilingFan.off();
    }

    @Override
    public void undo() {
        ceilingFan.on(previousSpeed);
    }
}
