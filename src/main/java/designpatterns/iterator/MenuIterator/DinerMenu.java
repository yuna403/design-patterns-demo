package designpatterns.iterator.MenuIterator;

import java.util.Iterator;

// 餐厅菜单
class DinerMenu implements Menu {
    private static final int MAX_ITEMS = 6;
    private MenuItem[] menuItems;
    private int numberOfItems = 0;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("Vegetarian BLT",
                "(Fakin') Bacon with lettuce & tomato on whole wheat",
                true, 2.99);
        addItem("BLT",
                "Bacon with lettuce & tomato on whole wheat",
                false, 2.99);
    }

    public void addItem(String name, String description,
                        boolean vegetarian, double price) {
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Menu is full! Can't add more items");
            return;
        }
        menuItems[numberOfItems] = new MenuItem(name, description, vegetarian, price);
        numberOfItems++;
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}