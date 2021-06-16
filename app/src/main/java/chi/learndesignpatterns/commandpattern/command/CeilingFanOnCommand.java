package chi.learndesignpatterns.commandpattern.command;

import chi.learndesignpatterns.commandpattern.receiver.CeilingFan;

public class CeilingFanOnCommand implements Command {

    private CeilingFan ceilingFan;

    private int speed;

    private int previousSpeed;

    public CeilingFanOnCommand(CeilingFan ceilingFan, int speed) {
        this.ceilingFan = ceilingFan;
        this.speed = speed;
    }

    @Override
    public void execute() {
        previousSpeed = ceilingFan.getSpeed();
        ceilingFan.on(speed);
    }

    @Override
    public void undo() {
        ceilingFan.on(previousSpeed);
    }
}
