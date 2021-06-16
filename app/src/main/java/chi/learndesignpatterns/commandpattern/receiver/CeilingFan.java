package chi.learndesignpatterns.commandpattern.receiver;

public class CeilingFan {

    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;

    private String name;

    private int speed;

    public CeilingFan(String name) {
        this.name = name;
        speed = OFF;
    }

    public void on(int speed) {
        if (HIGH == speed) {
            high();
        } else if (MEDIUM == speed) {
            medium();
        } else if (LOW == speed) {
            low();
        } else if (OFF == speed) {
            off();
        }
    }

    private void high() {
        speed = HIGH;
        System.out.println(name + " ceiling fan is on high");
    }

    private void medium() {
        speed = MEDIUM;
        System.out.println(name + " ceiling fan is on medium");
    }

    private void low() {
        speed = LOW;
        System.out.println(name + " ceiling fan is on low");
    }

    public void off() {
        speed = OFF;
        System.out.println(name + " ceiling fan is off");
    }

    public int getSpeed() {
        return speed;
    }
}
