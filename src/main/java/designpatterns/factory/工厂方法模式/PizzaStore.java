package designpatterns.factory.工厂方法模式;

// 抽象创建者类
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    // 工厂方法 - 由子类实现
    protected abstract Pizza createPizza(String type);
}
