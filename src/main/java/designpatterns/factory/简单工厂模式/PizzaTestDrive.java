package designpatterns.factory.简单工厂模式;

// 测试类
public class PizzaTestDrive {
    public static void main(String[] args) {
        // 创建工厂
        SimplePizzaFactory factory = new SimplePizzaFactory();
        // 创建Pizza店，注入工厂
        PizzaStore store = new PizzaStore(factory);

        // 订购各种Pizza
        Pizza pizza = store.orderPizza("cheese");
        System.out.println("We ordered a " + pizza.getName() + "\n");

        pizza = store.orderPizza("veggie");
        System.out.println("We ordered a " + pizza.getName() + "\n");

        pizza = store.orderPizza("pepperoni");
        System.out.println("We ordered a " + pizza.getName() + "\n");

        pizza = store.orderPizza("clam");
        System.out.println("We ordered a " + pizza.getName() + "\n");

        // 测试不存在的类型
        pizza = store.orderPizza("hawaiian");
    }
}
