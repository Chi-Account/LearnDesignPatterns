package chi.learndesignpatterns.iteratorpattern.iterator;

import java.util.Iterator;

import chi.learndesignpatterns.iteratorpattern.menu.MenuComponent;

public class NullIterator implements Iterator<MenuComponent> {

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public MenuComponent next() {
        return null;
    }
}
