package chi.learndesignpatterns.decoratorpattern.starbuzz.beverage;

public abstract class Beverage {

    protected String description = "Unknown Beverage";

    private Size size = Size.TALL;

    public String getDescription() {
        return description;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public abstract double cost();

    public enum Size {
        TALL, GRANDE, VENTI
    }
}
