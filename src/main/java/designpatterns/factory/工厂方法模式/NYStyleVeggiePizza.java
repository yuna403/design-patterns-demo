package designpatterns.factory.工厂方法模式;

public class NYStyleVeggiePizza extends Pizza {
    public NYStyleVeggiePizza() {
        name = "NY Style Veggie Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Shredded Mozzarella");
        toppings.add("Diced Onion");
        toppings.add("Sliced Mushrooms");
        toppings.add("Sliced Red Pepper");
        toppings.add("Sliced Black Olives");
    }
}
