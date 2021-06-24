package chi.learndesignpatterns.facadepattern.subsystem;

public class TheaterLights {

    public void dim(int luminance) {
        System.out.println("Theater Ceiling Lights dimming to " + luminance + "%");
    }

    public void on() {
        System.out.println("Theater Ceiling Lights on");
    }
}
