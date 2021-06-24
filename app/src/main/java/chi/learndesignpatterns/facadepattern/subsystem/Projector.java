package chi.learndesignpatterns.facadepattern.subsystem;

public class Projector {

    public void on() {
        System.out.println("Top-O-Line Projector on");
    }

    public void widescreenMode() {
        System.out.println("Top-O-Line Projector in widescreen mode (16×9 aspect ratio)");
    }

    public void off() {
        System.out.println("Top-O-Line Projector off");
    }
}
