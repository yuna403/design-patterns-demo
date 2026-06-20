package designpatterns.command.Appliance;

// 冰箱
public class Fridge implements Appliance {
    @Override
    public void on() { System.out.println("冰箱已通电"); }
    @Override
    public void off() { System.out.println("冰箱已断电"); }
}