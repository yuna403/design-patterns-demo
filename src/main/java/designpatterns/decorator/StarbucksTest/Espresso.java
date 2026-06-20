package designpatterns.decorator.StarbucksTest;

class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 3.99;
    }
}

