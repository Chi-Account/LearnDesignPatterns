package chi.learndesignpatterns.iteratorpattern;

import java.util.Iterator;

import chi.learndesignpatterns.iteratorpattern.iterator.CompositeIterator;
import chi.learndesignpatterns.iteratorpattern.menu.MenuComponent;

public class Waitress {

    private MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }

    public void printVegetarianMenu() {
        Iterator<MenuComponent> iterator = new CompositeIterator(allMenus.createIterator());
        System.out.println("\nVEGETARIAN MENU\n----");
        while (iterator.hasNext()) {
            MenuComponent menuComponent = iterator.next();
            try {
                if (menuComponent.isVegetarian()) {
                    menuComponent.print();
                }
            } catch (UnsupportedOperationException e) {
            }
        }
    }
}
