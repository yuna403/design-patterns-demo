package designpatterns.iterator.MenuIterator;


// 测试类
public class MenuTestDrive {
    public static void main(String[] args) {
        Menu pancakeHouseMenu = new PancakeHouseMenu();
        Menu dinerMenu = new DinerMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);

        System.out.println("=== 早餐菜单 ===");
        waitress.printBreakfastMenu();

        System.out.println("\n=== 午餐菜单 ===");
        waitress.printLunchMenu();

        System.out.println("\n=== 所有菜单 ===");
        waitress.printAllMenu();
    }
}
