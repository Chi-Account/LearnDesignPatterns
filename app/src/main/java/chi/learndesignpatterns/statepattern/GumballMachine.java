package chi.learndesignpatterns.statepattern;

import chi.learndesignpatterns.statepattern.state.HasQuarterState;
import chi.learndesignpatterns.statepattern.state.NoQuarterState;
import chi.learndesignpatterns.statepattern.state.SoldOutState;
import chi.learndesignpatterns.statepattern.state.SoldState;
import chi.learndesignpatterns.statepattern.state.State;
import chi.learndesignpatterns.statepattern.state.WinnerState;

public class GumballMachine {

    private State soldOutState;
    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;
    private State winnerState;

    private State state;
    private int count;

    public GumballMachine(int count) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);
        this.count = count;
        if (count > 0) {
            state = noQuarterState;
        } else {
            state = soldOutState;
        }
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getCount() {
        return count;
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            count = count - 1;
        }
    }

    public void refill(int count) {
        this.count += count;
        System.out.println("The gumball machine was just refilled; its new count is: " + this.count);
        state.refill();
    }

    @Override
    public String toString() {
        StringBuilder resultBuilder = new StringBuilder();
        resultBuilder.append("\nMighty Gumball, Inc.");
        resultBuilder.append("\nJava-enabled Standing Gumball Model #2004");
        resultBuilder.append("\nInventory: " + count + " gumball");
        if (count > 1) {
            resultBuilder.append("s");
        }
        resultBuilder.append("\nMachine is " + state + "\n");
        return resultBuilder.toString();
    }
}
