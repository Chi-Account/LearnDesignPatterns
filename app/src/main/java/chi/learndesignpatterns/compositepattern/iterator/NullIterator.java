package chi.learndesignpatterns.compositepattern.iterator;

import java.util.Iterator;

import chi.learndesignpatterns.compositepattern.menu.MenuComponent;

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
