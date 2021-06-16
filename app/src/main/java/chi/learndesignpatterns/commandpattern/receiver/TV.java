package chi.learndesignpatterns.commandpattern.receiver;

public class TV {

    private String name;

    public TV(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(name + " TV is on");
    }

    public void off() {
        System.out.println(name + " TV is off");
    }
}
