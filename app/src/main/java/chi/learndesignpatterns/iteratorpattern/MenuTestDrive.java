package chi.learndesignpatterns.iteratorpattern;

import java.util.Iterator;

import chi.learndesignpatterns.iteratorpattern.iterator.CompositeIterator;
import chi.learndesignpatterns.iteratorpattern.menu.Menu;
import chi.learndesignpatterns.iteratorpattern.menu.MenuComponent;
import chi.learndesignpatterns.iteratorpattern.menu.MenuItem;

public class MenuTestDrive {

    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course!");

        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        pancakeHouseMenu.add(new MenuItem(
                "K&B's Pancake Breakfast",
                "Pancakes with scrambled eggs, and toast",
                2.99,
                true
        ));
        pancakeHouseMenu.add(new MenuItem(
                "Regular Pancake Breakfast",
                "Pancakes with fried eggs, sausage",
                2.99,
                false
        ));
        pancakeHouseMenu.add(new MenuItem(
                "Blueberry Pancakes",
                "Pancakes made with fresh blueberries",
                3.49,
                true
        ));
        pancakeHouseMenu.add(new MenuItem(
                "Waffles",
                "Waffles, with your choice blueberries or strawberries",
                3.59,
                true
        ));

        dinerMenu.add(new MenuItem(
                "Vegetarian BLT",
                "('Fakin') Bacon with lettuce & tomato on whole wheat",
                2.99,
                true
        ));
        dinerMenu.add(new MenuItem(
                "BLT",
                "Bacon with lettuce & tomato on whole wheat",
                2.99,
                false
        ));
        dinerMenu.add(new MenuItem(
                "Soup of the day",
                "Soup of the day, with a side of potato salad",
                3.29,
                false
        ));
        dinerMenu.add(new MenuItem(
                "Hotdog",
                "A hot dog, with sauerkraut, relish, onions, topped with cheese",
                3.05,
                false
        ));
        dinerMenu.add(dessertMenu);

        cafeMenu.add(new MenuItem(
                "Veggie Burger and Air Fries",
                "Veggie burger on a whole wheat bun, lettuce, tomato, and fries",
                3.99,
                true
        ));
        cafeMenu.add(new MenuItem(
                "Soup of the day",
                "A cup of the soup of the day, with a side salad",
                3.69,
                false
        ));
        cafeMenu.add(new MenuItem(
                "Burrito",
                "A large burrito, with whole pinto beans, salsa, guacamole",
                4.29,
                true
        ));

        dessertMenu.add(new MenuItem(
                "Apple Pie",
                "Apple pie with a flaky crust, topped with vanilla ice cream",
                1.59,
                true
        ));

        Waitress waitress = new Waitress(allMenus);

//        waitress.printMenu();

        waitress.printVegetarianMenu();

//        testCompositeIterator(allMenus);
    }

    public static void testCompositeIterator(MenuComponent menuComponent) {
        Iterator<MenuComponent> iterator = new CompositeIterator(menuComponent.createIterator());
        while (iterator.hasNext()) {
            MenuComponent item = iterator.next();
            System.out.println(item.getName());
        }
    }
}
