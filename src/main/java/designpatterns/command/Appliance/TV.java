package designpatterns.command.Appliance;

// 电视机
public class TV implements Appliance {
    @Override
    public void on() { System.out.println("电视已开启"); }
    @Override
    public void off() { System.out.println("电视已关闭"); }
}
