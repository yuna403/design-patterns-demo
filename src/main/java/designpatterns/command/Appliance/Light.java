package designpatterns.command.Appliance;

// 电灯
public class Light implements Appliance {
    @Override
    public void on() { System.out.println("电灯已打开"); }
    @Override
    public void off() { System.out.println("电灯已关闭"); }
}