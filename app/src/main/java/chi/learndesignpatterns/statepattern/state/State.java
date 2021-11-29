package chi.learndesignpatterns.statepattern.state;

public abstract class State {

    public abstract void insertQuarter();

    public abstract void ejectQuarter();

    public abstract void turnCrank();

    public abstract void dispense();

    public void refill() {
    }
}
