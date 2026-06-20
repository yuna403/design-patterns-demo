package designpatterns.iterator.MenuComponent;

import java.util.Iterator;

// 服务员类
class Waitress {
    private MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }

    public void printVegetarianMenu() {
        System.out.println("\nVEGETARIAN MENU");
        System.out.println("----------------");
        printVegetarian(allMenus.createIterator());
    }

    private void printVegetarian(Iterator<MenuComponent> iterator) {
        while (iterator.hasNext()) {
            MenuComponent menuComponent = iterator.next();
            try {
                if (menuComponent.isVegetarian()) {
                    menuComponent.print();
                }
            } catch (UnsupportedOperationException e) {
                // 忽略不支持的操作
            }
        }
    }
}
