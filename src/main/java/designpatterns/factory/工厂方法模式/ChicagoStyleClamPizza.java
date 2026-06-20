package designpatterns.factory.工厂方法模式;

public class ChicagoStyleClamPizza extends Pizza {
    public ChicagoStyleClamPizza() {
        name = "Chicago Style Clam Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        toppings.add("Frozen Clams from Chesapeake Bay");
        toppings.add("Shredded Mozzarella Cheese");
    }
}