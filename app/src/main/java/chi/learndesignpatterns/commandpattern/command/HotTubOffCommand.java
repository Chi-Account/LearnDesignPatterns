package chi.learndesignpatterns.commandpattern.command;

import chi.learndesignpatterns.commandpattern.receiver.HotTub;

public class HotTubOffCommand implements Command {

    private HotTub hotTub;

    public HotTubOffCommand(HotTub hotTub) {
        this.hotTub = hotTub;
    }

    @Override
    public void execute() {
        hotTub.off();
    }

    @Override
    public void undo() {
        hotTub.on();
    }
}
