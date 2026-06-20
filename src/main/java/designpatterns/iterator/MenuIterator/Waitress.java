package designpatterns.iterator.MenuIterator;

import java.util.Iterator;

// 服务员
class Waitress {
    private Menu pancakeHouseMenu;
    private Menu dinerMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    // 打印早餐菜单
    public void printBreakfastMenu() {
        System.out.println("BREAKFAST MENU");
        printMenu(pancakeHouseMenu.createIterator());
    }

    // 打印午餐菜单
    public void printLunchMenu() {
        System.out.println("LUNCH MENU");
        printMenu(dinerMenu.createIterator());
    }

    // 打印所有菜单
    public void printAllMenu() {
        System.out.println("ALL MENUS");
        System.out.println("---- BREAKFAST ----");
        printMenu(pancakeHouseMenu.createIterator());
        System.out.println("---- LUNCH ----");
        printMenu(dinerMenu.createIterator());
    }

    // 辅助方法：打印迭代器中的菜单项
    private void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            printMenuItem(menuItem);
        }
    }

    // 打印单个菜单项
    private void printMenuItem(MenuItem menuItem) {
        System.out.print(menuItem.getName() + ", ");
        System.out.print(menuItem.getPrice() + " -- ");
        System.out.println(menuItem.getDescription());
    }
}
