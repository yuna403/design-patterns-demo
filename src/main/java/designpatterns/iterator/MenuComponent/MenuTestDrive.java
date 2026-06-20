package designpatterns.iterator.MenuComponent;

// 测试类
public class MenuTestDrive {
    public static void main(String[] args) {
        // 创建顶级菜单
        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");

        // 创建早餐菜单
        MenuComponent breakfastMenu = new Menu("BREAKFAST MENU", "Morning Favorites");
        breakfastMenu.add(new MenuItem("Pancakes", "Fluffy pancakes with maple syrup", true, 3.99));
        breakfastMenu.add(new MenuItem("Waffles", "Crispy waffles with berries", true, 4.49));
        breakfastMenu.add(new MenuItem("Bacon & Eggs", "Fried eggs with crispy bacon", false, 5.99));

        // 创建午餐菜单
        MenuComponent lunchMenu = new Menu("LUNCH MENU", "Midday Delights");
        lunchMenu.add(new MenuItem("BLT", "Bacon, lettuce, and tomato sandwich", false, 6.99));
        lunchMenu.add(new MenuItem("Veggie Burger", "Plant-based burger with fries", true, 8.99));

        // 创建甜点子菜单
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Sweet Treats");
        dessertMenu.add(new MenuItem("Apple Pie", "Homemade apple pie with ice cream", true, 4.99));
        dessertMenu.add(new MenuItem("Cheesecake", "New York style cheesecake", true, 5.49));

        // 将甜点菜单添加到午餐菜单中
        lunchMenu.add(dessertMenu);

        // 创建晚餐菜单
        MenuComponent dinnerMenu = new Menu("DINNER MENU", "Evening Specials");
        dinnerMenu.add(new MenuItem("Steak", "Grilled steak with mashed potatoes", false, 15.99));
        dinnerMenu.add(new MenuItem("Pasta", "Spaghetti with marinara sauce", true, 12.99));

        // 将各个菜单添加到顶级菜单中
        allMenus.add(breakfastMenu);
        allMenus.add(lunchMenu);
        allMenus.add(dinnerMenu);

        // 创建服务员并打印菜单
        Waitress waitress = new Waitress(allMenus);

        System.out.println("=== 完整菜单 ===");
        waitress.printMenu();

        System.out.println("\n=== 素食菜单 ===");
        waitress.printVegetarianMenu();
    }
}

