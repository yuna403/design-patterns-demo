package designpatterns.decorator.StarbucksTest;

public class StarbucksTest {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        beverage = new Milk(beverage);
        beverage = new Mocha(beverage);
        beverage = new Whip(beverage);
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
    }
}
