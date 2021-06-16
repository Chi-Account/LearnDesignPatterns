package chi.learndesignpatterns.commandpattern.receiver;

public class GarageDoor {

    private String name;

    public GarageDoor(String name) {
        this.name = name;
    }

    public void open() {
        System.out.println(name + " garage door open");
    }

    public void close() {
        System.out.println(name + " garage door close");
    }
}
