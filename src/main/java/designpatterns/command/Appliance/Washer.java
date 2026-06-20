package designpatterns.command.Appliance;

// 洗衣机
public class Washer implements Appliance {
    @Override
    public void on() { System.out.println("洗衣机开始工作"); }
    @Override
    public void off() { System.out.println("洗衣机停止工作"); }
}