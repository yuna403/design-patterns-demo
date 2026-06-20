package designpatterns.factory.工厂方法模式;

public class NYStyleClamPizza extends Pizza {
    public NYStyleClamPizza() {
        name = "NY Style Clam Pizza";
        dough = "Thin Crust Dough";
        sauce = "White Garlic Sauce";
        toppings.add("Clams");
        toppings.add("Grated Parmesan Cheese");
    }
}
