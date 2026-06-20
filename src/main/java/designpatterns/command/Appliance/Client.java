package designpatterns.command.Appliance;

public class Client {
    public static void main(String[] args) {
        // 1. 初始化所有家电
        Appliance light = new Light();
        Appliance fan = new Fan();
        Appliance fridge = new Fridge();
        Appliance tv = new TV();
        Appliance washer = new Washer();

        // 2. 为每个家电创建开关命令
        RemoteApp app = new RemoteApp();
        app.addCommand("客厅灯-开", new TurnOnCommand(light));
        app.addCommand("客厅灯-关", new TurnOffCommand(light));
        app.addCommand("风扇-开", new TurnOnCommand(fan));
        app.addCommand("风扇-关", new TurnOffCommand(fan));
        app.addCommand("冰箱-开", new TurnOnCommand(fridge));
        app.addCommand("电视-开", new TurnOnCommand(tv));
        app.addCommand("洗衣机-开", new TurnOnCommand(washer));

        // 3. 模拟用户操作
        app.pressButton("客厅灯-开");  // 输出：电灯已打开
        app.pressButton("风扇-开");    // 输出：风扇已启动
        app.pressButton("电视-开");    // 输出：电视已开启
        app.pressUndo();             // 撤销最后操作 → 电视关闭
        app.pressUndo();             // 撤销倒数第二次操作 → 风扇停止
    }
}