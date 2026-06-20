package designpatterns.command.Appliance;

// 风扇
public class Fan implements Appliance {
    @Override
    public void on() { System.out.println("风扇已启动"); }
    @Override
    public void off() { System.out.println("风扇已停止"); }
}
