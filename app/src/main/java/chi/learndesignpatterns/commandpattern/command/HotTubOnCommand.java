package chi.learndesignpatterns.commandpattern.command;

import chi.learndesignpatterns.commandpattern.receiver.HotTub;

public class HotTubOnCommand implements Command {

    private HotTub hotTub;

    public HotTubOnCommand(HotTub hotTub) {
        this.hotTub = hotTub;
    }

    @Override
    public void execute() {
        hotTub.on();
    }

    @Override
    public void undo() {
        hotTub.off();
    }
}
